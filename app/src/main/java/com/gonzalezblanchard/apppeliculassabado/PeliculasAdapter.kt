package com.gonzalezblanchard.apppeliculassabado

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.gonzalezblanchard.apppeliculassabado.databinding.ItemPeliculaBinding
import com.squareup.picasso.Picasso

class PeliculasAdapter (private val context: Context, private val arrayList: java.util.ArrayList<Movie>):
    BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val binding = ItemPeliculaBinding.inflate(
            LayoutInflater.from(parent.context), parent,
                false)
        var convertView = convertView
        convertView = binding.root

        binding.txtTitulo.text = arrayList[position].titulo
        binding.txtYear.text = arrayList[position].year.toString()

        if(arrayList[position].imagenUrl != null){
            Picasso.get().load(arrayList[position].imagenUrl).into(binding.imageView);
        }

        return convertView
    }


}