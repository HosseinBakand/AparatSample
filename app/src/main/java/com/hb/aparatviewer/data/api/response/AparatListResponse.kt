package com.hb.aparatviewer.data.api.response

import com.hb.aparatviewer.domain.model.VideoSummary
import kotlinx.serialization.Serializable

@Serializable
data class AparatListResponse(
//    val mostviewedvideos: List<VideoSummary>?=null,
    val videobyuser: List<VideoSummary>,
//    val mostviewedvideos3: List<VideoSummary>,
//    val mostviewedvideos4: List<VideoSummary>,
//    val mostviewedvideos5: List<VideoSummary>,
    val ui: UI
)

@Serializable
data class UI(
    val pagingForward: String,
    val pagingBack: String
)
