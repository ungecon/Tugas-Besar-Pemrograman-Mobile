package com.example.pemesananmakanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Debit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debit)

        var buttonBayar = findViewById<Button>(R.id.buttonBayar)
        buttonBayar.setOnClickListener(View.OnClickListener {
            var intent = Intent (this, Selesai::class.java)
            startActivity(intent)
        })
    }
}