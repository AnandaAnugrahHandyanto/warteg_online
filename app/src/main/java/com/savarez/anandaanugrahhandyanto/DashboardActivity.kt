package com.savarez.anandaanugrahhandyanto

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.savarez.anandaanugrahhandyanto.fragment.SatuFragment
import com.savarez.anandaanugrahhandyanto.fragment.DuaFragment
import com.savarez.anandaanugrahhandyanto.fragment.TigaFragment
import com.savarez.anandaanugrahhandyanto.fragment.EmpatFragment

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnFrg1 = findViewById<Button>(R.id.btn_frg1)
        val btnFrg2 = findViewById<Button>(R.id.btn_frg2)
        val btnFrg3 = findViewById<Button>(R.id.btn_frg3)
        val btnFrg4 = findViewById<Button>(R.id.btn_frg4)

        // Tampilkan Fragment 1 secara default
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frl_dashboard, SatuFragment())
                .commit()
        }

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

        btnFrg3.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frl_dashboard, TigaFragment())
                .commit()
        }

        btnFrg4.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frl_dashboard, EmpatFragment())
                .commit()
        }
    }
}