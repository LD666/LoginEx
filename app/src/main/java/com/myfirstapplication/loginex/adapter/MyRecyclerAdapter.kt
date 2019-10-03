package com.myfirstapplication.loginex.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myfirstapplication.loginex.MainActivity
import com.myfirstapplication.loginex.R
import com.myfirstapplication.loginex.RecyclerActivity
import com.myfirstapplication.loginex.fragment.GoToActivity
import com.myfirstapplication.loginex.myData
import kotlinx.android.synthetic.main.new_recycler_layout.view.*
import kotlinx.android.synthetic.main.text_view.view.*

class Holder(view: View): RecyclerView.ViewHolder(view){

    var img = view.newImg
    var inf1 = view.newText1
    var inf2 = view.newText2
    var inf3 = view.newText3
    var inf4 = view.newText4

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
        holder.inf1.text = iteam[position].info1
        holder.inf2.text = iteam[position].info2
        holder.inf3.text = iteam[position].info3
        holder.inf4.text = iteam[position].info4

        var myIntent = Intent(context, GoToActivity::class.java)

        holder.img.setOnClickListener(View.OnClickListener {


            myIntent.putExtra("theImg", iteam[position].img)
            myIntent.putExtra("theInf1", iteam[position].info1)
            myIntent.putExtra("theInf2", iteam[position].info2)
            myIntent.putExtra("theInf3", iteam[position].info3)
            myIntent.putExtra("theInf4", iteam[position].info4)

            context.startActivities(arrayOf(myIntent))

        })

    }
}