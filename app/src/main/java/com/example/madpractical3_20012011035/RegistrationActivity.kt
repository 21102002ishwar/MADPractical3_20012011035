package com.example.madpractical3_20012011035

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.madpractical3_20012011035.R
import com.example.madpractical3_20012011035.databinding.ActivityRegistrationBinding.*
import com.example.madpractical3_20012011035.databinding.ActivityRegistrationBinding
import com.example.madpractical3_20012011035.databinding.ActivityRegistrationBinding.inflate

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inflate(/* inflater = */ layoutInflater).also { binding = it }
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_reg
        binding.bottomNavigationView.setOnItemSelectedListener { it1 ->
            when(it1.itemId){
                R.id.bottom_nav_login -> {
                    Intent(this,LoginActivity::class.java).also{startActivity(it)}
                }

            }
            return@setOnItemSelectedListener true
        }
    }
}