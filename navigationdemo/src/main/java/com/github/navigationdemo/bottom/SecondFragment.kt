package com.github.navigationdemo.bottom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.github.navigationdemo.R
import com.github.navigationdemo.databinding.FragmentLoginBinding
import com.github.navigationdemo.databinding.FragmentRegisterBinding
import com.github.navigationdemo.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    var _binding:FragmentSecondBinding?=null
    val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentSecondBinding.inflate(inflater).also {
            _binding=it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}