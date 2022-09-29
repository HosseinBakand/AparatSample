package com.hb.aparatviewer.data.datasource.local

import com.hb.aparatviewer.domain.model.Category
import com.hb.aparatviewer.domain.model.VideoEntity

interface VideoLocalDataSource {
    suspend fun getAllVideos(category: Category? = null):List<VideoEntity>
    suspend fun insertVideos(videos:List<VideoEntity>)
    suspend fun searchVideo(text : String): List<VideoEntity>
    suspend fun insertVideo(video: VideoEntity)
    suspend fun getVideo(videoId : String): VideoEntity
}