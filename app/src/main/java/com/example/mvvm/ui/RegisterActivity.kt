package com.example.mvvm.ui

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
            Toast.makeText(this,"Roman Saini",Toast.LENGTH_SHORT).show()
        }
    }

    override fun getContentView() = R.layout.activity_register

    override fun observeData() {
        mBinding.edtPassword.setText("Naruto")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun finish() {
        super.finish()
    }
}