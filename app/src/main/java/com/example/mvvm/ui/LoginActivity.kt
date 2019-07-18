package com.example.mvvm.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import com.example.mvvm.R
import com.example.mvvm.databinding.ActivityLoginBinding
import com.example.mvvm.viewmodel.LoginViewModel

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>() {

    override fun getContentView() = R.layout.activity_login

    override fun init() { mViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java) }

    override fun observeData() {
        mViewModel.user.observe(this, Observer {
            TODO("UI update kr le")
        })
    }
}
