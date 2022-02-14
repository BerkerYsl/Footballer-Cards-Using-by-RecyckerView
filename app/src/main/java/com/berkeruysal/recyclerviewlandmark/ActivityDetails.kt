package com.berkeruysal.recyclerviewlandmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.berkeruysal.recyclerviewlandmark.databinding.ActivityDetailsBinding

class ActivityDetails : AppCompatActivity() {
    private lateinit var binding:ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var intent=intent
        var footballers=intent.getSerializableExtra("landmark") as Landmark
        binding.nameText.text=footballers.name
        binding.ageText.text=footballers.age.toString()
        binding.countryText.text=footballers.countryName
        binding.imageView.setImageResource(footballers.image!!)
    }
}