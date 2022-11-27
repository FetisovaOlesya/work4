package com.example.practice4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.practice4.databinding.FragmentTwoBinding


class Fragment_Two : Fragment() {

    lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btNextTwo.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fragment_Two_to_fragment_Three)
        }
        binding.btBackTwo.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fragment_Two_to_fragment_One)
        }
    }
}