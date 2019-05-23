package com.example.cicironeexample

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v4.app.Fragment
import com.example.cicironeexample.fragments.*
import ru.terrakok.cicerone.android.support.SupportAppScreen

object BaseScreen : SupportAppScreen() { override fun getFragment() = BaseFragment() }
object FirstScreen : SupportAppScreen() { override fun getFragment() = FirstFragment() }
object SecondScreen : SupportAppScreen() { override fun getFragment() = SecondFragment() }

object MyScreen: SupportAppScreen() {
    override fun getFragment(): Fragment {
        return MyFragment()
    }
}

class ParamScreen(private val exampleParam: String) : SupportAppScreen() {
    override fun getFragment() = ParamFragment.newInstance(exampleParam)
}

object ExampleIntent : SupportAppScreen() {
    override fun getActivityIntent(context: Context?) =
        Intent(Intent.ACTION_VIEW).apply { data = Uri.parse("https://www.google.com") }
}
