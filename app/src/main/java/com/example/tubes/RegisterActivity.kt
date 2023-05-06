package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.util.Linkify
import android.widget.TextView
import com.example.tubes.databinding.ActivityRegisterBinding


class RegisterActivity : AppCompatActivity() {
    private val binding: ActivityRegisterBinding by lazy {
        ActivityRegisterBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        val signUpTextView = findViewById<TextView>(R.id.sign_in_hyperlink)
        signUpTextView.autoLinkMask = Linkify.WEB_URLS

        signUpTextView.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


        binding.signupBotton.setOnClickListener{
            val user_email = binding.userEmail.text.toString()
            val password   = binding.password.text.toString()
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("userEmail",user_email)
            intent.putExtra("password",password)

            startActivity(intent)
        }
    }
}