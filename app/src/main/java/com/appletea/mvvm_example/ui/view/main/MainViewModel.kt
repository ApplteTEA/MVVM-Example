package com.appletea.mvvm_example.ui.view.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appletea.mvvm_example.data.remote.model.UserListModel
import com.appletea.mvvm_example.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {

    //### Data List Data
    private val _userList = MutableLiveData<UserListModel?>()
    val userList: LiveData<UserListModel?> get() = _userList

    //##############################################################################################
    //##
    //## >> Call API
    //##
    //##############################################################################################

    /**
     * Method : Get User List
     * ---------------------------------------------------------------------------------------------
     *
     * @param searchText : 검색어
     */
    fun getUsersList(searchText: String) = viewModelScope.launch {
        val data = userRepository.getUsersList(searchText)
        when (data.isSuccessful) {
            true -> {
                if (data.body() != null) {
                    _userList.postValue(data.body())
                } else {
                    _userList.postValue(null)
                }
            }
            else -> {
                _userList.postValue(null)
            }
        }
    }
}