package com.example.mobileuikit

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BlogPostPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_blog_post_page)

        findViewById<CardView>(R.id.post_1).setOnClickListener {
            startActivity(
                Intent(this,ExpensesPageActivity::class.java)
            )
        }
    }
}