package com.example.mastfinalpoe

import android.R
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//Initialize the views
        val imageView11 = findViewById<ImageView>(com.example.mastfinalpoe.R.id.imageView11)
        val textView = findViewById<TextView>(com.example.mastfinalpoe.R.id.textView10)
        val textView1 = findViewById<TextView>(com.example.mastfinalpoe.R.id.textView11)
        val buttonEdit = findViewById<ImageButton>(com.example.mastfinalpoe.R.id.imageButton6)
        val imageFood = findViewById<ImageView>(com.example.mastfinalpoe.R.id.imageView12)
        val imageFood2 = findViewById<ImageView>(com.example.mastfinalpoe.R.id.imageView15)
        val imageFood3 = findViewById<ImageView>(com.example.mastfinalpoe.R.id.imageView14)
        val imageFood4 = findViewById<ImageView>(com.example.mastfinalpoe.R.id.imageView13)
        val imageFood5 = findViewById<ImageView>(com.example.mastfinalpoe.R.id.imageView16)
        val imageFood6 = findViewById<ImageView>(com.example.mastfinalpoe.R.id.imageView17)
        val textView14 = findViewById<TextView>(com.example.mastfinalpoe.R.id.textView14)
        val textView15 = findViewById<TextView>(com.example.mastfinalpoe.R.id.textView15)
        val textView16 = findViewById<TextView>(com.example.mastfinalpoe.R.id.textView16)
        val textView17 = findViewById<TextView>(com.example.mastfinalpoe.R.id.textView17)


        val ImageButton = findViewById<ImageButton>(com.example.mastfinalpoe.R.id.imageButton6)
        buttonEdit.setOnClickListener()
        {
        };val intent = Intent(this, FINALPOE::class.java)
        startActivity(intent)






    }


}