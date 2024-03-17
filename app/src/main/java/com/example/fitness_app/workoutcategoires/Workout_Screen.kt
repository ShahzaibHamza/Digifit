package com.example.fitness_app.workoutcategoires

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitness_app.R
import com.example.fitness_app.databinding.FragmentExploreworkoutScreenBinding
import com.example.fitness_app.databinding.FragmentWorkoutScreenBinding
import com.example.fitness_app.workoutscreens.Specific_Workout


class Workout_Screen : Fragment() {

    private lateinit var binding: FragmentWorkoutScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWorkoutScreenBinding.inflate(inflater, container, false)
        binding.fullbody.setOnClickListener{
            val intent = Intent(context, Specific_Workout::class.java)
            startActivity(intent)
        }
        return binding.root
    }

    companion object {

    }
}