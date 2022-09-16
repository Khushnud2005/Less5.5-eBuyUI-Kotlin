package uz.exemple.less55_ebuyui_kotlin.adapter

import android.content.Context
import android.text.Html
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StrikethroughSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less55_ebuyui_kotlin.R
import uz.exemple.less55_ebuyui_kotlin.model.TodayDealsModel


class DealAdapter(var context: Context,var dealList: ArrayList<TodayDealsModel>):RecyclerView.Adapter<DealAdapter.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todays_deal,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = dealList[position]
        holder.image.setImageResource(item.image)
        holder.title.setText(item.title)
        holder.price.setText("$"+item.price.toString())

        holder.discount.setText(item.discount.toString() + "% OFF")

        var oldPrice = SpannableString("$" + item.old_price.toString())
        oldPrice.setSpan(StrikethroughSpan(),0,oldPrice.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        holder.old_price.setText(oldPrice)
    }

    override fun getItemCount(): Int {
        return dealList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var image:ImageView
        lateinit var title:TextView
        lateinit var price:TextView
        lateinit var old_price:TextView
        lateinit var discount:TextView

        init {
            image = itemView.findViewById(R.id.iv_image_deal)
            title = itemView.findViewById(R.id.tv_title_deal)
            price = itemView.findViewById(R.id.tv_price_deal)
            old_price = itemView.findViewById(R.id.tv_oldPrice)
            discount = itemView.findViewById(R.id.tv_discount)
        }
    }
}