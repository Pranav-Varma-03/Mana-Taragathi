package com.example.taragati06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class inside_subject : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inside_subject)

        // NEED TO RECEIVE
        val subname = intent.getStringExtra(NAME_EXTRA)
        val subjectNameTV : TextView = findViewById(R.id.subjectNameTV)
        subjectNameTV.text = subname
    }
    fun AnnouncementPage(view: View){
        val intent = Intent(this, announcementPage::class.java)
        startActivity(intent)
    }
    fun notesPage(view: View){
        val intent = Intent(this, notesPage::class.java)
        startActivity(intent)
    }
    fun recsPage(view: View){
        val intent = Intent(this, recsPage::class.java)
        startActivity(intent)
    }
    fun examPage(view: View){
        val intent = Intent(this, examPage::class.java)
        startActivity(intent)
    }
    fun grpChatPage(view: View){
        val intent = Intent(this, grpChatPage::class.java)
        startActivity(intent)
    }
}