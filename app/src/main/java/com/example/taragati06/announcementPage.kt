package com.example.taragati06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class announcementPage : AppCompatActivity() ,announcementClicked{

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_announcement_page)

        init()
    }

    private fun init(){
        recyclerView =findViewById(R.id.recyclerViewAnnouncement)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        val items = fetchData()
        val adapter: announcementAdapter = announcementAdapter(items,this)
        recyclerView.adapter= adapter

    }
    private fun fetchData() : ArrayList<String>{
        val list = ArrayList<String>()
        list.add("A Today class has been cancelled")
        list.add("B Today class has been cancelled")
        list.add("C Today class has been cancelled")
        list.add("D Today class has been cancelled")
        list.add("E Today class has been cancelled")
        list.add("F Today class has been cancelled")
        list.add("G Today class has been cancelled")
        return list
    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
    }
}