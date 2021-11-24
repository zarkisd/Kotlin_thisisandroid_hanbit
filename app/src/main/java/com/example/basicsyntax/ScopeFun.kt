package com.example.basicsyntax

class ScopeFun {
    private val Tag = "scope"

    init {

        var list = mutableListOf("Scope", "Function")
        list.run {
            val listSize = size
            println("list length : $listSize")
        }

        //this로 사용되는 스코프함수 run,apply, with
        //it으로 사용되는 스코프함수 let, also

        //this 자체 반환하는 스코프 함수 apply also -> count 안함
        val afterApply = list.apply {
            add("Apply")
            count()
        }
        println("반환값 apply = $afterApply")
        val afterAlso = list.also {
            it.add("Also")
            it.count()
        }
        println("반환값 also  = $afterAlso")
        //마지막 시행코드 반환 let run with
        val lastCount = list.let {
            it.add("Run")
            it.count()
        }
        println("return let = $lastCount")
        val lastItem = list.run {
            add("Run")
            get(size - 1)
        }
        println("return run=$lastItem")
        val lastItemWith = with(list) {
            add("With")
            get(size - 1)
        }
        println("return with = $lastItemWith")

    }
}