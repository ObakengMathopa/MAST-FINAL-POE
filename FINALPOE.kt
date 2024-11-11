package com.example.mastfinalpoe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class FINALPOE : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalpoe)

        //Initialize the views
        val imageView3 = findViewById<ImageView>(com.example.mastfinalpoe.R.id.imageView3)
        val textView = findViewById<TextView>(com.example.mastfinalpoe.R.id.textView)
        val textView1 = findViewById<TextView>(com.example.mastfinalpoe.R.id.textView2)
        val textView2 = findViewById<TextView>(com.example.mastfinalpoe.R.id.textView3)
        val imageView = findViewById<ImageView>(com.example.mastfinalpoe.R.id.imageView)
        val imageView2 = findViewById<ImageView>(com.example.mastfinalpoe.R.id.imageView2)
        val imageButton = findViewById<ImageView>(com.example.mastfinalpoe.R.id.imageButton2)
        val textView4 = findViewById<TextView>(com.example.mastfinalpoe.R.id.textView5)

        val ImageButton = findViewById<ImageButton>(com.example.mastfinalpoe.R.id.imageButton2)
        imageButton.setOnClickListener()
        {
        };val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
}