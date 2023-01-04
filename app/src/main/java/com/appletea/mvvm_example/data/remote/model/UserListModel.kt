package com.appletea.mvvm_example.data.remote.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UserListModel(
    @SerializedName("total_count") val totalCount: Int,                     //## 총 갯수
    @SerializedName("incomplete_results") val incompleteResults: Boolean,   //## 추가 페이지 존재 유무?
    @SerializedName("items") val items: ArrayList<SearchData>               //## items
) {
    data class SearchData(
        @SerializedName("id") var id: Int,                                  //## ID
        @SerializedName("avatar_url") var avatarUrl: String,                //## Avatar URL
        @SerializedName("login") var login: String,                         //## 로그인 아이디
        var likeFlag: Boolean,                                              //## 좋아요 유무
        var sectionHeader: String                                           //## Section Header
    ) : Serializable
}