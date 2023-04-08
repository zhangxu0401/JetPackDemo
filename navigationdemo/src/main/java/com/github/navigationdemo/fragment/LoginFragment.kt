package com.github.navigationdemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.github.navigationdemo.R
import com.github.navigationdemo.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    var _binding:FragmentLoginBinding?=null
    val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentLoginBinding.inflate(inflater).also {
            _binding=it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGotoForgetPwd.setOnClickListener{
            //获取导航控制器，并通过注册的nav_config资源，根据ActionID，进行跳转页面
            findNavController().navigate(R.id.goto_forget)
        }
        binding.btnGotoRegister.setOnClickListener{
            findNavController().navigate(R.id.goto_register)
        }
    }
}