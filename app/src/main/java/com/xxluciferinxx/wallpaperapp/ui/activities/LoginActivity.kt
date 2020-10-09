package com.xxluciferinxx.wallpaperapp.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xxluciferinxx.wallpaperapp.R
import com.xxluciferinxx.wallpaperapp.WallpaperApp
import com.xxluciferinxx.wallpaperapp.utils.Utils
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        if (checkLoginStatus()) {
            WallpaperApp.loginPref?.writeLoginStatus(true)
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        } else {
            init()
        }

    }

    private fun init() {
        bnLogin.setOnClickListener {
            if (isLoginSuccessful()) {
                WallpaperApp.loginPref?.writeLoginStatus(true)
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            } else {
                WallpaperApp.loginPref?.writeLoginStatus(false)
                Utils.toast(applicationContext, "Login Failed.")
            }
        }
    }

    private fun isLoginSuccessful(): Boolean = performLogin()

    private fun performLogin(): Boolean {
        return !(etEmail.text.isEmpty() || etPassword.text.isEmpty())
    }

    private fun checkLoginStatus(): Boolean = WallpaperApp.loginPref?.readLoginStatus()!!
}