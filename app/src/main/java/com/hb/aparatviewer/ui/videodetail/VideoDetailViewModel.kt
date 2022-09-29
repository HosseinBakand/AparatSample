package com.hb.aparatviewer.ui.videodetail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.hb.aparatviewer.core.usecase.Result
import com.hb.aparatviewer.domain.model.Category
import com.hb.aparatviewer.domain.model.VideoEntity
import com.hb.aparatviewer.domain.usecase.GetVideoDetailUseCase

@HiltViewModel
class VideoDetailViewModel @Inject constructor(
    private val getVideoUseCase: GetVideoDetailUseCase
) : ViewModel() {

    private var _video = MutableLiveData<Result<VideoEntity?>>()
    val video: MutableLiveData<Result<VideoEntity?>>
        get() = _video

    fun loadVideoDetail(videoId:String) {
        viewModelScope.launch {
            getVideoUseCase(videoId).let {
                _video.value = it
            }
        }
    }

}