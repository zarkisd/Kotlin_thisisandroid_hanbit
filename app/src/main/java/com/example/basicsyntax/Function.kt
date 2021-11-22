package com.example.basicsyntax

import android.util.Log

class Function {
    private val Tag = "Fun"

    init {
        //함수
        /**기본형태
         * fun 함수명(파라미터 타입 : 타입) : 반환타입 {
         * return 값
         * }
         **/
        fun square(x: Int): Int {
            return x * x
        }

        //반환값 없는 함수
        fun printSum(x: Int, y: Int) {
            Log.d(Tag, "x+y = ${x + y}")
        }

        //파라미터 없는 함수
        fun getPi(): Double {
            return 3.14
        }
        Log.d(Tag, "Fun square 3 : ${square(3)}")
        printSum(5, 9)
        Log.d(Tag, "Fun getPi() : ${getPi()}")

        //함수 사용
        //함수명(값)

        var squareResult = square(30)
        Log.d(Tag, "30의 제곱은 $squareResult")

        //함수 파라미터 젇의
        //파라미터에서 바로 초기값 정의 가능
        fun newFunction(name: String, age: Int = 29, weight: Double = 100.0) {
            Log.d(Tag, "name : $name")
            Log.d(Tag, "age : $age")
            Log.d(Tag, "weight : $weight")
        }

        newFunction("Hello")
        newFunction("Michael", weight = 87.6)

        //미니퀴즈 3-6-1
        fun doubleSum(x: Int, y: Int): Int {
            return x + y
        }
        Log.d(Tag, "3-6-1 3+5 : ${doubleSum(3, 5)}")
        //미니퀴즈 3-6-2
        fun stairSum(x:Int):Int{
            var sum=0
            for (i in 0..x){
                sum+=i
            }
            return sum
        }
        Log.d(Tag, "3-6-2 10까지의 합 : ${stairSum(10)} ")

    }
}