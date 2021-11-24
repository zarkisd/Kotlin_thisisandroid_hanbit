package com.example.basicsyntax

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basicsyntax.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


//        //변수
//        var varval=VarVal()
//        binding.tvName.text = "VarVal"
//
//        //조건
//        var controlflow=ControlFlow()
//        binding.tvName.text = "ControlFlow"
//
//        //배열
//        var array = Array()
//        binding.tvName.text = "Array"
//
//        //반복문
//        var forwhile = For_While()
//        binding.tvName.text = "For_While"

        //함수
//        var function = Function()
//        binding.tvName.text="Function"

        //Null 처리
//        var nullclass=NullClass()
//        binding.tvName.text="NULL"

        //lateinit
//        var lateinit = lateInit()
//        binding.tvName.text = "lateinit"

        //scope
        var scope = ScopeFun()
        binding.tvName.text = "scopefun"



    }
}