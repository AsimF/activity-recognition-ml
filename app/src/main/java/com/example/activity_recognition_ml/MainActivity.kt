package com.example.activity_recognition_ml

//import android.R //edit for fix
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    //get BUTTON elements
    private val standButton = stand_button
    private val walkButton = walk_button
    private val jumpButton = jump_button
    private val trainButton = train_button
    private val resetButton = reset_button
    private val testButton = test_button
    //get TEXT elements
    private var collectText = collect_text
    private var trainText = train_text
    private var testText = test_text

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val tabsPagerAdapter = TabsPagerAdapter(this, supportFragmentManager)
//
//        val viewPager: ViewPager = findViewById(R.id.view_pager)
//        viewPager.adapter = tabsPagerAdapter
//
//        val tabs = findViewById<TabLayout>(R.id.tabs)
//        tabs.setupWithViewPager(viewPager)
    }
}
