package com.hb.aparatviewer.data.api.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoSummaryResponse(
    val id: String,
    val title: String,
    val username: String,
    val userid: String,
    @SerialName("visit_cnt")
    val visitCnt: Long,
    val uid: String,
    val isHidden: Boolean,
    val process: String,
    @SerialName("sender_name")
    val senderName: String,
    @SerialName("big_poster")
    val bigPoster: String,
    @SerialName("small_poster")
    val smallPoster: String,
    val profilePhoto: String,
    val duration: Long,
    val sdate: String,
    @SerialName("create_date")
    val createDate: String,
    @SerialName("sdate_timediff")
    val sdateTimediff: Long,
    val frame: String,
    val official: String,
    val autoplay: Boolean,
    @SerialName("video_date_status")
    val videoDateStatus: String,
    @SerialName("360d")
    val the360D: Boolean,
    val deleteurl: String
)

