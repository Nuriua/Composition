package com.selva.composition.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.selva.composition.R
import com.selva.composition.databinding.FragmentWelcomeBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}