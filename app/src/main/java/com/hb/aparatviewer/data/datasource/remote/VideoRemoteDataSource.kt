package com.hb.aparatviewer.data.datasource.remote

import com.hb.aparatviewer.data.api.response.VideoDetailResponse
import com.hb.aparatviewer.data.api.response.VideoSummaryResponse
import com.hb.aparatviewer.domain.model.Category

interface VideoRemoteDataSource {
    suspend fun getAllVideos(category: Category?=null):List<VideoSummaryResponse>
    suspend fun searchVideos(text: String): List<VideoSummaryResponse>
    suspend fun getVideo(videoId : String): VideoDetailResponse
}