package com.example.mvvm.repository

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.example.mvvm.WebService
import com.example.mvvm.model.UserModel

/**
 * Created by Sandeep on 19/7/19
 */
class UserRepository {

    //private val webService: WebService =


    fun getUser(): LiveData<String> {
        val data = MutableLiveData<String>()
        data.value = UserModel().userName
        return data
    }
}