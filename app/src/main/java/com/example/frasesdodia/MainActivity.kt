package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.frasesdodia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val frases = arrayListOf<String>(
            "Bom dia, Seu dia sera lindo hj",
            "Seu dia sera cheio de luz e vida",
            "Dia iluminado e belo",
            "Safadona",
            "Amem, aleluia, alibaba"
        )
        binding.button.setOnClickListener{
            binding.frase.text = frases[(0..4).random()]
        }


    }


}



