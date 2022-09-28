package com.hb.aparatviewer.data.datasource.remote

import com.hb.aparatviewer.domain.model.VideoSummaryEntity

interface VideoRemoteDataSource {
    suspend fun getVideos():List<VideoSummaryEntity>
}