package com.example.madpractical3_20012011035

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.madpractical3_20012011035.R
import com.example.madpractical3_20012011035.databinding.ActivityLoginBinding.*
import com.example.madpractical3_20012011035.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_login
        binding.bottomNavigationView.setOnItemSelectedListener { e1 ->
            when (e1.itemId) {
                R.id.bottom_nav_reg -> {
                    Intent(this, RegistrationActivity::class.java).also { startActivity(it) }
                }

            }
            return@setOnItemSelectedListener true
        }
    }
}