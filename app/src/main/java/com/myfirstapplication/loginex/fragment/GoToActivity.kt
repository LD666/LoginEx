package com.myfirstapplication.loginex.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myfirstapplication.loginex.R
import kotlinx.android.synthetic.main.activity_go_to.*

class GoToActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_to)

        var img = intent.getIntExtra("theImg", 0)
        var info1 = intent.getStringExtra("theInf1")
        var info2 = intent.getStringExtra("theInf2")
        var info3 = intent.getStringExtra("theInf3")
        var info4 = intent.getStringExtra("theInf4")

        gotoImg.setImageResource(img)
        gotoText1.text = info1
        gotoText2.text = info2
        gotoText3.text = info3
        gotoText4.text = info4

    }
}
