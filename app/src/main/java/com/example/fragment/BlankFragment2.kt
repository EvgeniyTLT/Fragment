package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.fragment.databinding.Fragment2Binding


class BlankFragment2 : Fragment() {
    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.messegeForFrag2.observe(activity as LifecycleOwner, {
            binding.tvMessage.text = it
        })
        binding.bSendToFrag1.setOnClickListener {
            dataModel.messegeForFrag1.value = "Hello from fragment 2"
        }
        binding.bSendToActivity.setOnClickListener {
            dataModel.messegeForActivity.value = "Hello activity from fragment 2"
        }
    }


    companion object {

        @JvmStatic
        fun newInstance() =
            BlankFragment2()
    }
}
