package com.hb.aparatviewer.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.hb.aparatviewer.domain.model.VideoEntity

@Dao
interface VideoDao {

    @Query("SELECT * FROM video ORDER BY recieveTimeMillis DESC")
    suspend fun getVideos(): List<VideoEntity>

    @Query("SELECT * FROM video WHERE uid = :uid")
    suspend fun getVideo(uid: String): VideoEntity

    @Insert(onConflict = REPLACE)
    suspend fun insetVideos(videos: List<VideoEntity>)

    @Query("SELECT * FROM video WHERE title LIKE :searchQuery OR sender_name LIKE :searchQuery")
    suspend fun searchDatabase(searchQuery: String): List<VideoEntity>

    @Insert(onConflict = REPLACE)
    fun insetVideo(video: VideoEntity)
}