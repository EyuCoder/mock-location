package com.codexo.mocklocation

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MockLocationService : Service() {

    fun startMock(){

    }

    fun stopMock(){

    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()

    }





    companion object{
        private const val INTENT_ACTION_START = "INTENT_ACTION_START"
        private const val INTENT_ACTION_STOP = "INTENT_ACTION_STOP"
        private const val INTENT_EXTRA_LOCATION = "INTENT_EXTRA_LATITUDE"
        private const val INTENT_EXTRA_PACKAGE_NAME = "INTENT_EXTRA_PACKAGE_NAME"
        private const val INTERVAL = 3_000L
    }
}