package com.example.cicironeexample

import com.example.cicironeexample.fragments.FirstFragment
import com.example.cicironeexample.fragments.SecondFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

object FirstScreen : SupportAppScreen() {
    override fun getFragment() = FirstFragment()
}

object SecondScreen : SupportAppScreen() {
    override fun getFragment() = SecondFragment()
}
