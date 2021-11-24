package com.example.basicsyntax

class lateInit {
    init {
        //Nullable 선언 일방적 방법
        class Person {
            var name: String? = null

            init {
                name = "Lionl"
            }

            fun process() {
                name?.plus("Messi")
                print("이름의 길이 = ${name?.length}")
                print("이름 첫글자 = ${name?.substring(0, 1)}")
            }

        }

        class Person2 {
            lateinit var name: String

            init {
                name = "Lionl"
            }

            fun process() {
                name.plus("Messi")
                print("이름의 길이 = ${name.length}")
                print("이름 첫글자 = ${name.substring(0, 1)}")
            }

        }

        class Company {
            val person: Person by lazy { Person() }
            fun process() {
                print("Person 이름은 ${person.name}")
            }
        }


    }
}