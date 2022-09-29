package com.hb.aparatviewer.data.repositoryImpl

import com.hb.aparatviewer.data.datasource.local.VideoLocalDataSource
import com.hb.aparatviewer.data.datasource.remote.VideoRemoteDataSource
import com.hb.aparatviewer.data.mappers.toVideoEntity
import com.hb.aparatviewer.domain.model.Category
import com.hb.aparatviewer.domain.model.VideoEntity
import com.hb.aparatviewer.domain.repository.VideoRepository
import java.net.UnknownHostException
import javax.inject.Inject

class VideoRepositoryImpl @Inject constructor(
    private val videoRemoteDataSource: VideoRemoteDataSource,
    private val videoLocalDataSource: VideoLocalDataSource
) : VideoRepository {
    override suspend fun getVideos(category: Category?): List<VideoEntity> {
        val videos = try {
            videoRemoteDataSource.getAllVideos(category = category).map { it.toVideoEntity() }.also {
                videoLocalDataSource.insertVideos(it)
            }
        } catch (ignore: UnknownHostException) {
            videoLocalDataSource.getAllVideos()
        }
        return videos
    }
}