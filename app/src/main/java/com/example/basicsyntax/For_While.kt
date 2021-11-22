package com.example.basicsyntax

import android.util.Log

class For_While {

    init {

        //for (반복한 범위){
        // 실행 코드
        //  }

//        for (변수  in 시작값..종료값){

//        }
        for (i in 1..10 + 1) {
            Log.d("For", "$i 출력")
        }
        for (i in 1 until 10 + 1) {
            Log.d("For", "$i 출력")
        }

        //step사용
        for (i in 0..10 step 3) {
            Log.d("For", "현재 수는 $i")
        }

        //downTo
        for (i in 10 downTo 0 step 2) {
            Log.d("For", "down to $i")
        }
        var arrayMonth = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")
        for (i in arrayMonth) {
            Log.d("For", "현재 요일은 $i")
        }


        //while
        //반복 가능한 if문
        //while(조건식) {
        // 코드
        // }
        var a = 1
        while (a == 10) {
            Log.d("For", "$a 입니다.")
            a += 1
        }


        var current = 1
        var until = 12
        while (current < until) {
            Log.d("For", "현재값은 $current 이다.")
            current += 1
        }

        var game = 1
        val match = 6
        do {
            Log.d("For", "${game} win. victory left ${match - game} game")
            game += 1
        } while (game < match)
        //do-while은 무조건 do 실행 후 반복문

        //반복문 제어 1 break
        for (i in 1..10) {
            Log.d("For", "현재 i는 ${i}입니다.")
            if (i > 5) {
                break
            }
        }
        //제어 2 continue
        for (except in 1..10) {
            if (except in 4..7) {
                continue
            }
            Log.d("For", "현재 except는 ${except}입니다.")
        }

    }

}