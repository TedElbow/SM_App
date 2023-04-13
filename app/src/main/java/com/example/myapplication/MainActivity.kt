package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var textInput : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textInput = findViewById(R.id.editTextTextPersonName)
    }

    /** Called when the user Clicks on List Users */
    fun listUsers(view: View) {
        val intent = Intent(this, ListUsers::class.java)
            .putExtra("information",textInput.text.toString())
        startActivity(intent)
    }
}