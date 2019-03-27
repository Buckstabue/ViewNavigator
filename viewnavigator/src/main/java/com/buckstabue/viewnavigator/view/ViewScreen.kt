package com.buckstabue.viewnavigator.view

import android.app.Activity

/**
 * Encapsulates the creation of a view controller.
 */
abstract class ViewScreen {
    abstract fun createViewController(activity: Activity): ViewController<*, *>
}
