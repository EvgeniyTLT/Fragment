package com.example.fragment


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel : ViewModel() {
    val messegeForActivity: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val messegeForFrag1: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val messegeForFrag2: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}