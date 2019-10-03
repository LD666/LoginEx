package com.myfirstapplication.loginex

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.myfirstapplication.loginex.adapter.MyRecyclerAdapter
import kotlinx.android.synthetic.main.activity_recycler.*

    data class myData(var img: Int, var info1: String, var info2: String, var info3: String, var info4: String)

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

        info.add(myData(R.drawable.qs, "Van Yang","lalalala","bbbbbnnnnnddd","awsl"))
        info.add(myData(R.drawable.gd, "Billy!!!!","lalalala","bbbbbnnnnnddd","awsl"))
        info.add(myData(R.drawable.qs, "Van Yang","lalalala","bbbbbnnnnnddd","awsl"))
        info.add(myData(R.drawable.gd, "Billy!!!!","lalalala","bbbbbnnnnnddd","awsl"))

    }

}
