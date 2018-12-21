package com.example.cicironeexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.koin.android.ext.android.inject
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator

class MainActivity : AppCompatActivity() {

    private val navigatorHolder by inject<NavigatorHolder>()
    private val navigator = SupportAppNavigator(this, R.id.main_frame_layout)
    private val router by inject<Router>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigatorHolder.setNavigator(navigator)

        router.newRootScreen(BaseScreen)
    }
}
