package com.appletea.mvvm_example.data.repository

import com.appletea.mvvm_example.data.remote.UserApi
import javax.inject.Inject

class UserRepository @Inject constructor(private val userApi: UserApi) {

    suspend fun getUsersList(searchText: String) = userApi.getUsersList(searchText)
}