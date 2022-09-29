package com.hb.aparatviewer.domain.usecase

import com.hb.aparatviewer.core.IoDispatcher
import com.hb.aparatviewer.core.usecase.UseCase
import com.hb.aparatviewer.domain.model.Category
import com.hb.aparatviewer.domain.model.VideoEntity
import com.hb.aparatviewer.domain.repository.VideoRepository
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class GetVideoListUseCase @Inject constructor(
    private val videoRepository: VideoRepository,
    @IoDispatcher val ioDispatcher: CoroutineDispatcher
) : UseCase<Category, List<VideoEntity>>(ioDispatcher) {
    override suspend fun execute(parameters: Category): List<VideoEntity> {
        return if (parameters.id == 1) videoRepository.getVideos()
        else videoRepository.getVideos(parameters)
    }
}