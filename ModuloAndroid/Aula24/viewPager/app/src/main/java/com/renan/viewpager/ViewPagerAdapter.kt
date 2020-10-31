package com.renan.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(
    private val fragments: List<Fragment>,
    private val titulos: List<String>,
    manager: FragmentManager
) : FragmentPagerAdapter(
    manager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    //quantidade de tabs
    override fun getCount() = fragments.size

    // retorna o fragment correspondente a posição
    override fun getItem(position: Int) = fragments[position]

    //retorna o nome da tab
    override fun getPageTitle(position: Int) = titulos[position]
}