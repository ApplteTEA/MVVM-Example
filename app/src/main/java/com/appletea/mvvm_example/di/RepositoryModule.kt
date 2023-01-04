package com.appletea.mvvm_example.di

import com.appletea.mvvm_example.data.remote.UserApi
import com.appletea.mvvm_example.data.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
//@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @ActivityRetainedScoped
//    @Singleton
    fun provideUsersRepository(userApi: UserApi) = UserRepository(userApi)
}