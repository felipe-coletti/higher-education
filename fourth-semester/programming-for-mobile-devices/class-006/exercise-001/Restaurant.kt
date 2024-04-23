package com.example.myapplication

data class Restaurant(
    val id : Long = 0,
    val name : String = "",
    val address : String = "",
    val longitude: Double = 0.0,
    val latitude : Double = 0.0,
    val type : String = "",
    val classification : Int = 0,
    val description : String = ""
) {
}