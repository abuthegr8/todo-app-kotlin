package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: Button = findViewById<Button>(R.id.login)
        loginButton.setOnClickListener {
            val intentLogin = Intent(this, LoginPage::class.java)
            startActivity(intentLogin)
        }

        val registerButton: Button = findViewById<Button>(R.id.register)
        registerButton.setOnClickListener {
            val intentRegister = Intent(this, RegisterPage::class.java)
            startActivity(intentRegister)
        }
    }
}

