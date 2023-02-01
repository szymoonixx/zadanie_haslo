package com.example.zadanie_haslo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var haslo1 =findViewById<TextView>(R.id.haslo1)
        var haslo2=findViewById<TextView>(R.id.haslo2)
        var zgodne=findViewById<CheckBox>(R.id.zgodne)
        var guzik=findViewById<Button>(R.id.button)

        guzik.setOnClickListener {
            if (haslo1.text.toString()==haslo2.text.toString())
            {
                zgodne.
            }
        }

    }
}