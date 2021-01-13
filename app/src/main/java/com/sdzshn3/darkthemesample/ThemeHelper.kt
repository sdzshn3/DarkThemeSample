package com.sdzshn3.darkthemesample

import androidx.appcompat.app.AppCompatDelegate

const val FOLLOW_SYSTEM = "Follow System"
const val DARK_THEME = "Dark Theme"
const val LIGHT_THEME = "Light Theme"

public fun setAppTheme(theme: String) {
    when (theme) {
        FOLLOW_SYSTEM -> {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        }
        DARK_THEME -> {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        LIGHT_THEME -> {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }
}