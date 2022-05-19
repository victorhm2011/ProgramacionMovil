package edu.bo.ucb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ServiciosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicios)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
    }


    fun selectedButton(view: View) {
        if ( view.id === R.id.btnServices) {
            Toast.makeText( view.context, "Opción de Servicios", Toast.LENGTH_LONG).show()
        }
        Toast.makeText( view.context, "Evento no definido", Toast.LENGTH_LONG).show()
    }

}