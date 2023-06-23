package com.shong.widgetexample

import android.content.Context
import android.content.SharedPreferences

class ExamplePref constructor(context: Context) {
    private val pref: SharedPreferences =
        context.getSharedPreferences("ExampleWidget", Context.MODE_PRIVATE)

    private val CENTER_TEXT = "centerText"

    fun setCenterText(str: String) = pref.edit().putString(CENTER_TEXT, str).apply()
    fun getCenterText(): String = pref.getString(CENTER_TEXT, "NONE") ?: "ERROR"

}