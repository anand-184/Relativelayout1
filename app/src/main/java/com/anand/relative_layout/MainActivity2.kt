package com.anand.relative_layout

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    var num: EditText? = null
    var btadd: Button? = null
    var btsub: Button? =null
    var btmul: Button? =null
    var btdiv: Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        num=findViewById(R.id.num)
        btadd=findViewById(R.id.btadd)
        btsub=findViewById(R.id.btsub)
        btmul=findViewById(R.id.btmul)
        btdiv=findViewById(R.id.btdiv)

        btadd?.setOnClickListener {
            var num1= num?.text.toString().toInt()
            val num2= 2
            var result= num1+num2
            num?.setText(result.toString())

        }
        btsub?.setOnClickListener {
            val num2=2
            var result = num?.text.toString().toInt().minus(num2)
            num?.setText(result.toString())

        }
        btmul?.setOnClickListener {
            val num2=2
            var result = num?.text.toString().toInt().times(num2)
            num?.setText(result.toString())
        }
        btdiv?.setOnClickListener {
            val num2=2
            var result=num?.text.toString().toInt().div(num2)
            num?.setText(result.toString())

        }



    }
}