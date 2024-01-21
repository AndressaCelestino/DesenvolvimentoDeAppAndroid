package com.alopes.tenthmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alopes.tenthmodule.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), ListAdapter.ListAdapterListener {

    private lateinit var binding: ActivityMainBinding
    private val itemList: MutableList<ContactInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.lista

        creatMockData()

        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = ListAdapter(itemList,this)
    }


    fun creatMockData(){
        itemList.add(ContactInfo("Giulia", "10 10101010"))
        itemList.add(ContactInfo("Paulo", "11 11111111"))
        itemList.add(ContactInfo("Vitor", "12 12121212"))
        itemList.add(ContactInfo("Emily", "13 13131313"))
        itemList.add(ContactInfo("Monique", "14 14141414"))
        itemList.add(ContactInfo("Viviane", "15 15151515"))
        itemList.add(ContactInfo("Bruna", "16 16161616"))
        itemList.add(ContactInfo("Matheus", "17 17171717"))
        itemList.add(ContactInfo("Priscila", "18 18181818"))
        itemList.add(ContactInfo("Vanessa", "19 19191919"))
        itemList.add(ContactInfo("Elaine", "20 20202020"))
        itemList.add(ContactInfo("Everton", "21 21212121"))
        itemList.add(ContactInfo("João", "22 22222222"))
        itemList.add(ContactInfo("Izabel", "23 23232323"))
        itemList.add(ContactInfo("Beatriz", "24 24242424"))
        itemList.add(ContactInfo("Flor", "25 25252525"))
        itemList.add(ContactInfo("Raquell", "26 26262626"))
        itemList.add(ContactInfo("Felipe", "27 27272727"))
        itemList.add(ContactInfo("Henrique", "28 28282828"))
        itemList.add(ContactInfo("Guilherme", "29 29292929"))
        itemList.add(ContactInfo("Angela", "30 30303030"))
        itemList.add(ContactInfo("Roberta", "31 31313131"))
        itemList.add(ContactInfo("Paloma", "32 32323232"))
        itemList.add(ContactInfo("Vitoria", "33 33333333"))
        itemList.add(ContactInfo("Elizeu", "34 34343434"))
        itemList.add(ContactInfo("Moizes", "35 35353535"))
        itemList.add(ContactInfo("Vialeria", "36 36363636"))
        itemList.add(ContactInfo("Bernardo", "37 37373737"))
        itemList.add(ContactInfo("Marta", "38 38383838"))
        itemList.add(ContactInfo("Patricia", "39 39393939"))
        itemList.add(ContactInfo("Vania", "40 40404040"))
        itemList.add(ContactInfo("Eliana", "41 41414141"))
        itemList.add(ContactInfo("Rodrigo", "42 42424242"))
        itemList.add(ContactInfo("Jessica", "43 43434343"))
        itemList.add(ContactInfo("Herbert", "44 44444444"))
        itemList.add(ContactInfo("Ana Clara", "45 45454545"))
        itemList.add(ContactInfo("Fernando", "46 46464646"))
        itemList.add(ContactInfo("Amanda", "47 47474747"))
        itemList.add(ContactInfo("Gustavo", "48 48484848"))
        itemList.add(ContactInfo("Marcelo", "49 49494949"))
        itemList.add(ContactInfo("Renata", "50 50505050"))
        itemList.add(ContactInfo("Leila", "51 51515151"))

    }

    override fun onItemClicked(content: String) {
        Snackbar.make(binding.root, content, Snackbar.LENGTH_SHORT).show()
    }
}