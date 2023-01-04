package com.appletea.mvvm_example.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/appletea/mvvm_example/di/RepositoryModule;", "", "()V", "provideUsersRepository", "Lcom/appletea/mvvm_example/data/repository/UserRepository;", "userApi", "Lcom/appletea/mvvm_example/data/remote/UserApi;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.appletea.mvvm_example.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityRetainedScoped()
    @dagger.Provides()
    public final com.appletea.mvvm_example.data.repository.UserRepository provideUsersRepository(@org.jetbrains.annotations.NotNull()
    com.appletea.mvvm_example.data.remote.UserApi userApi) {
        return null;
    }
}