package com.hb.aparatviewer.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hb.aparatviewer.domain.model.VideoEntity
import com.hb.aparatviewer.domain.usecase.SearchVideoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import com.hb.aparatviewer.core.usecase.Result
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class VideoSearchViewModel @Inject constructor(
    private val searchVideosUseCase:SearchVideoUseCase
) : ViewModel(), OnSearchQueryTextChanged {

    private val _videoSearchResult = MutableLiveData<Result<List<VideoEntity>>?>()
    val videoSearchResult: LiveData<Result<List<VideoEntity>>?>
        get() = _videoSearchResult

    private var searchJob: Job? = null

    private var latestQuery: String = ""

    override fun search(query: String) {
        searchJob?.cancel()
        latestQuery = query
        searchJob = viewModelScope.launch {
            delay(500)
            searchVideosUseCase(query).let {
                _videoSearchResult.value  = it
            }
        }
    }
}

interface OnSearchQueryTextChanged {
    fun search(query: String)
}
