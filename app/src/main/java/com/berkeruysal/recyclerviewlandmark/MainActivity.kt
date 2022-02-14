package com.berkeruysal.recyclerviewlandmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.berkeruysal.recyclerviewlandmark.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var landmarklist:ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        landmarklist= ArrayList()
        var ronaldo=Landmark("Cristiano Ronaldo",36,"Portugal",R.drawable.ronaldo)
        var ronaldinho=Landmark("Ronaldinho",35,"Brazil",R.drawable.ronaldinho)
        var messi=Landmark("Lionel Messi",34,"Argentina",R.drawable.messi)
        var ibrahimovic=Landmark("Zlatan Ibrahimovic",41,"Sweeden",R.drawable.ibrahimovic)
        var kane=Landmark("Harry Kane",30,"England",R.drawable.kane)
        var lewa=Landmark("Robert Lewandovski",31,"Poland",R.drawable.lewandovski)
        landmarklist.add(ronaldo)
        landmarklist.add(ronaldinho)
        landmarklist.add(messi)
        landmarklist.add(ibrahimovic)
        landmarklist.add(kane)
        landmarklist.add(lewa)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        var landmarkAdapter=LandmarkAdapter(landmarklist)
        binding.recyclerView.adapter=landmarkAdapter
    }
}