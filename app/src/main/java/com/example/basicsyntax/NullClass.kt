package com.example.basicsyntax

import android.util.Log

class NullClass {
    private val Tag = "null"

    init {

        //null입력 ?
        var varialbe: String?
        varialbe = null
        //함수 파라미터null허용
        fun nullParameter(str: String?) {
            if (str != null) {
                var length2 = str.length
                Log.d(Tag, "str length : $length2")
            }
        }
        nullParameter("null값 허용")
        //return type null
        fun nullReturn(): String? {
            return null
        }

        //안전한 호출
        fun testSafeCall(str: String?): Int? {
            var resultNull: Int? = str?.length
            return resultNull
        }
        Log.d(Tag, testSafeCall("abcdefg").toString())

        //null값 대체

        fun testElvis(str: String?): Int {
            var resultNonNull: Int = str?.length ?: 0
            return resultNonNull
        }

        var nullable: String? = null
        var size = nullable?.length?:33
        Log.d(Tag, "문자열의 길이 : $size")

    }
}