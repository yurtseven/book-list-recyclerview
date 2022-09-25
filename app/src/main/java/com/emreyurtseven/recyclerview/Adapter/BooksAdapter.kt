package com.emreyurtseven.recyclerview.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.emreyurtseven.recyclerview.Details
import com.emreyurtseven.recyclerview.Model.BooksModel
import com.emreyurtseven.recyclerview.databinding.BookListRowBinding

class BooksAdapter(val bookList: ArrayList<BooksModel>) : RecyclerView.Adapter<BooksAdapter.BooksHolder>() {
    class BooksHolder(val binding: BookListRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksHolder {
        val binding = BookListRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BooksHolder(binding)
    }

    override fun onBindViewHolder(holder: BooksHolder, position: Int) {
        holder.binding.listBookName.text = bookList.get(position).bookName

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,Details::class.java)
            intent.putExtra("book",bookList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return bookList.size
    }
}