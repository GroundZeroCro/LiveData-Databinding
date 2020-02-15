package com.groundzero.livedatadatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val textLiveData = MutableLiveData<String>().apply { value = "Initial value" }

    fun getText(): LiveData<String> = textLiveData
    fun setText(text: String) = apply { textLiveData.value = text }
}