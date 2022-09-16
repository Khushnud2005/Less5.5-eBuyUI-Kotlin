package uz.exemple.less55_ebuyui_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less55_ebuyui_kotlin.adapter.DealAdapter
import uz.exemple.less55_ebuyui_kotlin.adapter.FavoriteAdapter
import uz.exemple.less55_ebuyui_kotlin.adapter.WinterAdapter
import uz.exemple.less55_ebuyui_kotlin.model.Favorite
import uz.exemple.less55_ebuyui_kotlin.model.TodayDealsModel
import uz.exemple.less55_ebuyui_kotlin.model.WinterModel

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var dealRecyclerView: RecyclerView
    lateinit var winterRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = manager

        dealRecyclerView = findViewById(R.id.dealRecyclerView)
        val dealManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        dealRecyclerView.layoutManager = dealManager

        winterRecyclerView = findViewById(R.id.braveRecyclerView)
        val winterManager = GridLayoutManager(this, 3)
        winterRecyclerView.layoutManager = winterManager

        refreshAdapter(getFavorites())
        dealAdapter(getDeals())
        winterAdapter(getWinters())
    }

    fun refreshAdapter(items: ArrayList<Favorite>) {
        val adapter = FavoriteAdapter(this, items)
        recyclerView.adapter = adapter
    }


    fun getFavorites(): ArrayList<Favorite> {
        val items = ArrayList<Favorite>()
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))
        items.add(Favorite("Apple Watch", R.drawable.im_product_1))

        return items
    }
    fun dealAdapter(items: ArrayList<TodayDealsModel>) {
        val adapter = DealAdapter(this, items)
        dealRecyclerView.adapter = adapter
    }
    fun getDeals():ArrayList<TodayDealsModel>{
        val items = ArrayList<TodayDealsModel>()
        var text ="Apple Airpods Pro - Select Right Airpod Pro or Left Airpod Pro or Both - Good"
        items.add(TodayDealsModel(R.drawable.aripod1,text,125.95,150.00,29))
        text ="Apple Airpods 2nd Generation - Left Airpods or Right Airpods Select Side - Good"
        items.add(TodayDealsModel(R.drawable.aripod2,text,143.65,170.00,23))
        text ="Samsung Galaxy Watch 42mm 4GB Storage Rose Gold Stainless Steel Case Pink Buckle"
        items.add(TodayDealsModel(R.drawable.swatch1,text,109.90,128.90,16))
        text ="Apple Watch Series 4 44mm Space Grey GPS (Nike Band) Grade B \"eBay Good\""
        items.add(TodayDealsModel(R.drawable.swatch2,text,75.00,93.00,16))
        text ="Apple iPad Air 4 (4th Gen) (10.9 inch) -64GB -256GB Wi-Fi + Cellular - Excellent"
        items.add(TodayDealsModel(R.drawable.ipad1,text,458.00,634.00,32))
        text ="Apple iPad 6 (6th Gen) - (2018 Model) - 32GB - 128GB - Wi-Fi - Cellular - Good"
        items.add(TodayDealsModel(R.drawable.ipad2,text,149.90,180.90,38))
        text ="Apple Airpods Pro - Select Right Airpod Pro or Left Airpod Pro or Both - Good"
        items.add(TodayDealsModel(R.drawable.aripod1,text,125.95,150.00,29))
        text ="Apple Airpods 2nd Generation - Left Airpods or Right Airpods Select Side - Good"
        items.add(TodayDealsModel(R.drawable.aripod2,text,143.65,170.00,23))
        text ="Samsung Galaxy Watch 42mm 4GB Storage Rose Gold Stainless Steel Case Pink Buckle"
        items.add(TodayDealsModel(R.drawable.swatch1,text,109.90,128.90,16))
        text ="Apple Watch Series 4 44mm Space Grey GPS (Nike Band) Grade B \"eBay Good\""
        items.add(TodayDealsModel(R.drawable.swatch2,text,75.00,93.00,16))
        text ="Apple iPad Air 4 (4th Gen) (10.9 inch) -64GB -256GB Wi-Fi + Cellular - Excellent"
        items.add(TodayDealsModel(R.drawable.ipad1,text,458.00,634.00,32))
        text ="Apple iPad 6 (6th Gen) - (2018 Model) - 32GB - 128GB - Wi-Fi - Cellular - Good"
        items.add(TodayDealsModel(R.drawable.ipad2,text,149.90,180.90,38))

        return items
    }

    fun winterAdapter(items: java.util.ArrayList<WinterModel>) {
        val adapter = WinterAdapter(this, items)
        winterRecyclerView.setAdapter(adapter)
    }

    fun getWinters(): ArrayList<WinterModel> {
        val items: ArrayList<WinterModel> = ArrayList<WinterModel>()
        items.add(WinterModel(R.drawable.blanket, "Blankets"))
        items.add(WinterModel(R.drawable.heaters, "Heaters"))
        items.add(WinterModel(R.drawable.thermostats, "Thermostats"))
        items.add(WinterModel(R.drawable.generators, "Generators"))
        items.add(WinterModel(R.drawable.snowblower, "SnowBlowers"))
        items.add(WinterModel(R.drawable.snowshowel, "SnowShovel"))
        return items
    }
}