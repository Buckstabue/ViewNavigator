package com.buckstabue.navigation.example.screen.welcome

import android.app.Activity
import com.buckstabue.viewnavigator.view.ViewController
import com.buckstabue.viewnavigator.view.ViewScreen

class WelcomeScreen : ViewScreen() {
    override fun createViewController(activity: Activity): ViewController<*, *> {
        return WelcomeViewController(activity)
    }
}
