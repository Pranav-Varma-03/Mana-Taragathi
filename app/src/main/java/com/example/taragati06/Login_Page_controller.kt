package com.example.taragati06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatViewInflater

class Login_Page_controller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
    }

    fun HomePage(view: View) {

        // takes input from email box.
        val emailInput:EditText=findViewById(R.id.emailInput)
        val email = emailInput.text.toString()

        //takes input from password box.
        val passwordInput:EditText=findViewById(R.id.passwordInput)
        val password = passwordInput.text.toString()

        val intent = Intent(this, studentHome::class.java)
        startActivity(intent)
    }
}