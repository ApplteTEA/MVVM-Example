package com.appletea.mvvm_example.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/appletea/mvvm_example/data/remote/UserApi;", "", "getUsersList", "Lretrofit2/Response;", "Lcom/appletea/mvvm_example/data/remote/model/UserListModel;", "searchName", "", "perPage", "", "page", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/users")
    public abstract java.lang.Object getUsersList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchName, @retrofit2.http.Query(value = "per_page")
    int perPage, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.appletea.mvvm_example.data.remote.model.UserListModel>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}