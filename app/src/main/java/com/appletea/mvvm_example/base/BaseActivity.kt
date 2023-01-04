package com.appletea.mvvm_example.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import com.appletea.mvvm_example.BR

abstract class BaseActivity<B : ViewDataBinding, VM : ViewModel>(
    @LayoutRes private val layoutResId: Int
) : AppCompatActivity() {

    lateinit var binding: B

    abstract val viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutResId)
        binding.setVariable(BR.vm, viewModel)
        binding.lifecycleOwner = this

        init()
        initLiveData()
    }

    open fun init() {}

    open fun initLiveData() {}
}