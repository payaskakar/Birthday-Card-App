package com.wishingappmemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun getyourcard(view: View) {
        val name=UniqueName.editableText.toString();
        val intent=Intent(this, WishingMemo::class.java)
        intent.putExtra(WishingMemo.Name_Id, name)
        startActivity(intent)



        Toast.makeText(this, "Preparing Your Card! $name ", Toast.LENGTH_LONG).show()
    }
}