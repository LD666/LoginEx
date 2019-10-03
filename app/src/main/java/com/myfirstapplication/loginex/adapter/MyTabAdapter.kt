package com.myfirstapplication.loginex.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyTabAdapter(manger: FragmentManager): FragmentPagerAdapter(manger) {

    var fragmentList: ArrayList<Fragment> = ArrayList()
    var tittleList: ArrayList<String> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }


    override fun getCount(): Int {
        return fragmentList.size
    }

    fun addFragment(fragment: Fragment, tittle: String){

        fragmentList.add(fragment)
        tittleList.add(tittle)

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tittleList[position]
    }

}