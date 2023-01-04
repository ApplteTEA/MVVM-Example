package com.appletea.mvvm_example.ui.view.main

import androidx.activity.viewModels
import com.appletea.mvvm_example.R
import com.appletea.mvvm_example.base.BaseActivity
import com.appletea.mvvm_example.databinding.ActivityMainBinding
import com.appletea.mvvm_example.ui.adapter.UserListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

    override val viewModel: MainViewModel by viewModels()

    private var userListAdapter: UserListAdapter? = null //## ListAdapter

    override fun init() {
        viewModel.getUsersList("test")
    }

    override fun initLiveData() {
        viewModel.userList.observe(this) {
            userListAdapter = UserListAdapter(this, it?.items!!)
            binding.userList.adapter = userListAdapter
        }
    }
}