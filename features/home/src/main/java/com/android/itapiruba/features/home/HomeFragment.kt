package com.android.itapiruba.features.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.itapiruba.features.home.databinding.HomeFragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: HomeFragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return HomeFragmentHomeBinding.inflate(inflater, container, false)
            .also { _binding = it }
            .root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}