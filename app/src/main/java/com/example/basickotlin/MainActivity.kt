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

        // 배열
        var number = IntArray(2)
        number[0] = 10
        number.set(1, 2)
        var two = number[1]
        var dayArray = arrayOf("월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일")
//        dayArray[7] = "공휴일"   // 배열의 범위를 넘었다는 에러 발생
        Log.d("배열값", "number[0] : $two, dayArray[5] : ${dayArray.get(4)}")

        // 컬렉션 리스트
        var fruit = listOf("딸기", "망고", "사과")
        var num = mutableListOf("1", "3", "5")
//        fruit.add("리치")   // 에러발생 : 상수배열로 값을 추가할 수 없음
        num.add("9")
        num.set(2, "7")
        num.removeAt(1)

        var strList = mutableListOf<String>()
        strList.add("인덱스 0")

        Log.d("num 리스트", "내가 좋아하는 숫자는 ${num[1]}, num배열크기 : ${num.size}")
        Log.d("strList 리스트", "${strList.get(0)}")

        // 컬렉션 맵
        var map = mutableMapOf<String, String>()
        map.put("key1", "value1")
        map.put("key2", "value2")
        map.put("key3", "value3")
        map.remove("key2")
        map.put("key3", "update1")

        Log.d("map 맵", "${map.get("key3")}")

        // 컬렉션 셋
        var set = mutableSetOf<String>()
        set.add("월요일")
        set.add("화요일")
        set.add("수요일")
        set.add("목요일")
        set.add("목요일")  // 값 추가 안됨
        set.remove("화요일")

        Log.d("set 셋", "set 전체 출력 : ${set}")

        binding.btnSay.setOnClickListener{
            binding.textSay.text = "내가 좋아하는 과일은 ${set.size}"
        }
    }
}