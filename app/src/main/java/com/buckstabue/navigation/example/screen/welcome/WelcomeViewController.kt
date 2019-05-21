package com.buckstabue.navigation.example.screen.welcome

import android.app.Activity
import android.widget.LinearLayout
import com.buckstabue.navigation.example.R
import com.buckstabue.viewnavigator.EmptyScreenArgs
import com.buckstabue.viewnavigator.view.StatelessViewController

class WelcomeViewController(
    activity: Activity
) : StatelessViewController<EmptyScreenArgs, LinearLayout>(EmptyScreenArgs, activity) {

    override fun createContentView(): LinearLayout {
        return inflateView(R.layout.welcome)
    }
}
