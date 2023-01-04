package com.appletea.mvvm_example.ui.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.appletea.mvvm_example.data.remote.model.UserListModel
import com.appletea.mvvm_example.databinding.ItemUserListBinding

class UserListViewHolder(val binding: ItemUserListBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(item: UserListModel.SearchData) {
        binding.user = item
    }
}