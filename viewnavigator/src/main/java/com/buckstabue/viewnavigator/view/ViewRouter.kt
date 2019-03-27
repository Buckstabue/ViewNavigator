package com.buckstabue.viewnavigator.view

import com.buckstabue.viewnavigator.Router
import com.buckstabue.viewnavigator.view.command.*

internal class ViewRouter(
    private val commandExecutor: ViewNavigator.RouterCommandExecutor
) : Router {
    override fun goBack() {
        commandExecutor.execute(BackToCommand())
    }

    override fun goBackWithResult() {
        commandExecutor.execute(BackWithResultCommand())
    }

    override fun forward(screen: ViewScreen) {
        commandExecutor.execute(ForwardCommand(screen))
    }

    override fun forwardWithResult(screen: ViewScreen) {
        commandExecutor.execute(ForwardWithResultCommand())
    }

    override fun replace(screen: ViewScreen) {
        commandExecutor.execute(ReplaceCommand())
    }

    override fun backTo(tag: String) {
        commandExecutor.execute(BackToCommand())
    }
}
