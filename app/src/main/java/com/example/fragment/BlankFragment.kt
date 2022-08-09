package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.fragment.databinding.Fragment1Binding


class BlankFragment : Fragment() {
    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: Fragment1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.messegeForFrag1.observe(activity as LifecycleOwner, {
            binding.tvMessege.text = it
        })

        binding.bSendToFrag2.setOnClickListener {
            dataModel.messegeForFrag2.value = "Hello from fragment 1"
        }
        binding.bSendToActivity.setOnClickListener {
            dataModel.messegeForActivity.value = "Hello activity from fragment 1"
        }
    }


    companion object {

        @JvmStatic
        fun newInstance() =
            BlankFragment()
    }
}

