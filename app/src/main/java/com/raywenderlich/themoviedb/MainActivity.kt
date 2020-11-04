package com.raywenderlich.themoviedb

import android.os.Bundle
import android.view.View
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sets the whole search box as clickable (not just the search icon)
        val searchView = findViewById<SearchView>(R.id.mainSearch)
        searchView.setOnClickListener { searchView.isIconified = false }
    }

}