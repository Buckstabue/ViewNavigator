package com.buckstabue.viewnavigator.view.command

import android.app.Activity
import android.view.ViewGroup
import com.buckstabue.viewnavigator.view.ViewController

class BackWithResultCommand : ViewRouterCommand {
    override fun execute(
        container: ViewGroup,
        screenChain: MutableList<ViewController<*, *, *>>,
        activity: Activity
    ) {
    }
}
