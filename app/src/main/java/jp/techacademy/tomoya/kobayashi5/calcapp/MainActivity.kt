package jp.techacademy.tomoya.kobayashi5.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }


    override fun onClick(v: View?) {

        if(v.id == R.id.button1) {
            val number1 = editText1.text
            val number2 = editText2.text
            val calc = "+"

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", number1)
            intent.putExtra("VALUE2", number2)
            intent.putExtra("CALC", calc)

            startActivity(intent)

        } else if (v.id == R.id.button2) {
            val number1 = editText1.text
            val number2 = editText2.text
            val calc = "-"

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", number1)
            intent.putExtra("VALUE2", number2)
            intent.putExtra("CALC", calc)

            startActivity(intent)

        } else if (v.id == R.id.button3) {
            val number1 = editText1.text
            val number2 = editText2.text
            val calc = "*"

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", number1)
            intent.putExtra("VALUE2", number2)
            intent.putExtra("CALC", calc)

            startActivity(intent)

        } else if (v.id == R.id.button4) {
            val number1 = editText1.text
            val number2 = editText2.text
            val calc = "/"

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", number1)
            intent.putExtra("VALUE2", number2)
            intent.putExtra("CALC", calc)

            startActivity(intent)

        }

    }

}