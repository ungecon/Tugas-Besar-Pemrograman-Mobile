package com.example.pemesananmakanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class Menu : AppCompatActivity() {
    private var spinner1: Spinner? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener(View.OnClickListener {
            var intent = Intent (this, Hasil::class.java)
            startActivity(intent)
        })
        spinner1 = findViewById<View>(R.id.spinner) as Spinner
        spinner1!!.onItemSelectedListener = ItemSelectedListener()
    }

    inner class ItemSelectedListener : AdapterView.OnItemSelectedListener {
        //get strings of first item
        var firstItem = spinner1!!.selectedItem.toString()
        override fun onItemSelected(
            parent: AdapterView<*>,
            view: View,
            pos: Int,
            id: Long
        ) {
            if (firstItem == spinner1!!.selectedItem.toString()) {
// ToDo when first item is selected
            } else {
                Toast.makeText(
                    parent.context,
                    "Kamu telah memilih : " + parent.getItemAtPosition(pos).toString(),
                    Toast.LENGTH_LONG
                ).show()
                // Todo when item is selected by the user
            }
        }

        override fun onNothingSelected(arg: AdapterView<*>?) {
// TODO Auto-generated method stub
            val i = Intent(applicationContext, Hasil::class.java)
            startActivity(i)
        }
    }
}