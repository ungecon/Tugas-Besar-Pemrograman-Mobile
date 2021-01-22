package com.example.pemesananmakanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.pemesananmakanan.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonMasuk = findViewById<Button>(R.id.buttonMasuk)
        buttonMasuk.setOnClickListener(View.OnClickListener {
            var intent = Intent (this, Menu::class.java)
            startActivity(intent)
        })

        var buttonDaftar = findViewById<Button>(R.id.buttonDaftar)
        buttonDaftar.setOnClickListener(View.OnClickListener {
            var intent = Intent (this, Daftar::class.java)
            startActivity(intent)
        })

    }
}
