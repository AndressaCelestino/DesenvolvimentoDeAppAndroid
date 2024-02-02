package com.alopes.eleventhmodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.alopes.eleventhmodule.databinding.ActivityMain2Binding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {
    lateinit var drawer: DrawerLayout
    lateinit var navDrawer: NavigationView
    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain2Binding.inflate(layoutInflater)
        //val activityResultIntent = Intent(this, GameResultActivity::class.java)

        //binding.bottomNav
        //startActivity(activityResultIntent)

        setContentView(binding.root)
        setSupportActionBar(binding.toolbar2)

        drawer = binding.root
        navDrawer = binding.navView
        bottomNav = binding.bottomNav

        setupToolBar()
        setupDrawer()
        setupBottomNavigation()

    }

    private fun setupBottomNavigation(){
        bottomNav.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId){
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