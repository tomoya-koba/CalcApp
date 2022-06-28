package jp.techacademy.tomoya.kobayashi5.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val answer = intent.getDoubleExtra("ANSWER",0.0)

        textView.text = answer.toString()


    }
}
