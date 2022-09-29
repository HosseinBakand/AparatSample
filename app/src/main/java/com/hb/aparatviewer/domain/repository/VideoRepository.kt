package com.hb.aparatviewer.domain.repository

import com.hb.aparatviewer.domain.model.Category
import com.hb.aparatviewer.domain.model.VideoEntity

interface VideoRepository {
    suspend fun getVideos(category: Category?=null):List<VideoEntity>
}