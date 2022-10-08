package com.example.taragati06

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
//import com.bumptech.glide.Glide

class subjectStudentHomeAdapter(private val items: ArrayList<String>,private val listener: subjectClicked) : RecyclerView.Adapter<subjectViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): subjectViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.subject_recycler, parent, false)
        val viewHolder = subjectViewHolder(view)
        view.setOnClickListener{
            listener.onItemClicked(items[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: subjectViewHolder, position: Int) {
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

class subjectViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleView: TextView = itemView.findViewById(R.id.title)
}

interface subjectClicked {
    fun onItemClicked(item: String)
}

//class NewsListAdapter(private val listener: subjectClicked): RecyclerView.Adapter<subjectViewHolder>() {
//
//    private val items: ArrayList<News> = ArrayList()
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): subjectViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.subject_recycler, parent, false)
//        val viewHolder = subjectViewHolder(view)
//        view.setOnClickListener{
//            listener.onItemClicked(items[viewHolder.adapterPosition])
//        }
//        return viewHolder
//    }
//
//    override fun getItemCount(): Int {
//        return items.size
//    }
//
//    override fun onBindViewHolder(holder: subjectViewHolder, position: Int) {
//        val currentItem = items[position]
//        holder.titleView.text = currentItem.title
//        holder.author.text = currentItem.author
//    }
//
//
//}

