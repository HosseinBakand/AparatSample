package com.hb.aparatviewer.data.datasource.local

import com.hb.aparatviewer.data.database.VideoDao
import com.hb.aparatviewer.domain.model.Category
import com.hb.aparatviewer.domain.model.VideoEntity
import javax.inject.Inject

class VideoLocalDataSourceImpl @Inject constructor(
    private val videoDao: VideoDao
) : VideoLocalDataSource {
    override suspend fun getAllVideos(category: Category?): List<VideoEntity> {
        return videoDao.getVideos()
    }

    override suspend fun insertVideos(videos: List<VideoEntity>) {
        videoDao.insetVideos(videos)
    }

    override suspend fun searchVideo(text: String): List<VideoEntity> {
        return videoDao.searchDatabase("%$text%")
    }
}