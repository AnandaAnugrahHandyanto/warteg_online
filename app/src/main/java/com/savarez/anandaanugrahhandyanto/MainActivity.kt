package com.savarez.anandaanugrahhandyanto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)

        val tvForgotPassword = findViewById<TextView>(R.id.lupaPassword)
        tvForgotPassword.setOnClickListener {
            val intent = Intent(this, LupaPasswordActivity::class.java)
            intent.putExtra("message", "Ini adalah efek dari eksplisit intent")
            startActivity(intent)
        }

        val btnIntent = findViewById<Button>(R.id.dashboard)
        btnIntent.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}