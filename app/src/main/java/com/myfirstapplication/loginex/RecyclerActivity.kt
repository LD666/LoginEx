package com.myfirstapplication.loginex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.myfirstapplication.loginex.adapter.MyRecyclerAdapter
import kotlinx.android.synthetic.main.activity_recycler.*

data class myData(var img: Int, var name: String)

class RecyclerActivity : AppCompatActivity() {


    var info: ArrayList<myData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        addInto()

        recyclerID.layoutManager = LinearLayoutManager(this)
        recyclerID.adapter = MyRecyclerAdapter(info, this)

    }

    fun addInto (){

        info.add(myData(R.drawable.qs, "Van Yang"))
        info.add(myData(R.drawable.gd, "Billy!!!!"))

    }

}
