package com.hb.aparatviewer.data.repositoryImpl

import com.hb.aparatviewer.NEW_ITEM_MILLIS
import com.hb.aparatviewer.core.nowMillis
import com.hb.aparatviewer.data.datasource.local.VideoLocalDataSource
import com.hb.aparatviewer.data.datasource.remote.VideoRemoteDataSource
import com.hb.aparatviewer.data.mappers.toVideoEntity
import com.hb.aparatviewer.domain.model.Category
import com.hb.aparatviewer.domain.model.VideoEntity
import com.hb.aparatviewer.domain.repository.VideoRepository
import java.net.UnknownHostException
import javax.inject.Inject
class VideoRepositoryImpl @Inject constructor(
    private val videoRemoteDataSource: VideoRemoteDataSource,
    private val videoLocalDataSource: VideoLocalDataSource
) : VideoRepository {
    override suspend fun getVideos(category: Category?): List<VideoEntity> {
        val videos = try {

            val cashVideo = videoLocalDataSource.getAllVideos()
            if (category !=null || cashVideo.isEmpty() || shouldFetch(cashVideo.first().recieveTimeMillis)){
                videoRemoteDataSource.getAllVideos(category = category).map { it.toVideoEntity() }.also {
                    videoLocalDataSource.insertVideos(it)
                }
            }else{
                cashVideo
            }
        } catch (ignore: UnknownHostException) {
            videoLocalDataSource.getAllVideos()
        }
        return videos
    }

    override suspend fun searchVideos(text: String): List<VideoEntity> {
        val videos = try {
                videoRemoteDataSource.searchVideos(text = text).map { it.toVideoEntity() }.also {
                    videoLocalDataSource.insertVideos(it)
                }
            } catch (ignore: UnknownHostException) {
            videoLocalDataSource.searchVideo(text)
        }
        return videos
    }

    override suspend fun getVideo(videoId : String): VideoEntity {
        val videos = try {
            val cashVideo = videoLocalDataSource.getVideo(videoId)
            if (shouldFetch(cashVideo.recieveTimeMillis)){
                videoRemoteDataSource.getVideo(videoId).toVideoEntity().also {
                    videoLocalDataSource.insertVideo(it)
                }
            }else{
                cashVideo
            }

        } catch (ignore: UnknownHostException) {
            videoLocalDataSource.getVideo(videoId)
        }
        return videos
    }

    private fun shouldFetch(timeMillis : Long):Boolean{
        return timeMillis + NEW_ITEM_MILLIS < nowMillis
    }
}