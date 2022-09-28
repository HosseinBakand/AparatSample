package com.hb.aparatviewer.data.repositoryImpl

import com.hb.aparatviewer.data.datasource.remote.VideoRemoteDataSource
import com.hb.aparatviewer.domain.model.VideoSummaryEntity
import com.hb.aparatviewer.domain.repository.VideoRepository
import javax.inject.Inject

class VideoRepositoryImpl @Inject constructor(
    private val videoRemoteDataSource: VideoRemoteDataSource
) : VideoRepository {
    override suspend fun getVideos(): List<VideoSummaryEntity> {
        return videoRemoteDataSource.getVideos()
    }
}