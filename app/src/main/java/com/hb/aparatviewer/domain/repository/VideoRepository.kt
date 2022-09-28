package com.hb.aparatviewer.domain.repository

import android.provider.MediaStore
import com.hb.aparatviewer.domain.model.VideoSummaryEntity

interface VideoRepository {
    suspend fun getVideos():List<VideoSummaryEntity>
}