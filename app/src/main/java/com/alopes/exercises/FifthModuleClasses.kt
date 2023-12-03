package com.alopes.exercises

fun main() {
    var aluno = Person()
    var aluno2: Person = Person()

    aluno.name= "João"
    aluno.phone= "11991534673"
    aluno.email= "aluno@ebac.art.com"
    aluno.printGreetings("Olá")

    aluno2.name= "Ana"
    aluno2.phone= "11991539999"
    aluno2.email= "aluno2@ebac.art.com"
    aluno2.printGreetings("Olá")

    var team1 = Team()
    team1.name = "São Paulo"
    team1.players.add(aluno)
    team1.players.add(aluno2)
    team1.printAllPlayersEmailAndPhone()
}


class Team {
    var players : MutableList<Person> = mutableListOf()
    var name : String = ""
    fun getAllPlayerWhitNameBiggerThan(size: Int): List<Person> {
        return this.players.filter{ person -> person.name.length > size }
    }
    fun printAllPlayersEmailAndPhone(): Unit {
        this.players.forEach{
                players -> println(players.getEmailAndPhone())
        }
    }
}
class Person {
    var name: String =""
    var age: Int = 0
    var email: String = ""
    var phone: String = ""

    fun getEmailAndPhone(): String {
        return "Email = ${this.email} Phone: ${this.phone}"
    }
    fun printGreetings(hello : String) {
        println("$hello ${this.name}")
    }
    fun isOlderThen( targetAge: Int): Boolean{
        return this.age > targetAge
    }
}

class Account{
    private var balance: Double =0.0
    var name: String= ""
    var address: String= ""
    var id: String= ""

}