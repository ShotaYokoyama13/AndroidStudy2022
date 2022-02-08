package com.example.countapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberText: TextView = findViewById(R.id.numberText)
        val plusButton: Button = findViewById(R.id.plusButton)
        val minusButton: Button = findViewById(R.id.minusButton)
        val clearButton: Button = findViewById(R.id.clearButton)

        var num: Int = 0

        plusButton.setOnClickListener{
            num += 1
            numberText.text = num.toString()
        }
        minusButton.setOnClickListener{
            num -= 1
            numberText.text = num.toString()
        }
        clearButton.setOnClickListener{
            num = 0
            numberText.text = num.toString()
        }
    }
}