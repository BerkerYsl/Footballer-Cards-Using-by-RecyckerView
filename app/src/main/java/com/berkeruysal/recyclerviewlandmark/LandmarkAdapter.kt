package com.berkeruysal.recyclerviewlandmark

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.berkeruysal.recyclerviewlandmark.databinding.RecyclerRowBinding

class LandmarkAdapter(var landmarkList:ArrayList<Landmark>): RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(var binding: RecyclerRowBinding):RecyclerView.ViewHolder(binding.root)
    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        var binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        //sayfa açılınca isimler gösterilecek
    holder.binding.recyclerView.text= landmarkList.get(position).name
     //Tıklanınca ne olacak
       holder.itemView.setOnClickListener {
           var intent=Intent(holder.itemView.context,ActivityDetails::class.java)
           intent.putExtra("landmark",landmarkList.get(position))
           holder.itemView.context.startActivity(intent)
       }

    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }
}