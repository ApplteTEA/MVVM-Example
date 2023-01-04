package com.appletea.mvvm_example.di

import com.appletea.mvvm_example.data.remote.UserApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun provideUsersApiService(retrofit: Retrofit): UserApi = retrofit.create(UserApi::class.java)
}