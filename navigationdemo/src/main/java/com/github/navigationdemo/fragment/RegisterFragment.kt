package com.github.navigationdemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.github.navigationdemo.R
import com.github.navigationdemo.databinding.FragmentLoginBinding
import com.github.navigationdemo.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    var _binding:FragmentRegisterBinding?=null
    val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentRegisterBinding.inflate(inflater).also {
            _binding=it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNavUp.setOnClickListener{
            findNavController().navigateUp()
        }
        binding.btnPopBack.setOnClickListener{
            findNavController().popBackStack()
        }
    }
}