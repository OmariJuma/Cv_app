package com.example.cv

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ivGithub = findViewById<ImageView>(R.id.imgGithub)
        ivGithub.setOnClickListener {
            val url = "https://github.com/OmariJuma"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
        val insta = findViewById<ImageView>(R.id.imgInsta)
        insta.setOnClickListener(){
            val url="https://instagram.com/Omarion Jumah"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse(url)
            startActivity(intent)
        }
        val mail = findViewById<ImageView>(R.id.imgGmail)
        mail.setOnClickListener {
            val url = "https://gmail.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}