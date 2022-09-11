package com.empedocles.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.empedocles.appnavigation.databinding.FragmentGetStartedBinding


class GetStartedFragment : Fragment() {
    private lateinit var binding: FragmentGetStartedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGetStartedBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            getStarted.setOnClickListener {
                findNavController().navigate(R.id.action_getStartedFragment_to_loginFragment)
            }
        }
    }
}