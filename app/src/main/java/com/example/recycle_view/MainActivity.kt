package com.example.recycle_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun newpage(view: View) {
        val i= Intent(this,newpage::class.java)
         var name=edname.text.toString()
         var location=edlocation.text.toString()
         var mobile=edmobile.text.toString()
         var mail=edmail.text.toString()
        i.putExtra("name",name)
        i.putExtra("location",location)
        i.putExtra("mobile",mobile)
        i.putExtra("mail",mail)
        startActivity(i)
    }
}