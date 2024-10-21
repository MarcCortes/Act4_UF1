package com.example.botoapretat

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.act4_uf1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val logcatButton: Button = findViewById(R.id.logcatButton)
        logcatButton.setOnClickListener {
            Log.d("MainActivity", "boto apretat")
        }

        val toastButton: Button = findViewById(R.id.toastButton)
        toastButton.setOnClickListener {
            Toast.makeText(this, "boto apretat", Toast.LENGTH_SHORT).show()
        }
    }
}
