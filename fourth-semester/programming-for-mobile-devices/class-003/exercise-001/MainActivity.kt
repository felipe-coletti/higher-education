package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.activity_main)

        val valueInput = findViewById<EditText>(R.id.valueInput)
        val exchangeValueInput = findViewById<EditText>(R.id.exchangeValueInput)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        calculateButton.setOnClickListener {
            val value = valueInput.text.toString().toFloat()
            val exchangeValue = exchangeValueInput.text.toString().toFloat()
            val result = value * exchangeValue

            resultText.text = "Resultado: $result"
        }
    }
}