package com.dispy.kmmdemo.android

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dispy.kmmdemo.model.remote.ktor.CafeResponseItem

/**
 * Created by Dispy-Yang on 2022/05/22
 *
 * @author Dispy-Yang
 * @since 2022/5/22
 */
class CafeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val name: TextView = itemView.findViewById(R.id.textName)
    private val address: TextView = itemView.findViewById(R.id.textAddress)

    fun bind(cafe: CafeResponseItem) {
        this.name.text = cafe.name
        this.address.text = cafe.address
    }
}