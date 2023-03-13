package com.gonzalezblanchard.apppeliculassabado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.gonzalezblanchard.apppeliculassabado.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    //private var peliculas = emptyArray<String>()
    var peliculas: ArrayList<Movie> = ArrayList()

    lateinit var arrayAdapter: ArrayAdapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*peliculas = arrayOf(
            "Terminator",
            "Rapidos y furiosos",
            "Kimetsu no Yaiba",
            "Titanic",
            "Soy Leyenda",
            "Cars",
            "Batman",
            "Avatar",
            "Toy Story",
            "Pantera Negra",
            "AntMan",
            "Shrek",
            "Avengers Endgame"
        )*/


        peliculas.add(
            Movie("Rapidos y furiosos", "",
                "https://i.blogs.es/01549a/rapidos-y-furiosos-10-estrena-su-primer-trailer-oficial-vin-diesel-y-compania-se-despediran-de-la-saga-en-mayo/1366_2000.jpeg",
                2001)
        )

        peliculas.add(
            Movie("Toy Story", "",
                "https://m.media-amazon.com/images/M/MV5BMDU2ZWJlMjktMTRhMy00ZTA5LWEzNDgtYmNmZTEwZTViZWJkXkEyXkFqcGdeQXVyNDQ2OTk4MzI@._V1_.jpg",
                2001)
        )

        peliculas.add(
            Movie("Avengers", "",
                "https://i0.wp.com/imgs.hipertextual.com/wp-content/uploads/2019/04/hipertextual-nuevo-trailer-avengers-endgame-agradece-fans-universo-marvel-2019351167.jpg",
                2016)
        )

        peliculas.add(
            Movie("Kimetsu no Yaiba", "",
                "https://i.blogs.es/e8f8ff/kimetsu-no-yaiba/1366_2000.jpg",
                2022)
        )

        peliculas.add(
            Movie("Cars", "",
                "https://i.ytimg.com/vi/NJ9gLDD7G6E/maxresdefault.jpg",
                2014)
        )


        val adaptador = PeliculasAdapter(MainActivity@this, peliculas)

        binding.listapeliculas.adapter = adaptador


    }
}