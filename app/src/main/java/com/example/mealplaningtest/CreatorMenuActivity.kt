package com.example.mealplaningtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mealplaningtest.databinding.ActivityCreatorMenuBinding

class CreatorMenuActivity : AppCompatActivity() {

    lateinit var cbinding: ActivityCreatorMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cbinding= ActivityCreatorMenuBinding.inflate(layoutInflater)
        setContentView(cbinding.root)


        cbinding.btnGoBack1.setOnClickListener {
            this.onBackPressed()
        }


        //Про чекбоксы
        //id checkBox - пюре
        //id checkBox1 - Макароны
        //id checkBox2 - Гречка
        //id checkBox3 - Рис
        //id checkBox4 - Жаренная картошка
        //id checkBox5 - Овощи на пару
        //id checkBox6 - Капуста

    }
}