package com.dispy.kmmdemo.android

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dispy.kmmdemo.model.remote.ktor.CafeResponseItem

/**
 * Created by Dispy-Yang on 2022/05/22
 *
 * @author Dispy-Yang
 * @since 2022/5/22
 */
class CafeAdapter : RecyclerView.Adapter<CafeViewHolder>() {
    var cafeList = listOf<CafeResponseItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CafeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cafe, parent, false)
        return CafeViewHolder(view)
    }

    override fun onBindViewHolder(holder: CafeViewHolder, position: Int) {
        val cafe: CafeResponseItem = cafeList[position]
        holder.bind(cafe)
    }

    override fun getItemCount(): Int = cafeList.size
}