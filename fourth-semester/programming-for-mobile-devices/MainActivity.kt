package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.activity_main)

        val sp = getSharedPreferences("repositório", Context.MODE_PRIVATE)

        val textInput = findViewById<EditText>(R.id.textInput)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val readButton = findViewById<Button>(R.id.readButton)

        saveButton.setOnClickListener {
            sp.edit().apply() {
                putString("TEXTO", textInput.text.toString())
                commit()
            }

            val toast = Toast.makeText(this, "Texto cadastrado com sucesso", Toast.LENGTH_LONG).show()
        }

        readButton.setOnClickListener {
            val text = sp.getString("TEXTO", "")
            textInput.setText(text)
        }
    }
}