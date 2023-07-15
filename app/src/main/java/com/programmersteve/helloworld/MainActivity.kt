package com.programmersteve.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    public fun onBtnClick (view:View){
        var txtHello:TextView = findViewById(R.id.txtMessage)
        var editText:EditText = findViewById(R.id.Message)
        txtHello.setText("Hello "+ editText.getText().toString())
    }
}

// TODO: Finish this