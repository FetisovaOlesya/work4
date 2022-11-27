package com.example.practice4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.practice4.databinding.FragmentSettingTwoBinding

class Fragment_Setting_Two : Fragment() {

    lateinit var binding: FragmentSettingTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingTwoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btSettingTwoNext.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fragment_Setting_Two_to_fragment_Setting_Three)
        }
        binding.btSettingTwoBack.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fragment_Setting_Two_to_fragment_Setting_One)
        }
    }
}