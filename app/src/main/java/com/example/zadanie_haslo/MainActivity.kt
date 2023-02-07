package com.example.zadanie_haslo

import android.graphics.Color
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
        var duze=findViewById<CheckBox>(R.id.duze)
        var male=findViewById<CheckBox>(R.id.male)
        var cyfra=findViewById<CheckBox>(R.id.cyfra)
        var znak=findViewById<CheckBox>(R.id.znak)

        var puste=findViewById<TextView>(R.id.puste)

        guzik.setOnClickListener {

            var haslo=haslo1.text.toString()
            var haslo_p=haslo2.text.toString()
            var x=""
            if (haslo.isEmpty() || haslo_p.isEmpty())
            {

                puste.text="haslo nie moze byc puste"
                zgodne.isChecked=x.any()
                duze.isChecked=x.any()
                male.isChecked=x.any()
                cyfra.isChecked=x.any()
                znak.isChecked=x.any()
            }
            else {
                puste.text=""
                if (haslo1.text.toString() == haslo2.text.toString()) {
                    zgodne.isChecked = haslo.any()
                }
                else
                {
                    zgodne.isChecked=x.any()
                }
                if (haslo.any { it.isUpperCase() } && haslo_p.any { it.isUpperCase() }) {
                    duze.isChecked = haslo.any()
                }
                else
                {
                    duze.isChecked=x.any()
                }
                if (haslo.any { it.isLowerCase() } && haslo_p.any { it.isLowerCase() }) {
                    male.isChecked = haslo.any()
                }
                else
                {
                    male.isChecked=x.any()
                }
                if (haslo.any { it.isDigit() } && haslo_p.any { it.isDigit() }) {
                    cyfra.isChecked = haslo.any()
                }
                else
                {
                    cyfra.isChecked=x.any()
                }
                if (haslo.any { !it.isLetterOrDigit() } && haslo_p.any { it.isLetterOrDigit() }) {
                    znak.isChecked = haslo.any()
                }
                else
                {
                    znak.isChecked=x.any()
                }
            }

        }
    }
}