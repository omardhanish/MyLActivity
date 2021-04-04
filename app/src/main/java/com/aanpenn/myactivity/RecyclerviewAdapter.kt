package com.aanpenn.myactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewAdapter(var context: Context , var list : MutableList<Employee>) : RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_list , parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvOne.setText(list.get(position).firstName)
        holder.tvTwo.setText(list.get(position).employeeCode)
        holder.tvThree.setText(list.get(position).emailAddress)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    inner class ViewHolder(var view : View) : RecyclerView.ViewHolder(view) {

        val button : Button
        val tvOne : TextView
        val tvTwo : TextView
        val tvThree : TextView
        val Image : ImageView

        init {
            button = view.findViewById(R.id.button)
            tvOne = view.findViewById(R.id.tvOne)
            tvTwo = view.findViewById(R.id.tvTwo)
            tvThree = view.findViewById(R.id.tvThree)
            Image = view.findViewById(R.id.image)

            button.setOnClickListener {
                list.removeAt(adapterPosition)
                notifyItemRemoved(adapterPosition)
            }
        }

    }

}