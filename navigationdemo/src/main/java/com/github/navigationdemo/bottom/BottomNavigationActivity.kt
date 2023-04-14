package com.github.navigationdemo.bottom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.github.navigationdemo.R
import com.github.navigationdemo.databinding.ActivityBottomNavigationBinding

class BottomNavigationActivity : AppCompatActivity() {
    var binding :ActivityBottomNavigationBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        initView()
    }

    private fun initView() {
        //方式一、通过使用NavHostFragment，与bottomNavigationView进行联动。是通过同一个navController进行控制。
        /*val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navigation_container) as NavHostFragment
        binding?.bottomNavView?.setupWithNavController(navHostFragment.navController)*/
        //方式二、通过fragment标签实现
        binding?.bottomNavView?.setupWithNavController(findNavController(R.id.navigation_container))
    }

}