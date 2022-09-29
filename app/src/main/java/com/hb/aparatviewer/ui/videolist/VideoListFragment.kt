package com.hb.aparatviewer.ui.videolist

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.hb.aparatviewer.core.autoCleared
import com.hb.aparatviewer.core.usecase.data
import com.hb.aparatviewer.core.usecase.succeeded
import com.hb.aparatviewer.databinding.FragmentVideoListBinding
import com.hb.aparatviewer.domain.model.Category
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VideoListFragment : Fragment(), VideoItemRecyclerViewAdapter.ItemClickCallback,
    CategoryItemRecyclerViewAdapter.ItemClickCallback {

    private val viewModel by viewModels<VideoListViewModel>()

    private var binding by autoCleared<FragmentVideoListBinding>()
    private var videoAdapter by autoCleared<VideoItemRecyclerViewAdapter>()
    private var categoryAdapter by autoCleared<CategoryItemRecyclerViewAdapter>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVideoListBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialVideoRecycleView()
        initialCategoryRecycleView()
        // Set the adapter

        binding.ivSearch.setOnClickListener {
            val action =
                VideoListFragmentDirections.actionVideoListFragmentToSearchFragment()
            findNavController().navigate(action)
        }
    }

    private fun initialVideoRecycleView() {
        with(binding.rvVideoList) {
            layoutManager = LinearLayoutManager(context)
            videoAdapter = VideoItemRecyclerViewAdapter(this@VideoListFragment)
            adapter = videoAdapter
        }
        viewModel.videos.observe(viewLifecycleOwner) {
            if (it.succeeded) {
                videoAdapter.submitList(it.data)

                binding.rvVideoList.scrollToPosition(0)
            }
        }
    }
    private fun initialCategoryRecycleView() {
        with(binding.rvCategoryList) {
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            categoryAdapter = CategoryItemRecyclerViewAdapter(this@VideoListFragment)
            adapter = categoryAdapter
        }
        viewModel.categories.observe(viewLifecycleOwner) {
            categoryAdapter.submitList(it)
        }
    }

    override fun onClick(videoId: String) {
        val action =
            VideoListFragmentDirections.actionVideoListFragmentToVideoDetailFragment(videoId)
        findNavController().navigate(action)
    }

    override fun onCategoryClick(category: Category) {
        viewModel.selectCategory(category)
    }

}