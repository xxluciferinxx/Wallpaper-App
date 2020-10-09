package com.xxluciferinxx.wallpaperapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xxluciferinxx.wallpaperapp.ui.activities.LoginActivity
import com.xxluciferinxx.wallpaperapp.utils.Utils
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Utils.setLoginPref(application)
        Timer().schedule(2000) {
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            finish()
        }
    }
}