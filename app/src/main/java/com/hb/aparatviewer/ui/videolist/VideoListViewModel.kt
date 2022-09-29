package com.hb.aparatviewer.ui.videolist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hb.aparatviewer.domain.usecase.GetVideoListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.hb.aparatviewer.core.usecase.Result
import com.hb.aparatviewer.domain.model.Category
import com.hb.aparatviewer.domain.model.VideoEntity
import com.hb.aparatviewer.ui.model.CategoryUiModel

@HiltViewModel
class VideoListViewModel @Inject constructor(
    private val getVideoListUseCase: GetVideoListUseCase
) : ViewModel() {

    private var selectedCategory = Category.All

    private var _videos = MutableLiveData<Result<List<VideoEntity>?>>()
    val videos: MutableLiveData<Result<List<VideoEntity>?>>
        get() = _videos

    private var _categories = MutableLiveData<List<CategoryUiModel>>()
    val categories: MutableLiveData<List<CategoryUiModel>>
        get() = _categories

    private var _isLoading = MutableLiveData(false)
    val isLoading: MutableLiveData<Boolean>
        get() = _isLoading



    init {
        loadPlaces()
        initCategoryList()
    }

    private fun loadPlaces() {
        viewModelScope.launch {
            getVideoListUseCase(selectedCategory).let {
                _videos.value = it
            }
        }
    }

    private fun initCategoryList() {
        _categories.value = Category.values().map {
            if (it.id == 1) {
                CategoryUiModel(it,true)
            }else{
                CategoryUiModel(it)
            }
        }
    }

    fun selectCategory(category: Category) {
        _categories.value = Category.values().map {
            if (it.id == category.id) {
                CategoryUiModel(it,true)
            }else{
                CategoryUiModel(it)
            }
        }
        selectedCategory = category
        loadPlaces()
    }

}