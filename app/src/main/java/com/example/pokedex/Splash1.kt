package com.example.pokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash1)
        supportActionBar!!.hide()
        Handler().postDelayed({
            val  intent =Intent (this@Splash1,MainActivity::class.java)
            startActivity(intent)
            finish() } ,5000)





    }
}