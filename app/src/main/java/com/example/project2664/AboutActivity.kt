package com.example.project2664

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.ImageView



class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

//        instance
        val call:ImageView = findViewById(R.id.imageViewCall)
        val web:ImageView = findViewById(R.id.imageViewBrowser)
        val location:ImageView = findViewById(R.id.imageViewMaps)

//        dial number
        call.setOnClickListener {
            val callIntent: Intent= Uri.parse("tel:089668369180").let {
                    number-> Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }

//        website
        web.setOnClickListener {
            val webIntent:Intent= Uri.parse("https://home.amikom.ac.id/").let {
                    webpage-> Intent(Intent.ACTION_VIEW,webpage)
            }
            startActivity(webIntent)
        }

//        lokasi
        location.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:47.6,-122,3?z=11")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            }
        }
    }
}