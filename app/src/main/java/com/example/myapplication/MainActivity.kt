package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            findViewById<ImageView>(R.id.zdj).setImageResource(R.drawable.biblethumb)
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            findViewById<ImageView>(R.id.zdj).setImageResource(R.drawable.monkagiga)
        }

        findViewById<Button>(R.id.btn3).setOnClickListener {
            findViewById<ImageView>(R.id.zdj).setImageResource(R.drawable.monkas)
        }

        findViewById<Button>(R.id.btn4).setOnClickListener {
            findViewById<ImageView>(R.id.zdj).setImageResource(R.drawable.monkakierowca)
        }
    }
}