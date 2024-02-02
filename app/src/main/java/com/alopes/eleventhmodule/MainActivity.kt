package com.alopes.eleventhmodule

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import com.alopes.eleventhmodule.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val toolbar = binding.toolbar

        setContentView(binding.root)
        setSupportActionBar(toolbar)

        //supportActionBar?.title = "@+Id"
        supportActionBar?.setLogo(R.drawable.ic_logo)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val activity2Intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("name", "Andressa")
        intent.putExtra("age", 34)


        val activityResult =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result: ActivityResult ->
            if(result.resultCode == Activity.RESULT_OK){
                val intent = result.data
                if(intent?.hasExtra("result")== true){
                    Snackbar.make(
                        binding.root,
                        intent.getStringExtra("result") ?: "",
                        Snackbar.LENGTH_SHORT).show()
                }
            }
        }

        binding.startActivityButton.setOnClickListener {
            activityResult.launch(activity2Intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}