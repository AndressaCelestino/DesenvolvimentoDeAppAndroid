package com.alopes.eleventhmodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.alopes.eleventhmodule.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var drawer: DrawerLayout
    lateinit var navDrawer: NavigationView
    lateinit var bottomNav: BottomNavigationView
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        //val activityResultIntent = Intent(this, GameResultActivity::class.java)

        //binding.bottomNav
        //startActivity(activityResultIntent)

        setContentView(binding.root)
        setSupportActionBar(binding.toolbar2)

        drawer = binding.root
        navDrawer = binding.navView
        bottomNav = binding.bottomNav

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

       if(savedInstanceState == null) {
           supportFragmentManager.beginTransaction()
               .replace(R.id.fragmentContainerView, HomeFragment())
               .commit()
       }


        val appBarConfiguration =
            AppBarConfiguration(setOf(R.id.playerFragment, R.id.resultFragment), drawer)

        setupActionBarWithNavController(navController, appBarConfiguration)
        navDrawer.setupWithNavController(navController)

        setupBottomNavigation()

    }

    private fun setupBottomNavigation(){
        bottomNav.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId){
                R.id.player1 -> {
                    val intent = Intent(this,PlayerFragment::class.java)
                    startActivity(intent)
                    true
                }
                R.id.result -> {
                    val intent = Intent(this,ResultFragment::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

    }

   override fun onSupportNavigateUp(): Boolean {
//       drawer.openDrawer(GravityCompat.START)
      return true
    }

    //       override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    //           menuInflater.inflate(R.menu.second_screen_menu,menu)
    //          return true
    //       }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when(item.itemId){

//            R.id.menu_restrat -> {
//                val intent = Intent(this,HomeFragment::class.java)
//                startActivity(intent)
 //               true
//            }
 //           else -> false

 //       }

 //   }
}