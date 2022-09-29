package com.hb.aparatviewer.core

import java.util.*

val nowMillis: Long
    get() = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        .timeInMillis