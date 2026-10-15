package com.example.palmascanaria

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.palmascanaria.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initListener()
    }

    private fun initListener(){
        binding.ivRestaurants.setOnClickListener {
            val toastR = Toast.makeText(this, R.string.go_to_restaurants, Toast.LENGTH_SHORT)
            toastR.show()
            val intent = Intent(this, RestaurantsActivity::class.java).apply {  }
            startActivity(intent)
        }

        binding.ivHotels.setOnClickListener {
            val toastH = Toast.makeText(this, R.string.go_to_hotels, Toast.LENGTH_SHORT)
            toastH.show()
            val intent = Intent(this, HotelsActivity::class.java).apply {  }
            startActivity(intent)
        }

        binding.ivMonuments.setOnClickListener {
            val toastX = Toast.makeText(this, R.string.go_to_monuments, Toast.LENGTH_SHORT)
            toastX.show()
            val intent = Intent(this, MonumentsActivity::class.java).apply {  }
            startActivity(intent)
        }

        binding.ivMuseums.setOnClickListener {
            val toastM = Toast.makeText(this, R.string.go_to_museums, Toast.LENGTH_SHORT)
            toastM.show()
            val intent = Intent(this, MuseumsActivity::class.java).apply {  }
            startActivity(intent)
        }
    }
}