package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // the layoutManager allows the recyclerView to use the adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val numArray = IntArray(20) {i -> (i + 1) * 5}
        recyclerView.adapter = NumberDisplayAdapter(numArray)
    }
}