package com.buckstabue.navigation.example.screen.welcome

import android.app.Activity
import android.widget.LinearLayout
import com.buckstabue.navigation.example.R
import com.buckstabue.viewnavigator.EmptyScreenArgs
import com.buckstabue.viewnavigator.view.ViewController

class WelcomeViewController(
    activity: Activity
) : ViewController<EmptyScreenArgs, LinearLayout>(EmptyScreenArgs, activity) {

    override fun createContentView(): LinearLayout {
        return inflateView(R.layout.welcome)
    }
}
