package com.example.taragati06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class recsPage : AppCompatActivity(),recsClicked {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recs_page)

        init()
    }

    private fun init(){
        recyclerView =findViewById(R.id.recyclerViewRecs)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        val items = fetchData()
        val adapter: recsAdapter = recsAdapter(items,this)
        recyclerView.adapter= adapter

    }
    private fun fetchData() : ArrayList<String>{
        val list = ArrayList<String>()
        list.add("A")
        list.add("B")
        list.add("C")
        list.add("D")
        list.add("E")
        list.add("F")
        list.add("G")
        list.add("H")
        list.add("I")
        list.add("J")
        list.add("K")
        list.add("L")
        list.add("M")
        list.add("N")
        list.add("O")
        list.add("P")


        return list
    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this, "clicked $item", Toast.LENGTH_SHORT).show()
    }
}