package com.hb.aparatviewer.data.api.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoSummaryResponse(
    val id: String,
    val title: String,
    val username: Username,
    val userid: String,

    @SerialName( "visit_cnt")
    val visitCnt: Long,

    val uid: String,
    val isHidden: Boolean,
    val process: Process,

    @SerialName("sender_name")
    val senderName: SenderName,

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
    val official: Official,
    val autoplay: Boolean,

    @SerialName("video_date_status")
    val videoDateStatus: VideoDateStatus,

    @SerialName("360d")
    val the360D: Boolean,

    val deleteurl: String
)


enum class Official(val value: String) {
    No("no"),
    Yes("yes");

    companion object {
        public fun fromValue(value: String): Official = when (value) {
            "no"  -> No
            "yes" -> Yes
            else  -> throw IllegalArgumentException()
        }
    }
}

enum class Process(val value: String) {
    Done("done");

    companion object {
        public fun fromValue(value: String): Process = when (value) {
            "done" -> Done
            else   -> throw IllegalArgumentException()
        }
    }
}

enum class SenderName(val value: String) {
    BaahamCampaign("baaham.campaign"),
    برنامهنویسی("برنامه نویسی");

    companion object {
        public fun fromValue(value: String): SenderName = when (value) {
            "baaham.campaign" -> BaahamCampaign
            "برنامه نویسی"    -> برنامهنویسی
            else              -> throw IllegalArgumentException()
        }
    }
}

enum class Username(val value: String) {
    Alooty("alooty"),
    BaahamCampaign("baaham.campaign");

    companion object {
        public fun fromValue(value: String): Username = when (value) {
            "alooty"          -> Alooty
            "baaham.campaign" -> BaahamCampaign
            else              -> throw IllegalArgumentException()
        }
    }
}

enum class VideoDateStatus(val value: String) {
    Notset("notset");

    companion object {
        public fun fromValue(value: String): VideoDateStatus = when (value) {
            "notset" -> Notset
            else     -> throw IllegalArgumentException()
        }
    }
}
