package com.example.employeedetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit(view: View) {
        var getecode=findViewById<EditText>(R.id.ecode)
        var getename=findViewById<EditText>(R.id.ename)
        var getdes=findViewById<EditText>(R.id.des)
        var getcname=findViewById<EditText>(R.id.cname)
        var getplace=findViewById<EditText>(R.id.place)
        Toast.makeText(this,getecode.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getename.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getdes.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getcname.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getplace.text.toString(),Toast.LENGTH_SHORT).show()

    }
}