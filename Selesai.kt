package com.example.pemesananmakanan

import android.app.ApplicationExitInfo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Selesai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selesai)

        var buttonBack1 = findViewById<Button>(R.id.buttonBack1)
        buttonBack1.setOnClickListener(View.OnClickListener {
            var intent = Intent (this, Menu::class.java)
            startActivity(intent)

        })

        var buttonExit = findViewById<Button>(R.id.buttonExit)
        buttonExit.setOnClickListener(View.OnClickListener {
            moveTaskToBack(true);
        })
    }
}