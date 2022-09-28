package com.hb.aparatviewer.ui.videolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.hb.aparatviewer.R
import com.hb.aparatviewer.core.autoCleared
import com.hb.aparatviewer.databinding.FragmentVideoListBinding
import com.hb.aparatviewer.ui.videolist.placeholder.PlaceholderContent

class VideoListFragment : Fragment(), VideoItemRecyclerViewAdapter.ItemClickCallback {

    private val viewModel by viewModels<VideoListViewModel>()

    private var binding by autoCleared<FragmentVideoListBinding>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVideoListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Set the adapter
        with(binding.rvVideoList) {
            layoutManager = LinearLayoutManager(context)

            adapter = VideoItemRecyclerViewAdapter(this@VideoListFragment)

        }
    }

    override fun onClick() {
        val action =
            VideoListFragmentDirections.actionBlankFragmentToBlankFragment()
        findNavController().navigate(action)
    }
}