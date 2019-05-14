package com.dylan.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_object_animator.*

class ObjectAnimatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_animator)

        clickSecondPictrueByParams()
    }

    private fun clickSecondPictrueByParams() {

        var flag: Boolean = false

        image_two.setOnClickListener {
            TransitionManager.beginDelayedTransition(image_two.parent as ViewGroup)
            val params: LinearLayout.LayoutParams = image_two.layoutParams as LinearLayout.LayoutParams
            if (flag) {
                params.height /= 2
                params.width /= 2
                flag = false
            } else {
                params.height *= 2
                params.width *= 2
                flag = true
            }

            image_two.layoutParams = params

        }
    }

    /**
     * 利用动画进行改变View位置
     */
    private fun clickSecondPictrue() {
        image_two.setOnClickListener {
            image_two.animate()
                .scaleX(2f)
                .scaleY(2f)
                .start()
        }
    }
}
