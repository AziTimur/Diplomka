package com.example.diplomka.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.diplomka.Caps
import com.example.diplomka.R
import com.example.diplomka.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {
    private val binding: FragmentHomeBinding by viewBinding()
    private lateinit var  adapter: HomeAdapter
    private lateinit var caps: Caps

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        initRecycler()

    }

    private fun initAdapter() {
        adapter=this@HomeFragment.adapter
    }

    private fun initRecycler() {
        binding.homeRv.apply {
            layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.VERTICAL,false)
        }
        adapter.notifyDataSetChanged()
    }
}