package com.alopes.exercises

class FourthModuleClasses {
}

fun main() {
    //val concat: (String, String) -> Unit = {val1,val2 -> println(val1+val2)}
    //val numberOfLetters = {val1: String, val2: String -> println("$val1 has ${val1.length} letters and $val2 has ${val2.length} letters ")}
    val number = 4
    println(number.isEven())

    val baseText = "Today"
    baseText.myConcat(" is gonna be a good day")

    val result = 15.0 mySum 10.0
    println(result)

    firstHighOrderFunction("Hello ", "world!!!",{val1,val2 -> println(val1+val2)})
    firstHighOrderFunction("November ", "Autumn",{val1: String, val2: String -> println("$val1 has ${val1.length} letters and $val2 has ${val2.length} letters ")})


    val listNumber = listOf(1,2,3,4,5,6,7,8,9)
    val filtered = listNumber.filter{ it % 2 == 0}
    val filteredNot = listNumber.filterNot{ it % 2 == 0}
    val biggerThan4 = listNumber.filter{ it > 4}

    println(filtered)
    println(filteredNot)
    println(biggerThan4)

    val div = listNumber.map{ it / 2}
    println(div)

    val statesList = listOf("Lisbon","Berlin","London","Paris","Rome")
    val modifiedStates = statesList.map{ "Hello $it"}
    println(modifiedStates)
    val countriesList = listOf("Portugal","Germany","England","France","Italy")
    val stateCountry = statesList.zip(countriesList){state,country ->" $state is the capital of $country"}
    println(stateCountry)

    val mapCountries = countriesList.associateWith{it.length}
    val mapLength = countriesList.associateBy{it.length}
    println(mapCountries)
    println(mapLength)

    countriesList.forEach{
        println(it)
    }

}

fun String.myConcat(text: String){
    println( this + text )
}

fun Int.isEven(): Boolean{
    return this % 2 == 0
}

fun firstHighOrderFunction(text1: String, text2: String, operation: (String,String) -> Unit){
    operation(text1,text2)
}

infix fun Double.mySum(number2: Double): Double{
    return this + number2
}