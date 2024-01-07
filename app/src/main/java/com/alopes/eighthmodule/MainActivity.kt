package com.alopes.eighthmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {

    var textTitle : TextView? = null
    var editText: EditText? = null
    var tela: LinearLayoutCompat? = null
    var numClicks = 0
    var numImage = 0

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTitle = findViewById<TextView>(R.id.title)
        //textTitle?.text = "novo texto"

        editText = findViewById(R.id.inputText)
        tela = findViewById(R.id.tela)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            changeTitle()
            numClicks++
            numImage++
            if (numImage > 3 ){ numImage = 1}
        }
    }

    fun changeTitle(){
        editText?.addTextChangedListener()
         textTitle?.text = editText?.text.toString() + " " + numClicks.toString()

        when{
            numImage == 1 -> tela?.background = getDrawable(R.drawable.castelo_1)
            numImage == 2 -> tela?.background = getDrawable(R.drawable.castelo_2)
            else -> tela?.background = getDrawable(R.drawable.castelo_3)
        }

    }
}