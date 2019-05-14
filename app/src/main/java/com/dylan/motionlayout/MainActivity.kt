package com.dylan.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        horizontalAnimationOne()

    }

    fun horizontalAnimationOne() {
        imageView.setOnClickListener {
            var parmas: FrameLayout.LayoutParams = imageView.layoutParams as FrameLayout.LayoutParams
            parmas.gravity = Gravity.END
            imageView.layoutParams = parmas
        }
    }

    fun horizotalAnimation() {
        //水平滑动动画
        imageView.setOnClickListener {
            val width = root.width - imageView.width
            imageView.animate().translationX(width.toFloat())
                .start()
        }
    }

}
