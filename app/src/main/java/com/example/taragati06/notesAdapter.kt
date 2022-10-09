package com.example.taragati06




import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

//import com.bumptech.glide.Glide

class notesAdapter(private val items: ArrayList<String>, private val listener: notesClicked) : RecyclerView.Adapter<notesViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): notesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.notes_student_recycler, parent, false)
        val viewHolder = notesViewHolder(view)
        view.setOnClickListener{
            listener.onItemClicked(items[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: notesViewHolder, position: Int) {
        val currentItem = items[position]
        holder.titleView.text = currentItem
    }


//    fun updateNews(updatedNews: ArrayList<News>) {
//        items.clear()
//        items.addAll(updatedNews)
//
//        notifyDataSetChanged()
//    }
}

class notesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleView: TextView = itemView.findViewById(R.id.notesHeading)
}

interface notesClicked {
    fun onItemClicked(item: String)
}