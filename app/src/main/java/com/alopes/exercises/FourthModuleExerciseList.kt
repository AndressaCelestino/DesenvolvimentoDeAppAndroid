package com.alopes.exercises


fun main() {
    /*************** Lista de inteiros e filtros ***************/

    val myIntList: MutableList<Int> = mutableListOf()

        for (i in 0..98 step 1) {
                myIntList.add(i, i +1)
                print(myIntList[i])
                if(i < 98){
                    print("-")
                }
                if (i == 50) {
                    println(" ")
                }
        }
    println(" ")
    println("Essa é a sua lista ")
    print(myIntList)
    val filtered = myIntList.filter{it % 2 == 0}
    println(" ")
    println(" Estes são os numeros pares da sua lista ")
    println(filtered)
    println(" ")

    /*************** Lista de strings, map e forEach ***************/

    val namesList = listOf("Maria","João","Rosa","Pedro")
    val modifiedStates = namesList.map{ "Olá $it tudo bem? "}
        modifiedStates.forEach{ println(it) }
    }

