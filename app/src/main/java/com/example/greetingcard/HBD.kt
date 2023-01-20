package com.example.greetingcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class HBD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hbd)
        var wish=findViewById<TextView>(R.id.wish)
        val name=intent.getStringExtra("person")

        wish.text="Happy birthday $name"
    }
}