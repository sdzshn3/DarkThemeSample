package com.sdzshn3.darkthemesample

import android.app.Application
import androidx.preference.PreferenceManager

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val theme = sharedPreferences.getString("appTheme", FOLLOW_SYSTEM)
        setAppTheme(theme ?: FOLLOW_SYSTEM)
    }
}