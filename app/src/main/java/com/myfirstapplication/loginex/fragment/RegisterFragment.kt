package com.myfirstapplication.loginex.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.myfirstapplication.loginex.R
import kotlinx.android.synthetic.main.register_fragment.view.*

class RegisterFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var view = inflater.inflate(R.layout.register_fragment, container, false)


        var saveMe = this.activity!!.getSharedPreferences("UserInfo", Context.MODE_PRIVATE)

        view.regButtonID.setOnClickListener(View.OnClickListener {

            var editor = saveMe.edit()

            var regName = view.regUserID.text.toString()
            var regPass = view.regPassID.text.toString()

            editor.putString("pass_name", regName)
            editor.putString("pass_pass", regPass)
            editor.commit()

            view.regUserID.setText("")
            view.regPassID.setText("")

        })


        return view

    }

}