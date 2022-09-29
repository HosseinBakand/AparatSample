package com.hb.aparatviewer.data.mappers

import com.hb.aparatviewer.core.nowMillis
import com.hb.aparatviewer.data.api.response.VideoDetailResponse
import com.hb.aparatviewer.data.api.response.VideoSummaryResponse
import com.hb.aparatviewer.domain.model.*

fun VideoDetailResponse.toVideoEntity() = VideoEntity(
    id = id,
    title = title,
    username = username,
    userid = userid,
    visit_cnt = visit_cnt,
    uid = uid,
    sender_name = sender_name,
    big_poster = big_poster,
    small_poster = small_poster,
    profilePhoto = profilePhoto,
    duration = duration,
    frame = frame,
    description = sdate,
    cat_id = cat_id,
    cat_name = cat_name,
    like_cnt = like_cnt,
    recieveTimeMillis = nowMillis
)