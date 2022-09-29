package com.hb.aparatviewer.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hb.aparatviewer.domain.model.VideoEntity

@Database(entities = [VideoEntity::class], version = 1)
abstract class AparatViewerDataBase : RoomDatabase() {
    abstract fun getVideoDao(): VideoDao
}