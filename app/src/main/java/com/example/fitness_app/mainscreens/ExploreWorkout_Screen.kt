package com.example.fitness_app.mainscreens

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.fitness_app.R
import com.example.fitness_app.databinding.FragmentExploreworkoutScreenBinding
import com.example.fitness_app.databinding.FragmentWorkoutScreenBinding
import com.example.fitness_app.workoutscreens.Specific_Workout

class ExploreWorkout_Screen : Fragment() {

    private lateinit var binding: FragmentExploreworkoutScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentExploreworkoutScreenBinding.inflate(inflater, container, false)
        binding.fatburncategory.setOnClickListener{
          this.findNavController().navigate(R.id.action_workout_Screen_to_fatburn_Screen)
        }
        return binding.root
    }

    companion object {

    }
}