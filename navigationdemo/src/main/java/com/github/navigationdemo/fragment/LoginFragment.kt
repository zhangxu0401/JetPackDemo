package com.github.navigationdemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.navigateUp
import com.github.navigationdemo.R
import com.github.navigationdemo.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    var _binding: FragmentLoginBinding? = null
    val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentLoginBinding.inflate(inflater).also {
            _binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGotoRegister.setOnClickListener {
            //获取导航控制器，并通过注册的nav_config资源，根据ActionID，进行跳转页面
            findNavController().navigate(R.id.goto_register)
        }
        //使用Bundle进行跳转
        binding.btnGotoForgetPwd.setOnClickListener {
            //获取导航控制器，并通过注册的nav_config资源，根据ActionID，进行跳转页面
            //发送bundle
            findNavController().navigate(R.id.goto_forget, bundleOf("userName" to "加班狗"))
        }
        //使用NavOption进行跳转
        val navOption =
            NavOptions.Builder().setPopExitAnim(R.anim.slide_from_left_to_right_out)
                .setLaunchSingleTop(true)//类似于singleTop如果在栈顶，则不新建Fragment
                .setPopUpTo(
                    R.id.goto_register,//要跳转页面动作的ActionID
                    inclusive = true,//表示是否也要弹出自己
                    saveState = false//表示是否保存弹出内容的状态信息。
                )
        binding.btnGotoRegister2.setOnClickListener {
            findNavController().navigate(
                R.id.goto_forget,
                null,
                navOption.build()
            )
        }
        //返回上一页
        binding.btnNavigationUp.setOnClickListener{
            findNavController().navigateUp()
        }

        binding.btnShareFragment.setOnClickListener{
            findNavController().navigate(R.id.goto_forget,
            null,null,)
        }
        binding.btnShareActivity.setOnClickListener{

        }

    }
}