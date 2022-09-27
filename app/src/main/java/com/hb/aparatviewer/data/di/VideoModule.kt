package com.hb.aparatviewer.data.di

import com.hb.aparatviewer.data.api.VideoApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class VideoModule {

    companion object {

        @Provides
        fun provideAuthenticationApi(
            retrofit: Retrofit
        ): VideoApi = retrofit.create(VideoApi::class.java)
    }
}