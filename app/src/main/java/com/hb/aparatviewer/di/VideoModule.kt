package com.hb.aparatviewer.di

import com.hb.aparatviewer.data.api.VideoApi
import com.hb.aparatviewer.data.datasource.remote.VideoRemoteDataSource
import com.hb.aparatviewer.data.datasource.remote.VideoRemoteDataSourceImpl
import com.hb.aparatviewer.data.repositoryImpl.VideoRepositoryImpl
import com.hb.aparatviewer.domain.repository.VideoRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
abstract class VideoModule {

    @Binds
    abstract fun bindVideoRepository(impl: VideoRepositoryImpl): VideoRepository

    @Binds
    abstract fun bindVideoRemoteDataSource(dataSource: VideoRemoteDataSourceImpl): VideoRemoteDataSource

//    @Binds
//    abstract fun bindVideoLocalDataSource(dataSource: VideoLocalDataSourceImpl): VideoLocalDataSource
    companion object {

        @Provides
        fun provideAuthenticationApi(
            retrofit: Retrofit
        ): VideoApi = retrofit.create(VideoApi::class.java)
    }
}