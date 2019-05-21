package com.buckstabue.viewnavigator.view

import android.app.Activity
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import com.buckstabue.viewnavigator.ScreenArgs

/**
 * Lightweight wrapper around android View class.
 * It's similar to android fragments. This class will be released whenever a new screen opened,
 * only saved data will be restored.
 * Navigation is decoupled and placed in Router/Navigator classes
 */
abstract class ViewController<Args : ScreenArgs, ViewType : View, State : Any>(
    protected val args: ScreenArgs,
    private val activity: Activity
) {
    protected val view: ViewType = createContentView()

    abstract fun createContentView(): ViewType

    /**
     * Called on creation/restoring. It's called only once
     */
    open fun onCreate(state: State?) {
    }

    /**
     * Called when the host activity is resumed
     */
    open fun onResume() {
    }

    /**
     * Called when the host activity is paused
     */
    open fun onPause() {
    }

    /**
     * Called before destroying this view controller to persist state which will be restored when user navigates back
     * to this screen
     */
    abstract fun onSaveState(): State?

    /**
     * Called before destroying this view controller
     */
    open fun onDestroy() {
    }

    /**
     * @return whether the event was processed or not
     */
    open fun onBackPressed(): Boolean {
        return false
    }

    @Suppress("UNCHECKED_CAST")
    protected fun inflateView(@LayoutRes layoutResId: Int): ViewType {
        return LayoutInflater.from(activity).inflate(layoutResId, null, false) as ViewType
    }
}
