package com.alopes.exercises

fun main(){
    val person = Person("Antonio", "385612578-76", "antonio@test.com")
    val person2 = Person("Catarina", "368125587-67", "catarina@test.com")

    person.age = 30
    println(person.equals(person2))
    println(person)
    println(person2)
    println(person.age)

    val (nome,cpf,email) = person
    println(nome)
    println(cpf)
    println(email)

    var season = Season.WINTER
    println(season)

    season = Season.SPRING

    println(season)
    println(Season.SUMMER.translate)
    println(season.id)

    season.hello()

    when(season) {
        Season.WINTER -> println("É inverno")
        Season.SPRING -> println("É primavera")
        Season.SUMMER -> println("É verão")
        Season.FALL -> println("É outono")
    }

    SchedulerHandler.currentSeason()
    SchedulerHandler.setSeason(Season.SPRING)
    SchedulerHandler.currentSeason()

    var isFall = IsFall()
    SchedulerHandler.currentSeason()
    SchedulerHandler.setSeason(Season.SUMMER)
    SchedulerHandler.currentSeason()
}

class IsFall(){
    init {
        SchedulerHandler.setSeason(Season.FALL)
    }
    fun printCurrentSeason() = SchedulerHandler.currentSeason()
}

data class Person (var name:String,val cpf:String, var email:String){
    var age: Int = 0
}

object SchedulerHandler{
    private var season: Season = Season.WINTER

    fun setSeason(newSeason: Season){
        this.season = newSeason
    }
    fun currentSeason()= println(season)
}

enum class Season(val translate:String, val id:Int ) {
    WINTER("inverno",1){
        override fun hello() = println("Olá inverno")
    },
    SPRING("primavera",2){
        override fun hello() = println("Olá primavera")
    },
    SUMMER("verão",3){
        override fun hello() = println("Olá verão")
    },
    FALL("outono",4){
        override fun hello() = println("Olá outono")
    };

    abstract fun hello()
}