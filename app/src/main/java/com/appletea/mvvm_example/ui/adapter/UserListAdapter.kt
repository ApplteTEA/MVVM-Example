package com.appletea.mvvm_example.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.appletea.mvvm_example.data.remote.model.UserListModel
import com.appletea.mvvm_example.databinding.ItemUserListBinding
import com.appletea.mvvm_example.ui.adapter.viewholder.UserListViewHolder
import com.bumptech.glide.Glide

class UserListAdapter(val context: Context, private val list: ArrayList<UserListModel.SearchData>) :
    RecyclerView.Adapter<UserListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listItemBinding = ItemUserListBinding.inflate(inflater, parent, false)
        return UserListViewHolder(listItemBinding)
    }

    override fun onBindViewHolder(holder: UserListViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)

        //## Avatar Set
        Glide.with(context)
            .load(item.avatarUrl)
            .circleCrop()
            .into(holder.binding.itemUserListAvatar)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}