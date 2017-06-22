package com.example.thanhtc.demokotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main2.*

 const val EXTRATEST = "user_id"
class Main2Activity : AppCompatActivity() {
public
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main2)
		txv.text = "Hello World"
		btn.setText("Click")
		btn.setOnClickListener(View.OnClickListener {
			txv.setExtText()
			val intent:Intent = Intent(this,MainActivity::class.java)
			intent.putExtra(EXTRATEST,txv.text.toString())
			startActivity(intent)
		})
//		btn.setOnClickListener({ v ->
//			txv.setExtText()
//			val intent:Intent = Intent(this,SecondActivity::class.java)
//			intent.putExtra(EXTRATEST,txv.text.toString())
//			startActivity(intent)
//		})
	}

	override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
		super.onActivityResult(requestCode, resultCode, data)

	}
}

fun TextView.setExtText(){
	this.setText( this.getText().toString() +"Extension On text view")
}
