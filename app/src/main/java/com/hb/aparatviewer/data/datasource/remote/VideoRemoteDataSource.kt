package com.hb.aparatviewer.data.datasource.remote

import com.hb.aparatviewer.data.api.response.VideoSummaryResponse

interface VideoRemoteDataSource {
    suspend fun getVideos():List<VideoSummaryResponse>
}