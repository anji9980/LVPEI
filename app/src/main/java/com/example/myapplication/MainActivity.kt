package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.login)
        val signUpButton = findViewById<Button>(R.id.signup)

        loginButton.setOnClickListener {
            // Redirect to LoginActivity when the login button is clicked
            val loginIntent = Intent(this, OtherActivity::class.java)
            startActivity(loginIntent)
        }

        signUpButton.setOnClickListener {
            // Redirect to SignUpActivity when the sign-up button is clicked
            val signUpIntent = Intent(this, OtherActivity::class.java)
            startActivity(signUpIntent)
        }
    }
}
