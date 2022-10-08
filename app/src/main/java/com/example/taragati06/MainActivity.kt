package com.example.taragati06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Login_Page(view: View) {
        val intent = Intent(this, Login_Page_controller::class.java)
        startActivity(intent)
    }
}