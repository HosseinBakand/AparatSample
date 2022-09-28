package com.hb.aparatviewer.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoDetailEntity(
    val id: Int,
    val title: String,
    val username: String,
    val userid: Int,
    val visit_cnt: Int,
    val uid: String,
    val process: String,
    val sender_name: String,
    val big_poster: String,
    val small_poster: String,
    val profilePhoto: String,
    val duration: Int,
    val sdate: String,
    val frame: String,
    val official: String,
    val tags: List<Tag>,
    val description: String,
    val cat_id: Int,
    val cat_name: String,
    val autoplay: Boolean,
    @SerialName("360d")
    val d360d    : Boolean,
    val has_comment: String,
    val has_comment_txt: String,
    val size: Int,
    val watch_action: Type,
    val cost_type: Type,
    val can_download: Boolean,
    val like_cnt: Int,
)

@Serializable
data class Type (
    val type: String
)

@Serializable
data class Tag (
    val name: String,
    val cnt: String
)