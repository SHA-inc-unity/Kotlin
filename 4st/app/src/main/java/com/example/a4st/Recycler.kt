package com.example.a4st

import DateAdapter
import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.File

class Recycler : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: DateAdapter
    private lateinit var photos: List<Photo>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        photos = loadPhotos()

        photoAdapter = DateAdapter(photos)
        recyclerView.adapter = photoAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun loadPhotos(): List<Photo> {
        val photoUris = mutableListOf<Photo>()

        val directory = File("/storage/emulated/0/Android/media/com.example.a4st/photos")
        if (directory.exists()) {
            val files = directory.listFiles()
            files?.forEach { file ->
                photoUris.add(Photo(file.toURI().toString()))
            }
        }

        return photoUris
    }
}


data class Photo(val uri: String)
