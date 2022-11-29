package com.example.viva1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity2 : AppCompatActivity() {
    var i:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var lay2 = findViewById<ConstraintLayout>(R.id.layout2)

        btn1.setOnClickListener {
            Intent(applicationContext,MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }
        btn2.setOnClickListener {
            if(i==0)
            {
                lay2.setBackgroundColor(Color.parseColor("#6750A4"))
                i++
            }
            else{
                lay2.setBackgroundColor(Color.parseColor("#FFFFFF"))
                i--
            }
        }
    }
}