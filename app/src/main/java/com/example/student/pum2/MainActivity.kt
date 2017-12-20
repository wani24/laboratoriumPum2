package com.example.student.pum2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnZmien.setOnClickListener{
            val miasto = txtWpisz.text

            txtMiasto.text = miasto

        }
        btnMiejsca.setOnClickListener{

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        }
    }






