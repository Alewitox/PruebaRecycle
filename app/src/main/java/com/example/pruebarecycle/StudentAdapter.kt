package com.example.pruebarecycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class StudentsAdapter(var students: ArrayList<Student>) :
    RecyclerView.Adapter<StudentsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.content_main, null)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.textViewName.text = students[position].name
    }

    override fun getItemCount(): Int {
        return students.size
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var textViewName: TextView

        init {
            textViewName = v.findViewById(R.id.textViewName)
        }
    }

}
