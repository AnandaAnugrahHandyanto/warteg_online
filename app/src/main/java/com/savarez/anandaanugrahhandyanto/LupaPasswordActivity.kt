package com.savarez.anandaanugrahhandyanto

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LupaPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_password)

        // Terima data dari Intent Eksplisit (putExtra dari MainActivity)
        val message = intent.getStringExtra("message") ?: "Tidak ada pesan"
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        // Intent Implisit: Buka URL its.ac.id
        val btnBantuanBrowser = findViewById<Button>(R.id.btn_bantuan_browser)
        btnBantuanBrowser.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://unpam.ac.id"))
            startActivity(intent)
        }

        // Kembali ke Login
        val btnKembali = findViewById<Button>(R.id.btn_kembali)
        btnKembali.setOnClickListener {
            finish()
        }
    }
}