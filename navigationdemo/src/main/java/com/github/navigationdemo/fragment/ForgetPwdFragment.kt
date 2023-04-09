package com.github.navigationdemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.github.navigationdemo.databinding.FragmentForgetPwdBinding
import com.github.navigationdemo.databinding.FragmentLoginBinding

class ForgetPwdFragment : Fragment() {

    var _binding:FragmentForgetPwdBinding?=null
    val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentForgetPwdBinding.inflate(inflater).also {
            _binding=it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //此处为获取值并进行重现
        val userName = arguments?.getString("userName") ?: ""
        binding.tvGetArg.text="此处传过来的值为：${userName}"
        binding.btnGotoPre.setOnClickListener{
            findNavController().navigateUp()
        }

    }
}