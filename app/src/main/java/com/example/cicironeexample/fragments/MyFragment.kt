package com.example.cicironeexample.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cicironeexample.BaseScreen

import com.example.cicironeexample.R
import kotlinx.android.synthetic.main.fragment_my.*
import org.koin.android.ext.android.inject
import ru.terrakok.cicerone.Router

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MyFragment : Fragment() {

    private val router by inject<Router>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_go_main.setOnClickListener { router.backTo(BaseScreen) }

    }


}
