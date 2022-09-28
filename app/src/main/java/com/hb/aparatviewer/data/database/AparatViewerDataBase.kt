package com.hb.aparatviewer.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hb.aparatviewer.domain.model.VideoDetailEntity
import com.hb.aparatviewer.domain.model.VideoSummaryEntity

@Database(entities = [VideoSummaryEntity::class, VideoDetailEntity::class], version = 1)
abstract class AparatViewerDataBase : RoomDatabase() {
//    abstract fun reminderDao(): ReminderDao
}