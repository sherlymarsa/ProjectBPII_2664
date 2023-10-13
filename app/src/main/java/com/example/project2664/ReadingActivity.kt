package com.example.project2664

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class ReadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reading)

        //    instance
        val btnPicture: Button = findViewById(R.id.buttonPicture)
        val btnBoard: Button = findViewById(R.id.buttonBoard)
        val btnStory: Button = findViewById(R.id.buttonStory)


//        event saat button Picture diklik
        btnPicture.setOnClickListener {
            replaceFragment(PictureFragment())
        }
//        event saat button Board diklik
        btnBoard.setOnClickListener {
            replaceFragment(BoardFragment())
        }
//        event saat button Story diklik
        btnStory.setOnClickListener {
            replaceFragment(StoryFragment())
        }
    }

    private fun replaceFragment(frg: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentReading,frg)
        fragmentTrx.commit()
    }
}