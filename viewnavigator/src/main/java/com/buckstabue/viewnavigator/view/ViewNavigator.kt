package com.buckstabue.viewnavigator.view

import android.app.Activity
import android.view.ViewGroup
import com.buckstabue.viewnavigator.Navigator
import com.buckstabue.viewnavigator.Router
import com.buckstabue.viewnavigator.view.command.ViewRouterCommand
import java.util.*

class ViewNavigator(
    private val container: ViewGroup,
    private val activity: Activity
) : Navigator {
    private val screenChain = mutableListOf<ViewController<*, *>>()
    private var state = ViewNavigatorState.PAUSED
    private val routerCommandExecutor = RouterCommandExecutor()
    private val router = ViewRouter(routerCommandExecutor)

    override fun resume() {
        state = ViewNavigatorState.RESUMED
        routerCommandExecutor.onResume()
    }

    override fun suspend() {
        state = ViewNavigatorState.PAUSED
    }

    override fun getRouter(): Router {
        return router
    }

    internal inner class RouterCommandExecutor {
        private val commandQueue: Queue<ViewRouterCommand> = ArrayDeque<ViewRouterCommand>()

        fun execute(command: ViewRouterCommand) {
            if (state == ViewNavigatorState.RESUMED) {
                command.execute(container, screenChain, activity)
            } else {
                commandQueue.add(command)
            }
        }

        fun onResume() {
            while (commandQueue.isNotEmpty()) {
                commandQueue.poll().execute(container, screenChain, activity)
            }
        }
    }

    private enum class ViewNavigatorState {
        PAUSED,
        RESUMED
    }
}
