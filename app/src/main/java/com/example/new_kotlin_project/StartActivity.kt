package com.example.new_kotlin_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageButton

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val startButton: ImageButton = findViewById(R.id.first_round_button)
        startButton.setOnClickListener {
            val intent = Intent(this@StartActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

}