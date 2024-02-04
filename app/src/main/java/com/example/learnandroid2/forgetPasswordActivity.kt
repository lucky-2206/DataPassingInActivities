package com.example.learnandroid2

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class forgetPasswordActivity : AppCompatActivity() {

    lateinit var receive_msg:EditText
    lateinit var submit_button :ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        receive_msg = findViewById(R.id.editTextTextEmailAddress2)
        submit_button = findViewById(R.id.imageButton2)

        val intent = intent
        val str = intent.getStringExtra("userEmail")
        receive_msg.setText(str)

        
    }
}