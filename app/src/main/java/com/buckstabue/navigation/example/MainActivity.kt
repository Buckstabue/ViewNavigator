package com.buckstabue.navigation.example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.buckstabue.navigation.example.screen.welcome.WelcomeScreen
import com.buckstabue.viewnavigator.view.ViewNavigator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewNavigator: ViewNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewNavigator = ViewNavigator(container, this)
        if (savedInstanceState == null) {
            viewNavigator.getRouter().forward(WelcomeScreen())
        }
    }

    override fun onResume() {
        super.onResume()
        viewNavigator.resume()
    }

    override fun onPause() {
        super.onPause()
        viewNavigator.suspend()
    }
}
