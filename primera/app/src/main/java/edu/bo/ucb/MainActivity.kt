package edu.bo.ucb

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import android.view.View


class MainActivity : AppCompatActivity() {
    private val serviciosBtn : Button
        get() =  findViewById(R.id.servicios_btn)

    private val portafolioBtn: Button
        get() = findViewById(R.id.portafolio_btn)

    private val acercaBtn: Button
        get() = findViewById(R.id.acerca_btn)

    private val contactoBtn: Button
        get() = findViewById(R.id.contacto_btn)

    private val redesBtn: Button
        get() = findViewById(R.id.redes_btn)


    private val textMessage: TextView
        get() = findViewById(R.id.message)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        serviciosBtn.setOnClickListener {
            textMessage.text = getString(R.string.btn_servicios)
        }
        portafolioBtn.setOnClickListener {
            toast(getString(R.string.btn_portafio))

        }
        acercaBtn.setOnClickListener {
            toast(getString(R.string.btn_acercade))

        }
        contactoBtn.setOnClickListener {
            toast(getString(R.string.btn_servicios))

        }
        serviciosBtn.setOnClickListener {
            toast(getString(R.string.btn_contacto))

        }
        redesBtn.setOnClickListener {
            toast(getString(R.string.btn_contacto))
        }
    }


    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG) = Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()
}