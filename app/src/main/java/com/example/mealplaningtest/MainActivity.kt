package com.example.mealplaningtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mealplaningtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.btnGoToParent.setOnClickListener {
            val intent=Intent(this@MainActivity,ParentActivity::class.java)
            startActivity(intent)
        }


        binding.btnGoToCreator.setOnClickListener{
            val intent=Intent(this@MainActivity, CreatorMenuActivity::class.java)
            startActivity(intent)
        }







    }

}