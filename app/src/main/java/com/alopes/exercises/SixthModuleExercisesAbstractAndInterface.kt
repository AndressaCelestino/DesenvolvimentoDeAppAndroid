package com.alopes.exercises

fun main() {

    var player = GoalKeeper()
    player.name = "Rafael"
    player.number = 1
    player.goalsConced = 10

    println(player.rating())
    println(player.isAGoodPlayer())
}

 /*abstract class*/interface Players {
    /*abstract*/ var name: String
    /*abstract*/ var number: Int

    /*abstract*/ fun rating() : Int

    fun isAGoodPlayer(): Boolean{
        return rating() > 5
    }
}
class GoalKeeper : Players/*()*/{
    override var name = ""
    override var number = 0
    var goalsConced = 0

    override fun rating(): Int{
        return when{
            goalsConced < 15 -> 10
            goalsConced < 30 -> 5
            else -> 0
        }

    }
}