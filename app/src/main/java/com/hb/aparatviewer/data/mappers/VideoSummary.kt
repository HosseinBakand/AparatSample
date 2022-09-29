package com.hb.aparatviewer.data.mappers

import com.hb.aparatviewer.data.api.response.VideoSummaryResponse
import com.hb.aparatviewer.domain.model.*

fun VideoSummaryResponse.toVideoEntity() = VideoEntity(
    id = id,
    title = title,
    username = username,
    userid = userid,
    visit_cnt = visitCnt,
    uid = uid,
    sender_name = senderName,
    big_poster = bigPoster,
    small_poster = smallPoster,
    profilePhoto = profilePhoto,
    duration = duration,
    frame = frame,
)