package com.buckstabue.viewnavigator.view.command

import android.app.Activity
import android.view.ViewGroup
import com.buckstabue.viewnavigator.view.ViewController
import com.buckstabue.viewnavigator.view.ViewScreen

class ForwardCommand(
    private val screen: ViewScreen
) : ViewRouterCommand {
    override fun execute(
        container: ViewGroup,
        screenChain: MutableList<ViewController<*, *>>,
        activity: Activity
    ) {
        val viewController = screen.createViewController(activity)
        container.addView(viewController.createContentView())
        screenChain.add(viewController)
    }
}
