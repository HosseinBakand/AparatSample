package com.hb.aparatviewer.data.datasource.remote

import com.hb.aparatviewer.LOADING_COUNT
import com.hb.aparatviewer.core.ServerException
import com.hb.aparatviewer.data.api.VideoApi
import com.hb.aparatviewer.data.api.response.ServerErrorResponse
import com.hb.aparatviewer.data.api.response.VideoDetailResponse
import com.hb.aparatviewer.data.api.response.VideoSummaryResponse
import com.hb.aparatviewer.domain.model.Category
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import retrofit2.HttpException
import javax.inject.Inject

class VideoRemoteDataSourceImpl @Inject constructor(
    private val videoApi: VideoApi
) : VideoRemoteDataSource {
    override suspend fun getAllVideos(category: Category?): List<VideoSummaryResponse> {
        val response =
            category?.let { videoApi.getCategoryVideos(LOADING_COUNT, cat = it.id.toString()) }
                ?: videoApi.getCategoryVideos(LOADING_COUNT)
        if (!response.isSuccessful) {
            val errorJson = response.errorBody()?.string()
            if (errorJson.isNullOrBlank()) {
                throw HttpException(response)
            } else {
                val errorResponse = Json.decodeFromString<ServerErrorResponse>(errorJson)
                throw ServerException(statusCode = response.code(), response = errorResponse)
            }
        }
        return response.body()!!.categoryvideos
    }

    override suspend fun searchVideos(text: String): List<VideoSummaryResponse> {
        val response =
            videoApi.getVideoBySearch(perpage = LOADING_COUNT, text = text)
        if (!response.isSuccessful) {
            val errorJson = response.errorBody()?.string()
            if (errorJson.isNullOrBlank()) {
                throw HttpException(response)
            } else {
                val errorResponse = Json.decodeFromString<ServerErrorResponse>(errorJson)
                throw ServerException(statusCode = response.code(), response = errorResponse)
            }
        }
        return response.body()!!.videobysearch
    }

    override suspend fun getVideo(videoId : String): VideoDetailResponse {
        val response = videoApi.getVideo(uid = videoId)
        if (!response.isSuccessful) {
            val errorJson = response.errorBody()?.string()
            if (errorJson.isNullOrBlank()) {
                throw HttpException(response)
            } else {
                val errorResponse = Json.decodeFromString<ServerErrorResponse>(errorJson)
                throw ServerException(statusCode = response.code(), response = errorResponse)
            }
        }
        return response.body()!!.video
    }
}