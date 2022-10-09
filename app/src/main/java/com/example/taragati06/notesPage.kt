package com.example.taragati06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class notesPage : AppCompatActivity(),notesClicked {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes_page)

        init()
    }

    private fun init(){
        recyclerView =findViewById(R.id.recyclerViewNotes)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        val items = fetchData()
        val adapter: notesAdapter = notesAdapter(items,this)
        recyclerView.adapter= adapter

    }
    private fun fetchData() : ArrayList<String>{
        val list = ArrayList<String>()
        list.add("PDF A")
        list.add("PDF B")
        list.add("PDF C")
        list.add("PDF D")
        list.add("PDF E")
        list.add("PDF F")
        list.add("PDF G")
        return list
    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this, "clicked $item", Toast.LENGTH_SHORT).show()
    }
}