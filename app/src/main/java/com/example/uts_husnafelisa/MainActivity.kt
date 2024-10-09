package com.example.uts_husnafelisa

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts_husnafelisa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val usernameInput = binding.fieldUsername.text.toString()
            if (usernameInput.isNotEmpty()){
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("USERNAME_INPUT", usernameInput)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Enter your name first", Toast.LENGTH_LONG).show()
            }
        }
    }
}