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
     * Called when all navigation actions should be suspended till a next resume() call.
     */
    fun suspend()

    /**
     * Called when user pressed Back button.
     *
     * @return whether the event was processed or not
     */
    fun onBackPressed(): Boolean

    /**
     * @return router instance which interacts with this navigator
     */
    fun getRouter(): Router
}
