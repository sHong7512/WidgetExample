package com.shong.widgetexample

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.shong.klog.Klog
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.sendRandomButton).setOnClickListener {
            val num = Random().nextInt(100)
            sendBroadcast(Intent(ACTION_PROVIDER_UPDATE_COUNT).apply {
                component = ComponentName(this@MainActivity, ExampleAppWidgetProvider::class.java)
                putExtra(EXTRA_COUNT, num)
            })
            findViewById<TextView>(R.id.textView).text = num.toString()
        }
        Klog.reqPermission(this)
    }

    override fun onResume() {
        super.onResume()

        findViewById<TextView>(R.id.textView).text = ExamplePref(this).getCenterText()
    }
}