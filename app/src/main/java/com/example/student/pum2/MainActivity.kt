package com.example.student.pum2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.support.v4.app.BundleCompat
import java.lang.Object
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;
class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this);

        btnZmien.setOnClickListener{
            val miasto = txtWpisz.text

            txtMiasto.text = miasto


        }
        btnMiejsca.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("data", txtMiasto.text)

            startActivity(intent)



        }





        }
    }






