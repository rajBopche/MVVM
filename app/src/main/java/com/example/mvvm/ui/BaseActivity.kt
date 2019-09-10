package com.example.mvvm.ui

import android.arch.lifecycle.ViewModel
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Sandeep on 17/7/19
 */
abstract class BaseActivity<T : ViewDataBinding, V : ViewModel> : AppCompatActivity() {

    protected lateinit var mBinding: T
    protected lateinit var mViewModel: V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, getContentView())
        init()
        observeData()
    }

    abstract fun init()

    protected abstract fun getContentView(): Int

    protected abstract fun observeData()
}