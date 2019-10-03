package com.myfirstapplication.loginex.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.myfirstapplication.loginex.MainActivity
import com.myfirstapplication.loginex.R
import com.myfirstapplication.loginex.RecyclerActivity
import kotlinx.android.synthetic.main.login_fragment.view.*

class LoginFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.login_fragment, container, false)

        var saveMe = this.activity!!.getSharedPreferences("UserInfo", Context.MODE_PRIVATE)
        //var isTrue = this.activity!!.getSharedPreferences("IsTrue", Context.MODE_PRIVATE)
        //var ifTrue = isTrue.edit()

        view.loginButtonID.setOnClickListener(View.OnClickListener {

            var passName = saveMe.getString("pass_name", "")
            var passPass = saveMe.getString("pass_pass", "")

            if(passName == view.loginUserID.text.toString() &&
                passPass == view.loginPassID.text.toString()){

                Toast.makeText(context, "RIGHT", Toast.LENGTH_LONG).show()

                //ifTrue.putInt("isTrue", 1)

                var myIntent = Intent(activity, RecyclerActivity::class.java)
                startActivity(myIntent)

                Log.e("No Error", "LLLLLLLALALALALALLALALALALALALAL")

            }else{

                Toast.makeText(context, "WRONG", Toast.LENGTH_LONG).show()

            }

        })

        return view

    }

}