package com.emreyurtseven.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emreyurtseven.recyclerview.Model.BooksModel
import com.emreyurtseven.recyclerview.databinding.ActivityDetailsBinding
import com.emreyurtseven.recyclerview.databinding.ActivityMainBinding

class Details : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedBook = intent.getSerializableExtra("book") as BooksModel

        binding.bookName.text = selectedBook.bookName
        binding.writerName.text = selectedBook.writerName
        binding.bookImage.setImageResource(selectedBook.bookImage)
    }
}