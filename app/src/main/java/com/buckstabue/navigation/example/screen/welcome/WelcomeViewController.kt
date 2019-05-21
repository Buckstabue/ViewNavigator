package com.buckstabue.navigation.example.screen.welcome

import android.app.Activity
import android.view.View
import com.buckstabue.navigation.example.R
import com.buckstabue.viewnavigator.EmptyScreenArgs
import com.buckstabue.viewnavigator.view.StatelessViewController

class WelcomeViewController(
    activity: Activity
) : StatelessViewController<EmptyScreenArgs>(EmptyScreenArgs, activity) {

    override fun createContentView(): View {
        return inflateView(R.layout.welcome)
    }
}
