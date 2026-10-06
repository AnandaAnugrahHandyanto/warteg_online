package com.savarez.anandaanugrahhandyanto

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.savarez.anandaanugrahhandyanto.fragment.SatuFragment
import com.savarez.anandaanugrahhandyanto.fragment.DuaFragment

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnFrg1 = findViewById<Button>(R.id.btn_frg1)
        val btnFrg2 = findViewById<Button>(R.id.btn_frg2)

        // Tampilkan Fragment 1 secara default
        supportFragmentManager.beginTransaction()
            .replace(R.id.frl_dashboard, SatuFragment())
            .commit()

        btnFrg1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frl_dashboard, SatuFragment())
                .commit()
        }

        btnFrg2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frl_dashboard, DuaFragment())
                .commit()
        }
    }
}