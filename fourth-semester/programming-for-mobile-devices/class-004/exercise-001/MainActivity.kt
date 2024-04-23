package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val list = mutableListOf<Contact>()

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val phoneNumberInput = findViewById<EditText>(R.id.phoneNumber)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val contactsList = findViewById<ListView>(R.id.list)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        contactsList.adapter = adapter

        saveButton.setOnClickListener {
            val newContact = Contact(
                nameInput.text.toString(),
                emailInput.text.toString(),
                phoneNumberInput.text.toString()
            )

            list.add(newContact)

            adapter.clear()

            for (item in list) {
                adapter.add(newContact.toString())
            }

            Log.i("Contato salvo", "Lista: $list")
        }
    }
}
