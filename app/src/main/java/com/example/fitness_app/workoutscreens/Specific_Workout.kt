package com.example.fitness_app.workoutscreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitness_app.R
import com.example.fitness_app.adaptors.CustomAdaptor
import com.example.fitness_app.viewmodel.workoutsViewModel

class Specific_Workout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_specific_workout)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.workoutlist)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<workoutsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..11) {
        data.add(workoutsViewModel(R.drawable.jumping_jacks, "jumping jacks","0:30s"))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdaptor(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

        adapter.setOnItemClickListener(object : CustomAdaptor.OnItemClickListener {
            override fun OnItemClick(position: Int) {
                val intent = Intent(applicationContext, Workout1::class.java)
                startActivity(intent)
            }

        })

    }
}