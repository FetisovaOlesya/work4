package com.example.practice4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.practice4.databinding.FragmentSettingOneBinding


class Fragment_Setting_One : Fragment(){

    lateinit var binding: FragmentSettingOneBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingOneBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btSettingToMain.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fragment_Setting_One_to_fragment_One)
        }

        binding.btSettingNextOne.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fragment_Setting_One_to_fragment_Setting_Two)
        }
    }



}







