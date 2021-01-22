package com.example.pemesananmakanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Bank : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank)

        var buttonBNI = findViewById<Button>(R.id.buttonBNI)
        buttonBNI.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Bni::class.java)
            startActivity(intent)
        })

        var buttonBCA = findViewById<Button>(R.id.buttonBCA)
        buttonBCA.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Bca::class.java)
            startActivity(intent)
        })

        var buttonMANDIRI = findViewById<Button>(R.id.buttonMANDIRI)
        buttonMANDIRI.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Mandiri::class.java)
            startActivity(intent)
        })

        var buttonMEGA = findViewById<Button>(R.id.buttonMEGA)
        buttonMEGA.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Mega::class.java)
            startActivity(intent)
        })

        var buttonNIAGA = findViewById<Button>(R.id.buttonNIAGA)
        buttonNIAGA.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Niaga::class.java)
            startActivity(intent)
        })

        var buttonDANAMON = findViewById<Button>(R.id.buttonDANAMON)
        buttonDANAMON.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Danamon::class.java)
            startActivity(intent)
        })

        var buttonMUAMALAT = findViewById<Button>(R.id.buttonMUAMALAT)
        buttonMUAMALAT.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Muamalat::class.java)
            startActivity(intent)
        })

        var buttonPERMATA = findViewById<Button>(R.id.buttonPERMATA)
        buttonPERMATA.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Permata::class.java)
            startActivity(intent)
        })
    }
}