package com.gonzalezblanchard.apppeliculassabado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gonzalezblanchard.apppeliculassabado.databinding.ActivityMovieDetailBinding
import com.squareup.picasso.Picasso

class MovieDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMovieDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get the Intent that started this activity and extract the string
        val titulo = intent.getStringExtra("TITULO")
        val descripcion = intent.getStringExtra("DESCRIPCION")
        val foto = intent.getStringExtra("FOTO")

        binding.titulo.text = titulo
        binding.description.text = descripcion
        Picasso.get().load(foto).into(binding.fotoPelicula);
    }

    fun finalizar(view: View){
        finish()
    }
}