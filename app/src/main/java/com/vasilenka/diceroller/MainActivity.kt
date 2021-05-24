package com.vasilenka.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vasilenka.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }


    private fun setListeners() {
        binding.buttonRoll.setOnClickListener {
            rollDice()
        }
        binding.toolbar.topAppBar.setOnClickListener {
            binding.drawerLayout.open()
        }

        binding.navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                else -> {
                    menuItem.isChecked = true
                    binding.drawerLayout.close()
                    true
                }
            }
        }

        binding.navigationView.getHeaderView(0).setOnClickListener {
            AboutMeActivity.start(this)
        }
    }


    private fun rollDice() {
        binding.imageViewRoll.setImageResource(rollImages.random())
    }

    private val rollImages = arrayOf(
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6
    )
}