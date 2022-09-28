package com.hb.aparatviewer.data.datasource.remote

import com.hb.aparatviewer.core.ServerException
import com.hb.aparatviewer.data.api.VideoApi
import com.hb.aparatviewer.data.api.response.ServerErrorResponse
import com.hb.aparatviewer.data.mappers.toVideoSummaryEntity
import com.hb.aparatviewer.domain.model.VideoSummaryEntity
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import retrofit2.HttpException
import javax.inject.Inject

class VideoRemoteDataSourceImpl @Inject constructor(
    private val videoApi: VideoApi
): VideoRemoteDataSource {
    override suspend fun getVideos(): List<VideoSummaryEntity> {
        val response = videoApi.getVideoByUser("alooty",10)
        if (!response.isSuccessful) {
            val errorJson = response.errorBody()?.string()
            if (errorJson.isNullOrBlank()) {
                throw HttpException(response)
            } else {
                val errorResponse = Json.decodeFromString<ServerErrorResponse>(errorJson)
                throw ServerException(statusCode = response.code(), response = errorResponse)
            }
        }
        return response.body()!!.videobyuser.map { it.toVideoSummaryEntity() }
    }

}