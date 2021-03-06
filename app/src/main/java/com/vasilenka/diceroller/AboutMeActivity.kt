package com.vasilenka.diceroller

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vasilenka.diceroller.databinding.ActivityAboutMeBinding

class AboutMeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutMeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutMeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()
        setupListeners()
    }

    private fun setupView() {
        binding.toolbar.topAppBar.setNavigationIcon(R.drawable.ic_arrow_left)
    }

    private fun setupListeners() {
        binding.toolbar.topAppBar.setOnClickListener { onBackPressed() }
    }

    companion object {
        fun start(activity: Activity) = Intent(activity, AboutMeActivity::class.java).apply {
            activity.startActivity(this)
        }
    }
}