package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

//Halaman LogIn Aplikasi

class LogInAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val btnLogin1 = findViewById<Button>(R.id.btn_login1)
        btnLogin1.setOnClickListener{
            val intenlogin1 = Intent(this@LogInAct, HmeAct :: class.java)
            startActivity(intenlogin1)
            finish()
        }

        val tvHaventAccount = findViewById<TextView>(R.id.tv_havent_account)
        tvHaventAccount.setOnClickListener{
            val intenregi = Intent(this@LogInAct, RegistAct :: class.java)
            startActivity(intenregi)
        }

    }
}