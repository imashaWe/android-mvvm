package com.imasha.mvvm_app.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _count = MutableLiveData<Int>().apply {
        value = 0
    }

    val count: LiveData<Int> get() = _count;

    fun increase() {
        _count.value = _count.value?.inc();
    }

    fun decrease() {
        _count.value = _count.value?.dec();
    }

}