package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    var defCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv1 = findViewById<TextView>(R.id.tv1)
        val btn1 = findViewById<Button>(R.id.btn1)
        val edt1 = findViewById<TextInputEditText>(R.id.edt1)

        val map1 = mutableMapOf("somebody" to 0)

        btn1.setOnClickListener {
            var name = edt1.text.toString().toLowerCase()

            if(name.isNullOrEmpty())
                name = "somebody"

            if(name in map1) {
                defCount = map1.get(name)!!
                defCount++
                map1[name] = defCount
                tv1.text = "$name clicked $defCount times"
            }
            else{
                var newCount = 0
                map1.put(name, newCount)
                newCount++
                map1[name] = newCount
                tv1.text = "$name clicked $newCount times"
            }

        }

    }
}