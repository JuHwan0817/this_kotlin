package com.juhwan203.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juhwan203.fragment.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    var mainActivity:MainActivity? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDetailBinding.inflate(inflater,container,false)
        binding.btnBack.setOnClickListener { mainActivity?.goBack() }
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }
}