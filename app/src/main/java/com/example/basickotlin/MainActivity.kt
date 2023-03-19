package com.example.basickotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.basickotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        var myName = "코틀린"
        var myAge: Int
        myAge = 30
        myAge = myAge + 1

        setContentView(binding.root)
        binding.btnSay.setOnClickListener {
            binding.textSay.text = "내 이름은 ${myName}이야! 나이는 ${myAge}살이지!"
        }


        Log.d("BasicSyntax", "myName = $myName myAge = $myAge")
    }
}