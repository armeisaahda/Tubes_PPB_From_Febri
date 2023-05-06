package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.text.util.Linkify
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.tubes.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.hide()
        val signUpTextView = findViewById<TextView>(R.id.sign_up_hyperlink)
        signUpTextView.autoLinkMask = Linkify.WEB_URLS

        signUpTextView.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        val userEmail  = intent.getStringExtra("userEmail")
        val password   = intent.getStringExtra("password")
        binding.emaill.setText(userEmail)
        binding.passLogin.setText(password)

        binding.signinBotton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
    override fun onStart(){
        super.onStart()

    }
    override fun onResume(){
        super.onResume()

    }
    override fun onPause(){
        super.onPause()

    }
    override fun onStop(){
        super.onStop()

    }
    override fun onRestart(){
        super.onRestart()

    }
    override fun onDestroy() {
        super.onDestroy()

    }

}