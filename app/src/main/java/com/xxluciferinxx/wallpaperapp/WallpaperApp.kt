package com.xxluciferinxx.wallpaperapp

import android.app.Application
import com.xxluciferinxx.wallpaperapp.preferences.LoginPreferencesConfig

class WallpaperApp : Application() {

    companion object {
        var loginPref: LoginPreferencesConfig? = null
    }
}