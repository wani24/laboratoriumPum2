package com.example.student.pum2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        txtMiasto1.setOnClickListener{
            val bundle = Bundle()

            val napis = bundle.getBundle("data")

            txtMiasto1.setText(napis.toString())
        }


    }
}
