package com.example.builderandsingletonpatterns.singleton_pattern

import android.util.Log


object Sun {

    init {
        Log.d("MyLog", "Init object Sun: $this")
    }

    fun start() {
        Log.d("MyLog", "Start doing something Object: $this")
    }
}


