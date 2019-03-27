package com.buckstabue.viewnavigator

/**
 * This class handles navigation. It should be attached to Activity/Fragment/View.
 */
interface Navigator {
    /**
     * Called when navigation can be performed.
     */
    fun resume()

    /**
     * Called when all navigation actions should be suspended.
     */
    fun suspend()

    /**
     * @return router instance which interacts with this navigator
     */
    fun getRouter(): Router
}
