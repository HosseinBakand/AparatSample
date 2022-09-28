package com.hb.aparatviewer.data.mappers

import com.hb.aparatviewer.data.api.response.VideoSummaryResponse
import com.hb.aparatviewer.domain.model.*

fun VideoSummaryResponse.toVideoSummaryEntity() = VideoSummaryEntity(
    id = id,
    title = title,
    username = username,
    userid = userid,
    visitCnt = visitCnt,
    uid = uid,
    isHidden = isHidden,
    process = Process.Done,
    senderName = SenderName.برنامهنویسی,
    bigPoster = bigPoster,
    smallPoster = smallPoster,
    profilePhoto = profilePhoto,
    duration = duration,
    sdate = sdate,
    createDate = createDate,
    sdateTimediff = sdateTimediff,
    frame = frame,
    official = Official.Yes,
    autoplay = autoplay,
    videoDateStatus = VideoDateStatus.Notset,
    the360D = the360D,
    deleteurl = deleteurl,
)