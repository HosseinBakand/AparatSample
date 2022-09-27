package com.hb.aparatviewer.data.api.response

import kotlinx.serialization.Serializable


@Serializable
data class AparatVideoResponse(
    val video: VideoDetailResponse
)