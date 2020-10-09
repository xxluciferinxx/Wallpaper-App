package com.xxluciferinxx.wallpaperapp.preferences

import android.content.Context
import android.content.SharedPreferences
import com.xxluciferinxx.wallpaperapp.R

class LoginPreferencesConfig(
    private val ctx: Context,
) {
    private val sharedPreferences: SharedPreferences
        get() = ctx.getSharedPreferences(
            ctx.resources.getString(R.string.loginPreferencesConfigLoginStatus),
            Context.MODE_PRIVATE
        )

    fun writeLoginStatus(state: Boolean) {
        sharedPreferences.edit().apply {
            putBoolean(ctx.resources.getString(R.string.loginPreferencesConfigLoginStatus), state)
        }.apply()
    }

    fun readLoginStatus(): Boolean {
        return sharedPreferences.getBoolean(
            ctx.resources.getString(R.string.loginPreferencesConfigLoginStatus),
            false
        )
    }
}