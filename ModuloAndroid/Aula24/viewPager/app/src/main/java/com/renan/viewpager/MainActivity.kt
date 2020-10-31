package com.renan.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager>(R.id.viewPager)
        val tab = findViewById<TabLayout>(R.id.tabLayout)

        tab.setupWithViewPager(pager)

        val fragments = listOf(
            MeuFragment(), MeuFragment(), MeuFragment()
        )

        val titulos = listOf(
            getString(R.string.home), getString(R.string.biblioteca),getString(R.string.favoritos)
        )

        pager.adapter = ViewPagerAdapter(fragments,titulos,supportFragmentManager)

        tab.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tab.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_bookmark_24)
        tab.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_star_24)
    }
}