package com.appletea.mvvm_example.ui.view.main;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/appletea/mvvm_example/ui/view/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/appletea/mvvm_example/data/repository/UserRepository;", "(Lcom/appletea/mvvm_example/data/repository/UserRepository;)V", "_userList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/appletea/mvvm_example/data/remote/model/UserListModel;", "userList", "Landroidx/lifecycle/LiveData;", "getUserList", "()Landroidx/lifecycle/LiveData;", "getUsersList", "Lkotlinx/coroutines/Job;", "searchText", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.appletea.mvvm_example.data.repository.UserRepository userRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.appletea.mvvm_example.data.remote.model.UserListModel> _userList = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.appletea.mvvm_example.data.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.appletea.mvvm_example.data.remote.model.UserListModel> getUserList() {
        return null;
    }
    
    /**
     * Method : Get User List
     * ---------------------------------------------------------------------------------------------
     *
     * @param searchText : 검색어
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getUsersList(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText) {
        return null;
    }
}