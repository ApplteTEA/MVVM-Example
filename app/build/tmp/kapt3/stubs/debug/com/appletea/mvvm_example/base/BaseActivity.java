package com.appletea.mvvm_example.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u000f\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014R\u001c\u0010\t\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00028\u0001X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/appletea/mvvm_example/base/BaseActivity;", "B", "Landroidx/databinding/ViewDataBinding;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "layoutResId", "", "(I)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "init", "", "initLiveData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseActivity<B extends androidx.databinding.ViewDataBinding, VM extends androidx.lifecycle.ViewModel> extends androidx.appcompat.app.AppCompatActivity {
    private final int layoutResId = 0;
    public B binding;
    
    public BaseActivity(@androidx.annotation.LayoutRes()
    int layoutResId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final B getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract VM getViewModel();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void init() {
    }
    
    public void initLiveData() {
    }
}