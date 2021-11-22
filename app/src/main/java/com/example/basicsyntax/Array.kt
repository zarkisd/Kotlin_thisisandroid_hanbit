package com.example.basicsyntax

import android.util.Log

class Array() {

    init {
        //배열 할당
        var numArray = IntArray(10)
        // IntArray LongArray CharArray FloatArray DoubleArray
        //문자열 배열
        var stringArray = Array(10) { _ -> "ts" }
        Log.d("mutable", "string array : ${stringArray[0]}")
        //또는 arrayOf 함수 사용
        var dayArray = arrayOf("MON", "TUE", "WED", "THU")

        //배열[인덱스]= 값  배열명.set(인덱스,값)  같은 코드임
        //배열 값 꺼내기
        //배열명[인덱스]  or 배열명.get(인덱스)


        //컬렉션 -> 동적배열   세가지 리스트, 맵, 셋
        //기존과는 다르게 mutable 붙여줘야함
        // why? 코틀린 설계할때 리스트, 맵, 셋은 수정불가인 immutable로 설계
        // 따라서 mutable로

        var mutableList = mutableListOf("MON", "TUE", "WED")

        mutableList.add("THU")
        Log.d("mutable", mutableList.toString())
        var variable = mutableList.get(1)
        Log.d("mutable", "1번째 $variable")
        mutableList.set(1, "why")
        Log.d("mutable", "2번째 $variable")
        mutableList.removeAt(1)
        Log.d("mutable", "3번쨰 $variable")
        var stringList = mutableListOf<String>()
        stringList.add("월")
        stringList.add("화")
        Log.d("mutable", "stringList 입력된 값은 ${stringList.get(1)}이다")


        //set 중복을 허용하지 않는 리스트
        //인덱스 조회 못함, get함수 없음
        var set = mutableSetOf<String>()
        set.add("JAN")
        set.add("JAN")
        set.add("JAN")
        set.add("JAN")
        Log.d("mutable", "set 전체출력 : $set")
        set.remove("JAN")
        set.add("FEB")
        Log.d("mutable", "set 전체출력 : $set")


        //맵은 키와 값의 쌍으로 이루어짐
        var map = mutableMapOf<String, String>()
        map.put("key1", "value1")
        map.put("key2", "value2")
        map.put("key3", "value3")
        map["key4"] = "value4"
        Log.d("mutable", "map에서 get을 사용하면 가능 ${map.get("key2")}")
        Log.d("mutable", "map에서 get을 사용하면 가능 ${map["key3"]}")
        // 수정
        map["key4"] = "value_new_4"
        map.remove("key3")
        Log.d("mutable", "map 전체 보기 : $map")

        //이뮤터블 immutalbe
        // listof, setof, mapof
    }
}