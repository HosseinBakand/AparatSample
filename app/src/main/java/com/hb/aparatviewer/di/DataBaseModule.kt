package com.hb.aparatviewer.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.hb.aparatviewer.data.database.AparatViewerDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {
    private var db: AparatViewerDataBase? = null
    private const val databaseName = "aparat_viewer.db"

    fun getInstance(): AparatViewerDataBase? {
        return db
    }

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AparatViewerDataBase =
        Room.databaseBuilder(context, AparatViewerDataBase::class.java, databaseName)
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

//    @Singleton
//    @Provides
//    fun provideFoodDao(db: AparatViewerDataBase): FoodDao = db.getFoodDao()

}