package com.example.pemesananmakanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Hasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        var buttonDebit = findViewById<Button>(R.id.buttonDebit)
        buttonDebit.setOnClickListener(View.OnClickListener {
            var intent = Intent (this, Debit::class.java)
            startActivity(intent)
        })

        var buttonBank = findViewById<Button>(R.id.buttonBank)
        buttonBank.setOnClickListener(View.OnClickListener {
            var intent = Intent (this, Bank::class.java)
            startActivity(intent)
        })
    }
}