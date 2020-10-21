package com.example.gridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : CardView = findViewById(R.id.card1)

        button.setOnClickListener(){
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


    }
}
