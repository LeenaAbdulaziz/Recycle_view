package com.example.recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class newpage : AppCompatActivity() {
    var details = mutableListOf<String>()
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newpage)

        recyclerView = findViewById(R.id.rv)


        val name=intent.getStringExtra("name")
        val location=intent.getStringExtra("location")
        val mobile=intent.getStringExtra("mobile")
        val mail=intent.getStringExtra("mail")
        recyclerView.adapter = RVAdapter(this,details)
        recyclerView.layoutManager = LinearLayoutManager(this)
        details.add("${name}")
        details.add( "${location}")
        details.add("${mobile}")
        details.add("${mail}")
    }
}