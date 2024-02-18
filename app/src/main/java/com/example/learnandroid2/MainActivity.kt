package com.example.learnandroid2

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.learnandroid2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var forget_pass_button:TextView;
    lateinit var emailId :EditText
    lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        forget_pass_button = binding.forgetPass
        emailId = binding.editTextTextEmailAddress

        forget_pass_button.setOnClickListener {

            val str = emailId.text.toString()
            var intent = Intent(this,forgetPasswordActivity::class.java)
            intent.putExtra("userEmail",str);
            startActivity(intent)
        }
    }




}