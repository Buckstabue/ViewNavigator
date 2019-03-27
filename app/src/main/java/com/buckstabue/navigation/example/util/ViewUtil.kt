package com.buckstabue.navigation.example.util

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.ViewGroup

fun ViewGroup.inflateWithAttach(@LayoutRes layoutResId: Int) {
    LayoutInflater.from(context).inflate(layoutResId, this, true)
}
