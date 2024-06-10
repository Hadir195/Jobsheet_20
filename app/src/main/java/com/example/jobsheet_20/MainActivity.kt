package com.example.jobsheet_20

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.Makanan
import layout.MakananAdapter

class MainActivity : AppCompatActivity() {
    private val list = ArrayList<Makanan>()
    private val listMakanan = arrayOf(
        "Dinda novita putri",
        "Dyah fatma febriani",
        "Evi mailasari",
        "Faricha naila rochmania",
        "Febi aryadi",
        "Hadir sastra imam p",
        "Icha nur anandita",
        "Isnaini maria zulfa",
        "Monika hastari",
        "Muhammad bogi adiputro",
        "Muhammad ulil sultan",

    )
    private val listHarga = arrayOf(
        "2233251",
        "2233252",
        "2233253",
        "2233254",
        "2233255",
        "2233256",
        "2233257",
        "2233258",
        "2233259",
        "2233260",
        "2233261",

    )
    private lateinit var makananView: RecyclerView
    private lateinit var makananAdapter: MakananAdapter

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makananView = findViewById(R.id.makanan)
        makananView.layoutManager = LinearLayoutManager(this)

        for (i in listMakanan.indices){
            list.add(Makanan(listMakanan[i], listHarga[i]))
        }
        makananAdapter = MakananAdapter(list)
        makananAdapter.notifyDataSetChanged()
        makananView.adapter = makananAdapter
    }
}