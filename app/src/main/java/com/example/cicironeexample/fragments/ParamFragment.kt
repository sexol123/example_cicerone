package com.example.cicironeexample.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cicironeexample.R
import kotlinx.android.synthetic.main.fragment_param.*

class ParamFragment : Fragment() {

    companion object {
        private const val ARG_PARAM = "ARG_PARAM"

        fun newInstance(param: String) = ParamFragment().apply {
            arguments = Bundle().apply { putString(ARG_PARAM, param) }
        }
    }

    private val param by lazy {
        arguments?.getString(ARG_PARAM) ?: throw IllegalAccessException("Не смог достать параметр")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_param, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text_view_param.text = "Текст из параметра: $param"
    }
}
