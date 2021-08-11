package org.geeksforgeeks.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTextView = findViewById<TextView>(R.id.text_view)
        val mBtn = findViewById<Button>(R.id.btn)

        mBtn.setOnClickListener {
            val mParams = mTextView.layoutParams as RelativeLayout.LayoutParams
            mParams.apply {
                width *= 2
                height *= 2
            }
            mTextView.layoutParams = mParams
        }

    }
}