package com.hb.aparatviewer.data.api.response

import kotlinx.serialization.Serializable

@Serializable
data class AparatListResponse(
//    val mostviewedvideos: List<VideoSummary>?=null,
    val videobyuser: List<VideoSummaryResponse>,
//    val mostviewedvideos3: List<VideoSummary>,
//    val mostviewedvideos4: List<VideoSummary>,
//    val mostviewedvideos5: List<VideoSummary>,
    val ui: UI
)

@Serializable
data class UI(
    val pagingForward: String? = null,
    val pagingBack: String? = null
)
