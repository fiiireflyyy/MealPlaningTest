package com.example.mealplaningtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mealplaningtest.databinding.ActivityParentBinding

class ParentActivity : AppCompatActivity() {
    lateinit var pbinding: ActivityParentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pbinding=ActivityParentBinding.inflate(layoutInflater)
        setContentView(pbinding.root)


        pbinding.btnGoBack.setOnClickListener {
            this.onBackPressed()
        }
    }
}