package com.buckstabue.viewnavigator

import com.buckstabue.viewnavigator.view.ViewScreen

interface Router {

    fun goBack()
    fun goBackWithResult()

    fun forward(screen: ViewScreen)
    fun forwardWithResult(screen: ViewScreen)

    fun replace(screen: ViewScreen)
    fun backTo(tag: String)
}
