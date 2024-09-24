package com.example.a4st

import android.os.Bundle
import android.content.Intent
import android.content.pm.PackageManager
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.buttonToCamera).setOnClickListener {
            val intent = Intent(this, CamActive::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonToRecycler).setOnClickListener {
            val intent = Intent(this, Recycler::class.java)
            startActivity(intent)
        }
    }
}