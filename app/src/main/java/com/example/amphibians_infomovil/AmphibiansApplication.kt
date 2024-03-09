package com.example.amphibians_infomovil

import android.app.Application
import com.example.amphibians_infomovil.data.AppContainer
import com.example.amphibians_infomovil.data.DefaultAppContainer

class AmphibiansApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}