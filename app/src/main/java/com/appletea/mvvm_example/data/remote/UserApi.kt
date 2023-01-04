package com.appletea.mvvm_example.data.remote

import com.appletea.mvvm_example.data.remote.model.UserListModel
import com.appletea.mvvm_example.utils.ApiInfo
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApi {

    @GET(ApiInfo.USER_LIST_API)
    suspend fun getUsersList(
        @Query("q") searchName: String,
        @Query("per_page") perPage: Int = 100,
        @Query("page") page: Int = 1
    ): Response<UserListModel>
}