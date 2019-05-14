package com.dylan.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Scene
import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class GoActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go)

        //绑定数据
        bindData()

    }

    /**
     * 此处findViewById不能省略
     */
    private fun bindData() {

        findViewById<ImageView>(R.id.image_film_cover).setOnClickListener(this)
        findViewById<RatingBar>(R.id.rating_film_rating).rating = 4.5f
        findViewById<TextView>(R.id.text_film_title).text = getString(R.string.film_title)
        findViewById<TextView>(R.id.text_film_description).text = getString(R.string.film_description)
    }

    private var toggle = true

    override fun onClick(v: View) {
        val root = findViewById<ViewGroup>(R.id.root)
        val startScene = Scene.getSceneForLayout(root, R.layout.go_start, this)
        val endScene = Scene.getSceneForLayout(root, R.layout.go_end, this)
        if (toggle) {
            TransitionManager.go(endScene)
        } else {
            TransitionManager.go(startScene)
        }
        bindData()
        toggle = !toggle
    }
}
