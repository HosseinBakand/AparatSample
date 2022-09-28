package com.hb.aparatviewer.ui.videolist

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
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
import com.hb.aparatviewer.core.usecase.data
import com.hb.aparatviewer.core.usecase.succeeded
import com.hb.aparatviewer.databinding.FragmentVideoListBinding
import com.hb.aparatviewer.ui.videolist.placeholder.PlaceholderContent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VideoListFragment : Fragment(), VideoItemRecyclerViewAdapter.ItemClickCallback {

    private val viewModel by viewModels<VideoListViewModel>()

    private var binding by autoCleared<FragmentVideoListBinding>()
    private lateinit var mAdapter : VideoItemRecyclerViewAdapter
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
            mAdapter  = VideoItemRecyclerViewAdapter(this@VideoListFragment)
            adapter = mAdapter

        }
        viewModel.videos.observe(viewLifecycleOwner){
            if(it.succeeded){
                mAdapter.submitList(it.data)
            }
            else{
                Log.e("TAGTAGTAG", it.data.toString())
            }
        }
    }

    override fun onClick() {
        val action =
            VideoListFragmentDirections.actionBlankFragmentToBlankFragment()
        findNavController().navigate(action)
    }
}