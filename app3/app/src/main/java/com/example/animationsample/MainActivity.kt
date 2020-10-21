package com.example.animationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //animationの定義
        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb)
        val stb = AnimationUtils.loadAnimation(this, R.anim.stb)
        val btt = AnimationUtils.loadAnimation(this, R.anim.btt)
        val btt2 = AnimationUtils.loadAnimation(this, R.anim.btt2)
        val btt3 = AnimationUtils.loadAnimation(this, R.anim.btt3)
        val btt4 = AnimationUtils.loadAnimation(this, R.anim.btt4)

        //animationの対象を定義
        val headertitle = findViewById(R.id.headertitle) as TextView
        val subtitle = findViewById(R.id.subtitle) as TextView
        val iccard = findViewById(R.id.ic_card) as ImageView

        val resultOne = findViewById(R.id.resultOne) as LinearLayout
        val resultTwo = findViewById(R.id.resultTwo) as LinearLayout
        val resultThree = findViewById(R.id.resultThree) as LinearLayout

        val button = findViewById(R.id.bun_next_corse) as Button

        //setanimation
        headertitle.startAnimation(ttb)
        subtitle.startAnimation(ttb)
        iccard.startAnimation(stb)

        resultOne.startAnimation(btt)
        resultTwo.startAnimation(btt2)
        resultThree.startAnimation(btt3)

        button.startAnimation(btt4)

    }
}
