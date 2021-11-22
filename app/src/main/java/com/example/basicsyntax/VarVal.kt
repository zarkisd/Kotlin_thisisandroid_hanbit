package com.example.basicsyntax

import android.util.Log

class VarVal {

    init {

        var name: String
        name = "test"
        Log.d("BasicSyntax", "name is $name")

        //val 변하지 않을때 함수나 클래스 가능
        val ABC: String = "abc"
        //const
        //상수

        Log.d("Tag", ABC);
    }
}