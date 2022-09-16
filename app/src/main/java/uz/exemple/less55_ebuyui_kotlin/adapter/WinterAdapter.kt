package uz.exemple.less55_ebuyui_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less55_ebuyui_kotlin.R
import uz.exemple.less55_ebuyui_kotlin.model.WinterModel

class WinterAdapter(var context: Context,var wList:ArrayList<WinterModel>):RecyclerView.Adapter<WinterAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_winter_essential, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = wList[position]
        holder.image.setImageResource(item.image)
        holder.title.setText(item.title)
    }

    override fun getItemCount(): Int {
        return wList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var image: ImageView
        lateinit var title: TextView

        init {
            image = itemView.findViewById(R.id.iv_image_winter)
            title = itemView.findViewById(R.id.tv_title_winter)
        }
    }


}