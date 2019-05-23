package com.example.cicironeexample.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cicironeexample.*
import kotlinx.android.synthetic.main.fragment_base.*
import org.koin.android.ext.android.inject
import ru.terrakok.cicerone.Router

class BaseFragment : Fragment() {
    private val router by inject<Router>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_base, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonGoTo1Fragment.setOnClickListener { router.navigateTo(FirstScreen) }
        buttonGoTo2Fragment.setOnClickListener { router.navigateTo(SecondScreen) }
        buttonGoToParamFragment.setOnClickListener { router.navigateTo(ParamScreen("передаваемый параметр")) }
        buttonGoToWebSite.setOnClickListener { router.navigateTo(ExampleIntent) }
        btn_go_my.setOnClickListener { router.navigateTo(MyScreen) }
    }
}
