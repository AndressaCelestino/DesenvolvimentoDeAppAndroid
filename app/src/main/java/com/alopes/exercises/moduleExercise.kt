package com.alopes.exercises

fun main(){
    println("digite uma palavra")
    var string =readln()
    println(" $string tem ${string.length} letras")
   println(string.createList())


    UtilityHelper.printCurrentDay()
    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    println(UtilityHelper.isWeekend())
    UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)
    println(UtilityHelper.isWeekend())

}
fun String.createList(){
    var stringList : MutableList<String> = mutableListOf()

    for (i in 0 .. this.length -1){
        var letra = "${this[i]}"
        stringList.add(i,letra)
        println(stringList[i])
        }
}

object UtilityHelper {
    private var currentDay : DayOfWeek = DayOfWeek.SUNDAY


    fun setCurrentDay(newCurrentDay : DayOfWeek){
        this.currentDay = newCurrentDay
        println(currentDay)
    }
    fun printCurrentDay()= println(currentDay)

    fun isWeekend():Boolean{
        return currentDay.id > 5
    }
}

enum class DayOfWeek(val translate:String, val id:Int ) {
    MONDAY("Segunda-feira",1),
    TUESDAY("Terça-feira",2),
    WEDNESDAY("Quarta-feira",3),
    THURSDAY("Quinta-feira",4),
    FRIDAY("Sexta-feira",5),
    SATURDAY("Sábado",6),
    SUNDAY("Domingo",7);
}
