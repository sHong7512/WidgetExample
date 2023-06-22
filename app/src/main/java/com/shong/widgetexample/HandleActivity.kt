package com.shong.widgetexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HandleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        when (intent.getStringExtra(ACTIVITY_HANDLE)) {
            MAIN_ACTIVITY -> startAct(MainActivity::class.java)
            else -> startAct(MainActivity::class.java)
        }
    }

    private fun startAct(activity: Class<*>) {
        val i = Intent(this, activity).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        }
        startActivity(i)
        finish()
    }
}