package com.example.practice4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.practice4.databinding.FragmentOneBinding


class Fragment_One : Fragment(){

    lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btNextOne.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fragment_One_to_fragment_Two)
        }

        binding.btToSettingOne.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fragment_One_to_nav_settings)
        }



    }
}







