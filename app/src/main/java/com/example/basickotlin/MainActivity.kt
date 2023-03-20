package com.example.basickotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.basickotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myName = "코틀린" // 이름을 바꿀 수 없다
        var age: Int
        age = 31
        var myInfo: String
//        myName = "자바" //에러 발생
        when(age) {
            30 -> {
                Log.d("when문 결과값", "나이는 30살입니다}")
                myInfo = "내 이름은 ${myName}이고, 나이는 30살입니다."
            }
            31 -> {
                Log.d("when문 결과값", "나이는 31살입니다")
                myInfo = "내 이름은 ${myName}이고, 나이는 31살입니다."
            }
            32 -> {
                Log.d("when문 결과값", "나이는 32살입니다")
                myInfo = "내 이름은 ${myName}이고, 나이는 32살입니다."
            }
            else -> {
                Log.d("when문 결과값", "나이는 33살입니다")
                myInfo = "내 이름은 ${myName}이고, 나이는 33살입니다."
            }
        }

        binding.btnSay.setOnClickListener{
            binding.textSay.text = myInfo;
        }
    }
}