package com.hb.aparatviewer.core

import com.hb.aparatviewer.data.api.response.ServerErrorResponse

data class ServerException(
    val statusCode: Int,
    val response: ServerErrorResponse
) : RuntimeException("HTTP $statusCode ${response.message}")
