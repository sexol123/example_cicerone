package com.example.cicironeexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.android.support.SupportAppNavigator

class MainActivity : AppCompatActivity() {

    private val cicerone = Cicerone.create()
    private val navigatorHolder = cicerone.navigatorHolder
    private val navigator = SupportAppNavigator(this, R.id.main_frame_layout)
    private val router = cicerone.router

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigatorHolder.setNavigator(navigator)

        buttonGoTo1Fragment.setOnClickListener { router.navigateTo(FirstScreen) }
        buttonGoTo2Fragment.setOnClickListener { router.navigateTo(SecondScreen) }
    }
}
