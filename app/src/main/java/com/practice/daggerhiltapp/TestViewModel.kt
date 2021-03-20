package com.practice.daggerhiltapp

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class TestViewModel @ViewModelInject constructor(
    @Named("String2") testString2: String
) : ViewModel() {
    private val TAG: String = "TestViewModel"

    init {
        Log.d(TAG, "testString2: $testString2 ")
    }
}