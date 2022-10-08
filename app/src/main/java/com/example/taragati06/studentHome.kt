package com.example.taragati06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class studentHome : AppCompatActivity(),subjectClicked {


    private lateinit var recyclerView: RecyclerView
//    private lateinit var subjectAdapter:subjectStudentHomeAdapter
    lateinit var toggle :  ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_home)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_timetable -> Toast.makeText(applicationContext,"clicked",Toast.LENGTH_SHORT).show()
            }
            true
        }

        init()

    }

    private fun init(){
        recyclerView =findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        val items = fetchData()
        val adapter: subjectStudentHomeAdapter = subjectStudentHomeAdapter(items,this)
        recyclerView.adapter= adapter

    }
    private fun fetchData() : ArrayList<String>{
        val list = ArrayList<String>()
        list.add("Mathematics")
        list.add("Physics")
        list.add("Chemistry")
        list.add("Biology")
        list.add("Telugu")
        list.add("Hindi")
        list.add("English")
        return list
    }

    override fun onItemClicked(item: String) {
        var subName :String = item

        val intent = Intent(this, inside_subject::class.java)
        intent.putExtra(inside_subject.NAME_EXTRA, subName)
        startActivity(intent)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){

            return true
        }
        return super.onOptionsItemSelected(item)
    }

}
