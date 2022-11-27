package com.example.practice4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.practice4.databinding.FragmentSettingThreeBinding


class Fragment_Setting_Three : Fragment(){

    lateinit var binding: FragmentSettingThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingThreeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btSettingThreeBack.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fragment_Setting_Three_to_fragment_Setting_Two)
        }
    }
}