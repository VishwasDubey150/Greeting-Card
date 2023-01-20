package com.example.greetingcard

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name=findViewById<EditText>(R.id.name)
        var submit=findViewById<Button>(R.id.submit)
        submit.setOnClickListener {
            var person=name.editableText.toString()
            val intent=Intent(this,HBD::class.java)
            intent.putExtra("person",person)
            startActivity(intent)
        }
    }
}

