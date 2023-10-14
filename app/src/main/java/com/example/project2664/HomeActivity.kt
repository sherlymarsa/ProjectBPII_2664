package com.example.project2664

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //    instance
        val btnBook: Button = findViewById(R.id.menu1)
        val btnMore: Button = findViewById(R.id.menu4)
        val btnReading: Button = findViewById(R.id.menu2)
        val rvBuku: RecyclerView = findViewById(R.id.recycleViewBook)

        //      Set layout manager di RecycleView
        rvBuku.layoutManager = LinearLayoutManager(this)
//            List data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure",
        "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(BukuModel(R.drawable.book2,"Ade's Beach Adventure",
            "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(BukuModel(R.drawable.book4,"Mermaid Beach Adventure",
            "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure",
            "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(BukuModel(R.drawable.book2,"Ade's Beach Adventure",
            "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))
        data.add(BukuModel(R.drawable.book4,"Mermaid Beach Adventure",
            "Lorem ipsum Dolor sit amet Lorem ipsum dolor sit amet"))

//        set adapter
        val adapter = AdapterHome(data)
//        set adapater ke recycle view
        rvBuku.adapter = adapter


//        event saat button Fairy diklik
        btnBook.setOnClickListener{
            val intentBookKidActivity = Intent(this,BookKidActivity::class.java)
            startActivity(intentBookKidActivity)
        }

        btnReading.setOnClickListener{
            val intentReadingActivity = Intent(this,ReadingActivity::class.java)
            startActivity(intentReadingActivity)
        }

        btnMore.setOnClickListener {
            val intentAboutActivity = Intent(this,AboutActivity::class.java)
            startActivity(intentAboutActivity)
        }
    }
}