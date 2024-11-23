package com.example.raktmitra

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay for 3 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // Add custom transition here
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

            // Finish SplashActivity so it's removed from the back stack
            finish()
        }, 3000) // Delay time in milliseconds (3 seconds)
    }
}
