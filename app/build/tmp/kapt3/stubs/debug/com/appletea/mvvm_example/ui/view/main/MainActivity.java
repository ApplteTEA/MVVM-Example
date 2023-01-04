package com.appletea.mvvm_example.ui.view.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00038VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/appletea/mvvm_example/ui/view/main/MainActivity;", "Lcom/appletea/mvvm_example/base/BaseActivity;", "Lcom/appletea/mvvm_example/databinding/ActivityMainBinding;", "Lcom/appletea/mvvm_example/ui/view/main/MainViewModel;", "()V", "userListAdapter", "Lcom/appletea/mvvm_example/ui/adapter/UserListAdapter;", "viewModel", "getViewModel", "()Lcom/appletea/mvvm_example/ui/view/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "init", "", "initLiveData", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.appletea.mvvm_example.base.BaseActivity<com.appletea.mvvm_example.databinding.ActivityMainBinding, com.appletea.mvvm_example.ui.view.main.MainViewModel> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private com.appletea.mvvm_example.ui.adapter.UserListAdapter userListAdapter;
    
    public MainActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.appletea.mvvm_example.ui.view.main.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void init() {
    }
    
    @java.lang.Override()
    public void initLiveData() {
    }
}