package com.hb.aparatviewer.domain.usecase

import com.hb.aparatviewer.core.IoDispatcher
import com.hb.aparatviewer.core.usecase.UseCase
import com.hb.aparatviewer.data.repositoryImpl.VideoRepositoryImpl
import com.hb.aparatviewer.domain.model.VideoSummaryEntity
import com.hb.aparatviewer.domain.repository.VideoRepository
import kotlinx.coroutines.CoroutineDispatcher
import okhttp3.Dispatcher
import javax.inject.Inject

class GetVideoListUseCase @Inject constructor(
    private val videoRepository: VideoRepository,
    @IoDispatcher val ioDispatcher: CoroutineDispatcher
) : UseCase<Unit,List<VideoSummaryEntity>>(ioDispatcher) {
    override suspend fun execute(parameters: Unit): List<VideoSummaryEntity> {
        return videoRepository.getVideos()
    }
}