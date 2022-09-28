package com.hb.aparatviewer.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "video_summary")
data class VideoSummaryEntity(
    @PrimaryKey
    val id: String,
    val title: String,
    val username: String,
    val userid: String,
    val visitCnt: Long,
    val uid: String,
    val isHidden: Boolean,
    val process: Process,
    val senderName: SenderName,
    val bigPoster: String,
    val smallPoster: String,
    val profilePhoto: String,
    val duration: Long,
    val sdate: String,
    val createDate: String,
    val sdateTimediff: Long,
    val frame: String,
    val official: Official,
    val autoplay: Boolean,
    val videoDateStatus: VideoDateStatus,
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

enum class VideoDateStatus(val value: String) {
    Notset("notset");

    companion object {
        public fun fromValue(value: String): VideoDateStatus = when (value) {
            "notset" -> Notset
            else     -> throw IllegalArgumentException()
        }
    }
}
