package com.example.taragati06




import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

//import com.bumptech.glide.Glide

class announcementAdapter(private val items: ArrayList<String>, private val listener: announcementClicked) : RecyclerView.Adapter<announcementViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): announcementViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.announcement_recycler, parent, false)
        val viewHolder = announcementViewHolder(view)
        view.setOnClickListener{
            listener.onItemClicked(items[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: announcementViewHolder, position: Int) {
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

class announcementViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleView: TextView = itemView.findViewById(R.id.announcementMatter)
}

interface announcementClicked {
    fun onItemClicked(item: String)
}