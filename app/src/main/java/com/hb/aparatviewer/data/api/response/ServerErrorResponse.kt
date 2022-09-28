package com.hb.aparatviewer.data.api.response

import kotlinx.serialization.Serializable

@Serializable
data class ServerErrorResponse(
    val message: String,
    val errors: Map<String, List<String>>? = null
)
