package com.buckstabue.viewnavigator.view

import android.app.Activity
import com.buckstabue.viewnavigator.ScreenArgs

abstract class StatelessViewController<Args : ScreenArgs>(
    args: ScreenArgs, activity: Activity
) : ViewController<Args, Nothing>(args, activity) {

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
