package com.example.thanhtc.demokotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
class SecondActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_second)
		val intent:Intent = this.intent
		val t:String = intent.getStringExtra(EXTRATEST)
		txv2.text = t
		btnBack.setOnClickListener({this.finish()})

	}
}
