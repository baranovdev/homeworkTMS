package by.baranovdev.homework.HW4.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import by.baranovdev.homework.HW4.Snowdrop
import by.baranovdev.homework.R
import com.squareup.picasso.Picasso


class SnowdropAdapter(val snowdrops:List<Snowdrop>) : RecyclerView.Adapter<SnowdropAdapter.SnowdropViewHolder>() {

    inner class SnowdropViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        fun setData(itemView : View, position:Int){

            val snowdrop = snowdrops[position]

            Picasso.get().load(snowdrop.imageURL).into(itemView.findViewById<ImageView>(R.id.card_image))
            itemView.findViewById<TextView>(R.id.card_species).text = snowdrop.species
            itemView.findViewById<TextView>(R.id.card_color).text = snowdrop.color
            itemView.findViewById<TextView>(R.id.card_height).text = snowdrop.height.toInt().toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnowdropViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_snowdrop, parent, false)
        return SnowdropViewHolder(view)
    }

    override fun onBindViewHolder(holder: SnowdropViewHolder, position: Int) {
        holder.setData(holder.itemView, position)
    }

    override fun getItemCount(): Int {
        return snowdrops.size
    }


}