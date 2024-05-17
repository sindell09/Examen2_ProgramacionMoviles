package com.perez.sindell.usolayoutsv4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.perez.sindell.usolayoutsv4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnMostrar.setOnClickListener {
                viewVerde.visibility = View.VISIBLE
            }

            btnOcultar.setOnClickListener {
                viewVerde.visibility = View.GONE
            }
        }
    }
}

