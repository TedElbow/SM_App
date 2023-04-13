package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.UpdateAppearance
import android.widget.EditText
import android.widget.TextView



class ListUsers : AppCompatActivity() {
    lateinit var textOutput : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_users)
        val information = intent.getStringExtra("information")
        textOutput = findViewById(R.id.textView2)
        textOutput.text = information
    }


}