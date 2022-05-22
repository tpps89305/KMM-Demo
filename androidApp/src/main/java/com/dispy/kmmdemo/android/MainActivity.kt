package com.dispy.kmmdemo.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var cafeRecyclerView: RecyclerView
    private val adapter: CafeAdapter by lazy {
        CafeAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cafeRecyclerView = findViewById(R.id.rvCafeList)
        cafeRecyclerView.adapter = adapter
        cafeRecyclerView.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        cafeRecyclerView.addItemDecoration(
            DividerItemDecoration(
                applicationContext,
                DividerItemDecoration.VERTICAL
            )
        )

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.fetchCafeData("kaohsiung")
        viewModel.cafeListLiveData.observe(this) {
            adapter.cafeList = it
            adapter.notifyDataSetChanged()
        }
    }
}
