package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import com.google.gson.Gson

class MainActivity : Activity() {
    private val list = ArrayList<Restaurant>()
    private val gson = Gson()

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val addressInput = findViewById<EditText>(R.id.addressInput)
        val typeInput = findViewById<EditText>(R.id.typeInput)
        val longitudeInput = findViewById<EditText>(R.id.longitudeInput)
        val latitudeInput = findViewById<EditText>(R.id.latitudeInput)
        val descriptionInput = findViewById<EditText>(R.id.descriptionInput)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val readButton = findViewById<Button>(R.id.readButton)
        val restaurantsList = findViewById<ListView>(R.id.list)

        val adapter = ArrayAdapter<Restaurant>(this, android.R.layout.simple_list_item_1, list)

        restaurantsList.adapter = adapter

        fun savePreferences() {
            val jsonRestaurants = gson.toJson(list)

            Log.i("RESTAURANTES", jsonRestaurants)

            val sp = this.getSharedPreferences("RESTAURANTES", MODE_PRIVATE)

            sp.edit().apply {
                putString("LISTA_RESTAURANTES", jsonRestaurants)
                commit()
            }
        }

        fun loadPreferences() {
            val sp = this.getSharedPreferences("RESTAURANTES", MODE_PRIVATE)
            val strRestaurants = sp.getString("LISTA_RESTAURANTES", "[]")
            val restaurants = gson.fromJson(strRestaurants, ArrayList<Restaurant>()::class.java)

            list.clear()
            list.addAll(restaurants)
        }

        saveButton.setOnClickListener {
            val newRestaurant = Restaurant(
                0,
                nameInput.text.toString(),
                addressInput.text.toString(),
                longitudeInput.text.toString().toDouble(),
                latitudeInput.text.toString().toDouble(),
                typeInput.text.toString(),
                0,
                descriptionInput.text.toString()
            )

            list.add(newRestaurant)
            savePreferences()
        }

        readButton.setOnClickListener {
            loadPreferences()
            adapter.clear()
            adapter.addAll(list)
        }
    }
}