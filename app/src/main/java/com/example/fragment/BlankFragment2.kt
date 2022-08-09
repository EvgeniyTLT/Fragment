package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {
    val binding = FragmentBlank2Binding.inflate(inflater)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            BlankFragment2()
    }
}