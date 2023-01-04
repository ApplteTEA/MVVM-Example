package com.appletea.mvvm_example.di

import com.appletea.mvvm_example.data.remote.UserApi
import com.appletea.mvvm_example.data.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideUsersRepository(userApi: UserApi) = UserRepository(userApi)
}