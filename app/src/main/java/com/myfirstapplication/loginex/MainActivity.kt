package com.myfirstapplication.loginex

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myfirstapplication.loginex.adapter.MyTabAdapter
import com.myfirstapplication.loginex.fragment.LoginFragment
import com.myfirstapplication.loginex.fragment.RegisterFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var adapter = MyTabAdapter(supportFragmentManager)
        adapter.addFragment(LoginFragment(), "Log In")
        adapter.addFragment(RegisterFragment(), "Register")
        myPagerID.adapter = adapter
        myTabID.setupWithViewPager(myPagerID)

//        var isTrue = getSharedPreferences("IsTrue", Context.MODE_PRIVATE)
//        var setToFalse = isTrue.edit()
//
//        if(isTrue.getInt("isTrue", 0) == 1){
//
//            var myIntent = Intent(this, RecyclerActivity::class.java)
//            setToFalse.putInt("isTrue", 0)
//            startActivity(myIntent)
//
//        }

    }
}
