package com.myfirstapplication.loginex.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myfirstapplication.loginex.R
import com.myfirstapplication.loginex.RecyclerActivity
import com.myfirstapplication.loginex.myData
import kotlinx.android.synthetic.main.text_view.view.*

class Holder(view: View): RecyclerView.ViewHolder(view){

    var img = view.myImg
    var inf = view.myText

}

class MyRecyclerAdapter(var iteam: ArrayList<myData>, var context: Context): RecyclerView.Adapter<Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        var res = Holder(LayoutInflater.from(context).inflate(R.layout.text_view, parent, false))
        return res
    }


    override fun getItemCount(): Int {
        return iteam.size
    }


    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.img.setImageResource(iteam[position].img)
        holder.inf.setText(iteam[position].name)
    }
}