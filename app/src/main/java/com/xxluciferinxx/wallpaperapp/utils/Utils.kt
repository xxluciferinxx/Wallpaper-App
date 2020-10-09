package com.xxluciferinxx.wallpaperapp.utils

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.xxluciferinxx.wallpaperapp.WallpaperApp
import com.xxluciferinxx.wallpaperapp.preferences.LoginPreferencesConfig

class Utils {

    companion object {
        fun setLoginPref(ctx: Context) {
            WallpaperApp.loginPref = LoginPreferencesConfig(ctx)
        }

        fun toast(ctx: Context, m: String) {
            Toast.makeText(ctx, m, Toast.LENGTH_SHORT).show()
        }

        fun snackBar(v: View, m: String) {
            Snackbar.make(v, m, Snackbar.LENGTH_SHORT).show()
        }
    }
}