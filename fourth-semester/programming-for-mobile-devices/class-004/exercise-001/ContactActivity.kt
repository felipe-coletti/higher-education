package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button
import android.widget.ListView

class ContactActivity : AppCompatActivity() {
    private val list = mutableListOf<Contact>()

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.activity_contact)

        val name = findViewById<EditText>(R.id.editTextText)
        val email = findViewById<EditText>(R.id.editTextText2)
        val phoneNumber = findViewById<EditText>(R.id.editTextText3)
        val saveContact = findViewById<Button>(R.id.button)
        val contactsList = findViewById<ListView>(R.id.listView)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        contactsList.adapter = adapter

        saveContact.setOnClickListener {
            val newContact = Contact(
                name.text.toString(),
                email.text.toString(),
                phoneNumber.text.toString()
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
