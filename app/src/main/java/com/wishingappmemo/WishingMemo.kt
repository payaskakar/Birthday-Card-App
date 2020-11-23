package com.wishingappmemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_wishing_memo.*

class WishingMemo : AppCompatActivity() {
    companion object{
        const val Name_Id="name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wishing_memo)

        val name=intent.getStringExtra(Name_Id)
        MemoCard.text="Happy Birthday\n$name"
    }

}