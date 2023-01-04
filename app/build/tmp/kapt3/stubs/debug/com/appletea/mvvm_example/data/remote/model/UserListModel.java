package com.appletea.mvvm_example.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/appletea/mvvm_example/data/remote/model/UserListModel;", "", "totalCount", "", "incompleteResults", "", "items", "Ljava/util/ArrayList;", "Lcom/appletea/mvvm_example/data/remote/model/UserListModel$SearchData;", "Lkotlin/collections/ArrayList;", "(IZLjava/util/ArrayList;)V", "getIncompleteResults", "()Z", "getItems", "()Ljava/util/ArrayList;", "getTotalCount", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "SearchData", "app_debug"})
public final class UserListModel {
    @com.google.gson.annotations.SerializedName(value = "total_count")
    private final int totalCount = 0;
    @com.google.gson.annotations.SerializedName(value = "incomplete_results")
    private final boolean incompleteResults = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "items")
    private final java.util.ArrayList<com.appletea.mvvm_example.data.remote.model.UserListModel.SearchData> items = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.appletea.mvvm_example.data.remote.model.UserListModel copy(int totalCount, boolean incompleteResults, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.appletea.mvvm_example.data.remote.model.UserListModel.SearchData> items) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public UserListModel(int totalCount, boolean incompleteResults, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.appletea.mvvm_example.data.remote.model.UserListModel.SearchData> items) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTotalCount() {
        return 0;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getIncompleteResults() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.appletea.mvvm_example.data.remote.model.UserListModel.SearchData> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.appletea.mvvm_example.data.remote.model.UserListModel.SearchData> getItems() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006&"}, d2 = {"Lcom/appletea/mvvm_example/data/remote/model/UserListModel$SearchData;", "Ljava/io/Serializable;", "id", "", "avatarUrl", "", "login", "likeFlag", "", "sectionHeader", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "setAvatarUrl", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getLikeFlag", "()Z", "setLikeFlag", "(Z)V", "getLogin", "setLogin", "getSectionHeader", "setSectionHeader", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "app_debug"})
    public static final class SearchData implements java.io.Serializable {
        @com.google.gson.annotations.SerializedName(value = "id")
        private int id;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "avatar_url")
        private java.lang.String avatarUrl;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "login")
        private java.lang.String login;
        private boolean likeFlag;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String sectionHeader;
        
        @org.jetbrains.annotations.NotNull()
        public final com.appletea.mvvm_example.data.remote.model.UserListModel.SearchData copy(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String avatarUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String login, boolean likeFlag, @org.jetbrains.annotations.NotNull()
        java.lang.String sectionHeader) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SearchData(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String avatarUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String login, boolean likeFlag, @org.jetbrains.annotations.NotNull()
        java.lang.String sectionHeader) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAvatarUrl() {
            return null;
        }
        
        public final void setAvatarUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLogin() {
            return null;
        }
        
        public final void setLogin(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getLikeFlag() {
            return false;
        }
        
        public final void setLikeFlag(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSectionHeader() {
            return null;
        }
        
        public final void setSectionHeader(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}