package com.xxluciferinxx.wallpaperapp.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.xxluciferinxx.wallpaperapp.MainActivity
import com.xxluciferinxx.wallpaperapp.R
import com.xxluciferinxx.wallpaperapp.WallpaperApp
import com.xxluciferinxx.wallpaperapp.utils.Utils
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bnLogout.setOnClickListener {
            WallpaperApp.loginPref?.writeLoginStatus(false)
            Utils.toast(view.context, "logout")
            startActivity(Intent(activity, MainActivity::class.java))
            activity?.finish()
        }
    }
}