package com.hb.aparatviewer.ui.videodetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.hb.aparatviewer.core.autoCleared
import com.hb.aparatviewer.core.usecase.data
import com.hb.aparatviewer.core.usecase.succeeded
import com.hb.aparatviewer.databinding.FragmentVideoDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VideoDetailFragment : Fragment() {
    private val args: VideoDetailFragmentArgs by navArgs()

    private var binding by autoCleared<FragmentVideoDetailBinding>()
    private val viewModel by viewModels<VideoDetailViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVideoDetailBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Receive the arguments in a variable
        val videoId = args.videoId
        viewModel.loadVideoDetail(videoId)
        viewModel.video.observe(viewLifecycleOwner) {
            if (it?.succeeded == true) {
                binding.videoDetail = it.data
            } else {
            }
        }
        binding.tvVideoTitle.isSelected = true;
    }

}