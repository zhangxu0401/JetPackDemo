package com.github.jetpackdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.jetpackdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var _binding: ActivityMainBinding? = null
    val binding get()=_binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDeepLink.setOnClickListener{
            var url = "myscheme://myhost/MyPath"
            var uri = Uri.parse(url)
            var intent = Intent();
            intent.setData(uri);
            this.startActivity(intent);
        }
    }
}