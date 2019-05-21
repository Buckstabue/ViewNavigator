package com.buckstabue.viewnavigator.view

import android.app.Activity
import android.view.View
import com.buckstabue.viewnavigator.ScreenArgs

abstract class StatelessViewController<Args : ScreenArgs, ViewType : View>(
    args: ScreenArgs, activity: Activity
) : ViewController<Args, ViewType, Nothing>(args, activity) {

    open fun onCreate() {
    }

    final override fun onCreate(state: Nothing?) {
        super.onCreate(state)
        onCreate()
    }

    final override fun onSaveState(): Nothing? {
        return null
    }
}
