package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ArrayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array)

        //배열 할당
        var numArray = IntArray(10)
        // IntArray LongArray CharArray FloatArray DoubleArray
        //문자열 배열
        var stringArray = Array(10, { item -> "" })
        //또는 arrayOf 함수 사용
        var dayArray = arrayOf("MON", "TUE", "WED", "THU")
        
        //배열[인덱스]= 값  배열명.set(인덱스,값)  같은 코드임
        //배열 값 꺼내기
        //배열명[인덱스]  or 배열명.get(인덱스)
        
        
        //컬렉션 -> 동적배열   세가지 리스트, 맵, 셋
        //기존과는 다르게 mutable 붙여줘야함
        // why? 코틀린 설계할때 리스트, 맵, 셋은 수정불가인 immutable로 설계
        // 따라서 mutable로
        


    }
}