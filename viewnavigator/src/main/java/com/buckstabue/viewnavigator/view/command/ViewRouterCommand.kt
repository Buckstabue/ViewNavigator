package com.buckstabue.viewnavigator.view.command

import android.app.Activity
import android.view.ViewGroup
import com.buckstabue.viewnavigator.RouterCommand
import com.buckstabue.viewnavigator.view.ViewController

internal interface ViewRouterCommand : RouterCommand {

    /**
     * @param container container to work with
     * @param screenChain should be modified after command is applied
     * @param activity activity to pass to the new view controller if needed
     */
    fun execute(
        container: ViewGroup,
        screenChain: MutableList<ViewController<*, *, *>>,
        activity: Activity
    )
}
