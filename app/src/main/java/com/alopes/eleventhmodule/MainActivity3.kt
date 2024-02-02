package com.alopes.eleventhmodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.alopes.eleventhmodule.databinding.ActivityMain3Binding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity3 : AppCompatActivity() {

    lateinit var drawer: DrawerLayout
    lateinit var navDrawer: NavigationView
    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain3Binding.inflate(layoutInflater)

        //binding.bottomNav2

        setContentView(binding.root)
        setSupportActionBar(binding.toolbar3)

        drawer = binding.root
        navDrawer = binding.navView2
        bottomNav = binding.bottomNav2

        setupToolBar()
        setupDrawer()
        setupBottomNavigation()

    }

    private fun setupBottomNavigation(){
        bottomNav.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.player1 -> {
                    val intent = Intent(this,MainActivity2::class.java)
                    startActivity(intent)
                    true
                }
                R.id.result -> {
                    val intent = Intent(this,MainActivity3::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

    }

    private fun setupDrawer(){
        navDrawer.setNavigationItemSelectedListener { menuItem ->
            drawer.closeDrawers()
            when(menuItem.itemId){
                R.id.drawer_player1 -> {
                    val intent = Intent(this,MainActivity2::class.java)
                    startActivity(intent)
                    true
                }
                R.id.drawer_results -> {
                    val intent = Intent(this,MainActivity3::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }

    private fun setupToolBar(){
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menu)
    }

    override fun onSupportNavigateUp(): Boolean {
        drawer.openDrawer(GravityCompat.START)
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.second_screen_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){

            R.id.menu_restrat -> {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                true
            }
            else -> false

        }

    }
}