package com.hb.aparatviewer.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "video")
data class VideoEntity(
    @PrimaryKey
    val id: Int,
    val title: String,
    val username: String,
    val userid: Int,
    val visit_cnt: Int,
    val uid: String,
    val sender_name: String,
    val big_poster: String,
    val small_poster: String,
    val profilePhoto: String,
    val duration: Int,
    val frame: String,
    val description: String? = null,
    val cat_id: Int? = null,
    val cat_name: String? = null,
    val like_cnt: Int? = null,
    val recieveTimeMillis: Long,
)