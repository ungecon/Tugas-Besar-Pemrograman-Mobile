package com.example.pemesananmakanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_daftar.*

class Daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        var buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        buttonSubmit.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Terimakasih!\nAnda telah berhasil membuat akun\nSilahkan SIGN IN kembali!", Toast.LENGTH_LONG).show()
        })
        var buttonMasuk1 = findViewById<Button>(R.id.buttonMasuk1)
        buttonMasuk1.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }
}