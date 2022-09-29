package com.hb.aparatviewer.ui.videolist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hb.aparatviewer.domain.usecase.GetVideoListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.hb.aparatviewer.core.usecase.Result
import com.hb.aparatviewer.domain.model.VideoEntity

@HiltViewModel
class VideoListViewModel @Inject constructor(
    private val getVideoListUseCase: GetVideoListUseCase
) : ViewModel() {

    init {
        loadPlaces()
    }

    private var _videos = MutableLiveData<Result<List<VideoEntity>?>>()
    val videos: MutableLiveData<Result<List<VideoEntity>?>>
        get() = _videos

    private var _res: MutableLiveData<Int>? = null
    val res: MutableLiveData<Int>?
        get() = _res

    private fun loadPlaces() {
        viewModelScope.launch {
            getVideoListUseCase(Unit).let {
                _videos.value = it
            }
        }
    }

}