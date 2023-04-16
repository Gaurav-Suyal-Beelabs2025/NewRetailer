package com.suyal.newretailer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      val  animationView=findViewById<LottieAnimationView>(R.id.animation);
        animationView.playAnimation();




    }
}