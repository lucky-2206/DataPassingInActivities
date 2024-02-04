package com.example.learnandroid2

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var forget_pass_button:TextView;
    lateinit var emailId :EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        forget_pass_button = findViewById(R.id.forgetPass)
        emailId = findViewById(R.id.editTextTextEmailAddress)
        forget_pass_button.setOnClickListener {

            val str = emailId.text.toString()
            var intent = Intent(this,forgetPasswordActivity::class.java)
            intent.putExtra("userEmail",str);
            startActivity(intent)
        }
    }




}