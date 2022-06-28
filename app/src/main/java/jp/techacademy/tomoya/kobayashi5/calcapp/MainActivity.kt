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


    override fun onClick(v: View) {

        //例外処理
        //例外がなかった場合に実行したいこと
        try{
            val x = editText1.text.toString().toDouble()
            val y = editText2.text.toString().toDouble()
            val intent = Intent(this, SecondActivity::class.java)

            if(v.id == R.id.button1) {
                intent.putExtra("ANSWER", x + y)

            } else if (v.id == R.id.button2) {
                intent.putExtra("ANSWER", x - y)

            } else if (v.id == R.id.button3) {
                intent.putExtra("ANSWER", x * y)

            } else if (v.id == R.id.button4) {
                intent.putExtra("ANSWER", x / y)

            }

            startActivity(intent)

            //例外があった場合にエラーの表示 ＆ 何も実行させない。
        } catch (e : Exception){
            println("正しい数字を入力してください") //snack barの代わりとして
        }

    }



    }
