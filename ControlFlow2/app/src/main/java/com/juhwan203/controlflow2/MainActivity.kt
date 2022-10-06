package com.juhwan203.controlflow2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = 1
        var b = 2
        var c = 3

        if(a < b){
            Log.d("ControlFlow", "1: a는 b 보다 작습니다.")
        }
        if(a < c){
            Log.d("ControlFlow", "1: a는 c 보다 작습니다.")
        }
        if(a < b){
            Log.d("ControlFlow", "2: a는 b 보다 작습니다.")
        } else {
            Log.d("ControlFlow", "2: a는 c 보다 작습니다.")
        }
    }
}