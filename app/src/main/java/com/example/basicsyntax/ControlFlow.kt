package com.example.basicsyntax

import android.util.Log

class ControlFlow {

    init {

        // if 절
        var ball = 4
        if (ball > 3) {
            Log.d("ControlFlow", "4볼로 출루합니다")
        } else {
            Log.d("ControlFlow", "다음타석으로 대기")
        }

        var a = 5
        var b = 3
        var bigger = if (a > b) a else b
        Log.d("ControlFlow", "bigger is $bigger")

        var eraOfRyu = 2.32
        var eraOfDegrom = 2.43
        val era = if (eraOfRyu < eraOfDegrom) {
            Log.d("MLB_Result", "2019 류현진이 디그롬 이김")
            eraOfRyu
        } else {
            Log.d("MLB_Result", "2019 디그롬이 류현진 이김")
            eraOfDegrom
        }
        Log.d("MLOB_Result", "2019 MLB에서 가장 높은  ERA는 ${era}입니다")


        //When
        val now = 10
        when (now) {
            8, 9 -> {
                Log.d("when", "현재는 88시 아니면 9시입니다.")
            }
            else -> {
                Log.d("When", "현재 시각은 ${now}입니다")
            }

        }

        var ageOfMichael = 19
        when (ageOfMichael) {
            in 10..19 -> {
                Log.d("when", "마이클은 10대입니다.")
            }
            !in 10..19 -> {
                Log.d("When", "마이클은 10대가 아니다")
            }
            else -> {
                Log.d("When", "마이클의 나이를 모릅니니다")
            }
        }

        var currentTime: Int
        currentTime = 6
        when {
            currentTime == 5 -> {
                Log.d("when", "현재 5시")
            }
            currentTime > 5 -> {
                Log.d("when", "5시가 넘었습니다.")
            }
            else -> {
                Log.d("when", "5시 이전")
            }
        }

    }
}