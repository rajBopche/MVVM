package com.example.mvvm.extensions

import android.view.View

/**
 * Created by Sandeep on 20/7/19
 */

fun View.onClick(block: (View) -> Unit) {
    this.setOnClickListener { view -> block(view) }
}