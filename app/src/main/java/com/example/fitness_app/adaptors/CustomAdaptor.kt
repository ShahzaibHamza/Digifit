package com.example.fitness_app.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitness_app.R
import com.example.fitness_app.viewmodel.workoutsViewModel

class CustomAdaptor(private val mList: List<workoutsViewModel>) : RecyclerView.Adapter<CustomAdaptor.ViewHolder>() {

    private lateinit var mylistener: OnItemClickListener
    interface OnItemClickListener
    {
        fun OnItemClick(position: Int)
    }

    fun setOnItemClickListener(listener :OnItemClickListener )
    {
        mylistener = listener
    }

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.workout_card, parent, false)

        return ViewHolder(view, mylistener)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val workoutsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(workoutsViewModel.workoutimg)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = workoutsViewModel.workoutnames

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.workoutimg)
        val textView: TextView = itemView.findViewById(R.id.workoutname)

        init {
            itemView.setOnClickListener{
                listener.OnItemClick(adapterPosition)
            }
        }


    }
}
