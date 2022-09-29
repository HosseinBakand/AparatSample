package com.hb.aparatviewer.data.api.response

import kotlinx.serialization.Serializable

@Serializable
data class AparatCategoryListResponse(
    val categoryvideos: List<VideoSummaryResponse>,
    val ui: UI
)
@Serializable
data class AparatSearchListResponse(
    val categoryVideos: List<VideoSummaryResponse>,
    val ui: UI
)

@Serializable
data class UI(
    val pagingForward: String? = null,
    val pagingBack: String? = null
)
