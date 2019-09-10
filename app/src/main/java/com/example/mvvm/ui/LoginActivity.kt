package com.example.mvvm.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import com.example.mvvm.R
import com.example.mvvm.databinding.ActivityLoginBinding
import com.example.mvvm.extensions.onClick
import com.example.mvvm.viewmodel.LoginViewModel

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>() {

    override fun getContentView() = R.layout.activity_login

    override fun init() {
        mViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        mBinding.btnLogin.onClick {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    override fun observeData() {
        mViewModel.user.observe(this, Observer {
            mBinding.edtUserName.setText(it)
        })
    }
}
