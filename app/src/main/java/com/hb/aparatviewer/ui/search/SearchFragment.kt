package com.hb.aparatviewer.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hb.aparatviewer.R
import com.hb.aparatviewer.core.autoCleared
import com.hb.aparatviewer.core.usecase.data
import com.hb.aparatviewer.core.usecase.succeeded
import com.hb.aparatviewer.databinding.FragmentSearchBinding
import com.hb.aparatviewer.databinding.FragmentVideoListBinding
import com.hb.aparatviewer.ui.videolist.VideoItemRecyclerViewAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : Fragment(), VideoItemRecyclerViewAdapter.ItemClickCallback {

    private val viewModel by viewModels<VideoSearchViewModel>()
    private var binding by autoCleared<FragmentSearchBinding>()
    private var videoAdapter by autoCleared<VideoItemRecyclerViewAdapter>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(layoutInflater, container, false)
        binding.search = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding.rvVideoList) {
            layoutManager = LinearLayoutManager(context)
            videoAdapter = VideoItemRecyclerViewAdapter(this@SearchFragment)
            adapter = videoAdapter
        }
        viewModel.videoSearchResult.observe(viewLifecycleOwner) {
            if (it?.succeeded == true) {
                videoAdapter.submitList(it.data)
            } else {
            }
        }

//        binding.btnCancel.setOnClickListener {
//            findNavController().navigateUp()
//        }

    }

    override fun onClick() {
        TODO("Not yet implemented")
    }

}