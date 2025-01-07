package com.example.lab1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lab1.databinding.ActivityMainBinding
import kotlin.random.Random

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        xuly()
    }

    private fun xuly() {
        binding.btnRamdom.setOnClickListener{
            var soRamdom = Random.nextInt(1, 7)
            when(soRamdom) {
                1 -> binding.imgRandom.setImageResource(R.drawable.dice_1)
                2 -> binding.imgRandom.setImageResource(R.drawable.dice_2)
                3 -> binding.imgRandom.setImageResource(R.drawable.dice_3)
                4 -> binding.imgRandom.setImageResource(R.drawable.dice_4)
                5 -> binding.imgRandom.setImageResource(R.drawable.dice_5)
                6 -> binding.imgRandom.setImageResource(R.drawable.dice_6)
            }
            binding.txtRamdom.setText(soRamdom.toString())
        }
    }

}