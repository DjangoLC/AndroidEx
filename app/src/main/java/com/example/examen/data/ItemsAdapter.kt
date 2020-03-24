package com.example.examen.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.R
import kotlinx.android.synthetic.main.item_row.view.*
import kotlin.properties.Delegates

class ItemsAdapter() : RecyclerView.Adapter<ItemsViewHolder>(), Filterable {

    var items: List<Items> by Delegates.observable(emptyList(), { _, _, _ ->
        notifyDataSetChanged()
        itemsFiltered = items
    })

    var itemsFiltered = emptyList<Items>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ItemsViewHolder.fromParent(parent)

    override fun getItemCount() = itemsFiltered.size

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.bind(itemsFiltered[position])
    }

    override fun getFilter(): Filter? {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): FilterResults {
                val charString = charSequence.toString()
                if (charString.isEmpty()) {
                    itemsFiltered = items
                } else {
                    val filteredList: MutableList<Items> = ArrayList()
                    for (item in items) {
                        if (item.determinante.toLowerCase().contains(charString.toLowerCase())
                            || item.cadena.toLowerCase().contains(charString.toLowerCase())
                            || item.sucursal.toLowerCase().contains(charString.toLowerCase())
                        ) {
                            filteredList.add(item)
                        }
                    }
                    itemsFiltered = filteredList
                }
                val filterResults = FilterResults()
                filterResults.values = itemsFiltered
                return filterResults
            }

            override fun publishResults(
                charSequence: CharSequence,
                filterResults: FilterResults
            ) {
                itemsFiltered = filterResults.values as List<Items>
                notifyDataSetChanged()
            }
        }
    }
}


class ItemsViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(items: Items) {
        view.apply {
            tvCadena.text = items.cadena
            tvDeterminante.text = items.determinante
            tvSucursal.text = items.sucursal
            tvLatitud.text = items.latitud.toString()
            tvLongitud.text = items.longitud.toString()
        }
    }

    companion object {
        fun fromParent(parent: ViewGroup): ItemsViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            return ItemsViewHolder(inflater.inflate(R.layout.item_row, parent, false))
        }
    }

}