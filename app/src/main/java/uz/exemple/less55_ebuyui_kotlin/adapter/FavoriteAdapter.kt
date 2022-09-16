package uz.exemple.less55_ebuyui_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less55_ebuyui_kotlin.R
import uz.exemple.less55_ebuyui_kotlin.model.Favorite


class FavoriteAdapter(var context: Context, var items: ArrayList<Favorite>) :
    RecyclerView.Adapter<FavoriteAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_feed_favorite, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavoriteAdapter.ViewHolder, position: Int) {
        val item = items[position]

        holder.iv_image.setImageResource(item.image)
        holder.tv_title.text = item.title
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_image: ImageView
        var tv_title: TextView

        init {
            iv_image = view.findViewById(R.id.iv_image)
            tv_title = view.findViewById(R.id.tv_title)
        }
    }

}