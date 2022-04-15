package com.example.gesture

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.gesture.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.constraint2Id.setOnTouchListener(object: MainActivity.OnSwipeTouchListener(this@MainActivity2){
            override fun onSwipeLeft() {
                super.onSwipeLeft()
                val intent= Intent(this@MainActivity2,MainActivity::class.java)
                startActivity(intent)
               }
        })
    }
}
