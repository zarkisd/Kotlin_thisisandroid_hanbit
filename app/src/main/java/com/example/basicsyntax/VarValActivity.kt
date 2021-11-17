package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class VarValActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var name: String
        name = "test"
        Log.d("BasicSyntax", "name is $name")

        //val 변하지 않을때 함수나 클래스 가능
        val ABC:String ="abc"
        //const
        //상수

        Log.d("Tag", "$num");


    }

    companion object {
        const val num : Int = 1
    }
}