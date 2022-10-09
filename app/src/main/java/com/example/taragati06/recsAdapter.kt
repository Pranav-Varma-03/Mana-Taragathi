package com.example.taragati06




import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

//import com.bumptech.glide.Glide

class recsAdapter(private val items: ArrayList<String>, private val listener: recsClicked) : RecyclerView.Adapter<recsViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recs_student_recycler, parent, false)
        val viewHolder = recsViewHolder(view)
        view.setOnClickListener{
            listener.onItemClicked(items[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: recsViewHolder, position: Int) {
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

class recsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleView: TextView = itemView.findViewById(R.id.recsHeading)
}

interface recsClicked {
    fun onItemClicked(item: String)
}