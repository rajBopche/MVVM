package com.example.mvvm.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.widget.Toast
import com.example.mvvm.R
import com.example.mvvm.databinding.ActivityRegisterBinding
import com.example.mvvm.extensions.onClick
import com.example.mvvm.viewmodel.LoginViewModel

/**
 * Created by Sandeep on 20/7/19
 */
class RegisterActivity : BaseActivity<ActivityRegisterBinding, LoginViewModel>() {

    override fun init() {
        mViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        mBinding.btnLogin.onClick {

        }
    }

    override fun getContentView() = R.layout.activity_register

    override fun observeData() {
        mViewModel.user.observe(this, Observer{
           mBinding.edtPassword.setText("Tomocat")
        })
    }
}