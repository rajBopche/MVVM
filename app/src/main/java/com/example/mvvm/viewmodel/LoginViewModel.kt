package com.example.mvvm.viewmodel

import android.arch.lifecycle.LiveData
import com.example.mvvm.repository.UserRepository

/**
 * Created by Sandeep on 16/7/19
 */
class LoginViewModel : BaseViewModel() {
    val user: LiveData<String> = UserRepository().getUser()
}