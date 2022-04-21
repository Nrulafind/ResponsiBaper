package com.example.responsibaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.responsibaper.MainActivity2
import com.example.responsibaper.R

class MainActivity : AppCompatActivity() {
    private lateinit var tv_1: TextView
    private lateinit var tv_2: TextView
    private lateinit var tv_3: TextView
    private lateinit var tv_math: TextView
    private lateinit var tv_color: TextView
    private lateinit var tv_planet: TextView
    private lateinit var bt_see_more: Button
    private lateinit var r_1: RelativeLayout
    private lateinit var r_2: RelativeLayout
    private lateinit var r_3: RelativeLayout
    //BOX


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Asosiasi
        tv_1 = findViewById(R.id.tv_1)
        tv_2 = findViewById(R.id.tv_2)
        tv_3 = findViewById(R.id.tv_3)
        tv_math = findViewById(R.id.tv_math)
        tv_planet = findViewById(R.id.tv_planet)
        tv_color = findViewById(R.id.tv_color)
        bt_see_more = findViewById(R.id.bt_see_more)
        r_1 = findViewById(R.id.r_1)
        r_2 = findViewById(R.id.r_2)
        r_3 = findViewById(R.id.r_3)

        r_1.setOnClickListener{
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
    }
}