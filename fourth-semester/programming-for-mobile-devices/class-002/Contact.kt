package com.example.myapplication

class Contact(var name: String, var email: String, var phoneNumber: String) {
    override fun toString(): String {
        return "${this.name}, ${this.email}, ${this.phoneNumber}"
    }
}