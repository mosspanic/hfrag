package com.example.homefrag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), cllist {
    private var screen = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //supportFragmentManager.beginTransaction().add(R.id.main_container, BFragment1()).commit()
        //Thread.sleep(7000)
        //val ew=supportFragmentManager.fragmentFactory.run {   BFragment2.varf()}

        //supportFragmentManager.beginTransaction().add(R.id.main_container, BFragment2()).commit()
        //println("************************************************$screen")
        //supportFragmentManager.beginTransaction().add(R.id.main_container, BFragment1.newInstance(55676874)).commit()
        supportFragmentManager.beginTransaction().add(R.id.main_container, BFragment2.newInstance(screen)).commit()

    }
    override fun click() {
        screen++
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.main_container, BFragment2.newInstance(screen))
            .commit()

    }



}

