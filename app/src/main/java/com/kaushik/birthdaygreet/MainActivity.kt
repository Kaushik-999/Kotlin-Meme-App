package com.kaushik.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createCard.setOnClickListener {
            val msg = nameInput.editableText.toString().trim()
            if(msg == "") {
                Toast.makeText(this,"Enter a name",Toast.LENGTH_LONG).show()
            } else {

                // Intent creation for BirthdayGreetingActivity
                val intent = Intent(this, BirthdayGreetingActivity::class.java)
                intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, msg) // extra data in put here
                startActivity(intent)

            }


        }


    }
}