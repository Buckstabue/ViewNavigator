package com.buckstabue.viewnavigator.view

import android.app.Activity
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import com.buckstabue.viewnavigator.ScreenArgs

/**
 * Lightweight wrapper around android View class.
 * Like android fragments, but more reliable, it's a little more difficult to break this class.
 * Navigation is decoupled and placed in Router/Navigator classes
 */
abstract class ViewController<Args : ScreenArgs, ViewType : View>(
    protected val args: ScreenArgs,
    protected val activity: Activity
) {
    private var view: ViewType? = null

    abstract fun createContentView(): ViewType

    open fun onCreate() {
    }

    open fun onPause() {
    }

    open fun onResume() {
    }

    open fun onDestroy() {
    }

    @Suppress("UNCHECKED_CAST")
    protected fun inflateView(@LayoutRes layoutResId: Int): ViewType {
        return LayoutInflater.from(activity).inflate(layoutResId, null, false) as ViewType
    }
}
