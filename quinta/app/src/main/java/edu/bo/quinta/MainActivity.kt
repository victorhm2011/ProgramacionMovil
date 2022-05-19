package edu.bo.quinta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar.let {
            it?.setDisplayHomeAsUpEnabled(true) }
            it?.setDisplayShowHomeEnabled(true)
    }
}