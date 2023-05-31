package com.example.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mylistview=findViewById<ListView>(R.id.list_view)
        val country= arrayOf("Kenya,Tanzania,Uganda,ethiopia,Senegal,Rwanda,Burundi,Somalia")
        val arrayAdapter:ArrayAdapter<String> =
            ArrayAdapter(this,android.R.layout.simple_list_item_1,country)
        mylistview.adapter=arrayAdapter

        mylistview.setOnItemClickListener { adapterView, view,Position, l ->
            Toast.makeText(this,"you have clicked on"+ country[Position],Toast.LENGTH_LONG).show()
        }
    }
    }

