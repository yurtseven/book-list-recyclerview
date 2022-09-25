package com.emreyurtseven.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.emreyurtseven.recyclerview.Adapter.BooksAdapter
import com.emreyurtseven.recyclerview.Model.BooksModel
import com.emreyurtseven.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var booksList: ArrayList<BooksModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        booksList = ArrayList<BooksModel>()

        val halifelerkoyu = BooksModel("Halifeler Köyü","Altar Kaplan",R.drawable.hk)
        val ec = BooksModel("Esrar-ı Cinayat","Ahmet Mithat Efendi",R.drawable.ec)
        val aliklarbirligi = BooksModel("Alıklar Birliği","John Kennedy Toole", R.drawable.aliklarbirligi)
        val dedekorkut = BooksModel("Dede Korkut Hikayeleri", "Anonim", R.drawable.dedekorkut)
        val did = BooksModel("Deli İbram Divanı", "Ahmet Büke", R.drawable.did)
        val acg = BooksModel("At Çalmaya Gidiyoruz", "Per Petterson", R.drawable.acg)
        val yedi = BooksModel("7","Cem Akaş",R.drawable.yedi)

        booksList.add(halifelerkoyu)
        booksList.add(ec)
        booksList.add(aliklarbirligi)
        booksList.add(dedekorkut)
        booksList.add(did)
        booksList.add(acg)

        booksList.add(ec)
        booksList.add(did)
        booksList.add(aliklarbirligi)
        booksList.add(dedekorkut)
        booksList.add(halifelerkoyu)
        booksList.add(acg)
        booksList.add(yedi)

        booksList.add(dedekorkut)
        booksList.add(ec)
        booksList.add(halifelerkoyu)
        booksList.add(did)
        booksList.add(aliklarbirligi)
        booksList.add(acg)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val bookAdapter = BooksAdapter(booksList)
        binding.recyclerView.adapter = bookAdapter
    }
}