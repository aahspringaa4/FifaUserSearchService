package com.example.fifausersearchservice.feature.rank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fifausersearchservice.R
import com.example.fifausersearchservice.base.BaseFragment
import com.example.fifausersearchservice.databinding.ActivityToprankBinding

class TopRankFragment: BaseFragment<ActivityToprankBinding>(
    R.layout.activity_toprank
){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return binding.root
    }

    override fun observeEvent() {

    }

    override fun initView() {

    }

}