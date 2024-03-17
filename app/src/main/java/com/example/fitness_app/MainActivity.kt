package com.example.fitness_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.fitness_app.mainscreens.Home_Screen
import com.example.fitness_app.mainscreens.ExploreWorkout_Screen
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

        //initialize view
        private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //join view in XML
        bottomNavigationView = findViewById(R.id.bottom_navbar)

        //logic for navbar on click screen change
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.homeicon -> {
                    changescreen(Home_Screen())
                    true
                }
                R.id.workouticon -> {
                    changescreen(ExploreWorkout_Screen())
                    true
                }
                R.id.journalicon -> {
                    Toast.makeText(this, "Comming Soon!!",Toast.LENGTH_LONG).show()
                    true
                }
                R.id.profileicon -> {
                    Toast.makeText(this, "Comming Soon!!",Toast.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        }
        //initial screen to start when app is loaded
        changescreen(Home_Screen())
    }

    //changes screen on click in nav bar
    private fun changescreen(fragment: Fragment)
    {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentcontainer, fragment).commit()
    }
}