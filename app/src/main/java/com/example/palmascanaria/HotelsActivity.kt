package com.example.palmascanaria

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.palmascanaria.databinding.ActivityHotelsBinding

class HotelsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHotelsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHotelsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initListener()

    }

    private fun initListener(){
        binding.btVolverH.setOnClickListener{
            val toast = Toast.makeText(this, R.string.message_back, Toast.LENGTH_SHORT)
            toast.show()
            finish() }
    }
}