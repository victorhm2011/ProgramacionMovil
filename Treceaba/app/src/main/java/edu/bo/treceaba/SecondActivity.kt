package edu.bo.treceaba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    lateinit var txtUserSession: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Toast.makeText(this, session.user.nombre, Toast.LENGTH_SHORT).show()
        txtUserSession = findViewById(R.id.textView3)
        txtUserSession.text = "${session.user.nombre} ${session.user.apellido} ${session.user.edad}"
    }
}