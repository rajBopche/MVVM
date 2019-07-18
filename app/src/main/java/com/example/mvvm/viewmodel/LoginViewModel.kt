package com.example.mvvm.viewmodel

import android.arch.lifecycle.LiveData
import com.example.mvvm.model.UserModel

/**
 * Created by Sandeep on 16/7/19
 */
class LoginViewModel(): BaseViewModel() {
    val userId: String = "Roshan Singh Sodhi"
    val user:LiveData<UserModel> = TODO("Beta UserModel set krne k lie,RetroFit Ya DB se call kro")
}