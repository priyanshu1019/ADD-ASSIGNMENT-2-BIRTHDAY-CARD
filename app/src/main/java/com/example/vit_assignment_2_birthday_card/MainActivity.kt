package com.example.birthdaycardapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vit_assignment_2_birthday_card.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun closeApp(view: android.view.View) {
        finish()
    }
}
