package com.android.musino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.android.musino.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpBottomNavigationMenu()
    }

    private fun setUpBottomNavigationMenu() {
        val bottomNavigationMenu = binding.bottomNavigationMenu

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container)

        if (navHostFragment != null) {
            NavigationUI.setupWithNavController(bottomNavigationMenu,navHostFragment.findNavController())
        }
    }

}