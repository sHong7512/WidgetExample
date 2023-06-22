package com.shong.widgetexample

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.shong.klog.Klog
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.sendRandomButton).setOnClickListener {
            val num = Random().nextInt(100)
            sendBroadcast(Intent(ACTION_UPDATE_COUNT).apply {
                component = ComponentName(this@MainActivity, ExampleAppWidgetProvider::class.java)
                putExtra(EXTRA_COUNT, num)
            })

            sendBroadcast(Intent(ACTION_UPDATE_COUNT).apply {
                component = ComponentName(this@MainActivity, ExampleAppWidgetProvider2::class.java)
                putExtra(EXTRA_COUNT, num)
            })
            Klog.i("randNum", "$num")
        }
    }
}