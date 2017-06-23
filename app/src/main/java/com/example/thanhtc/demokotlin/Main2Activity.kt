package com.example.thanhtc.demokotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

 const val EXTRATEST = "user_id"
class Main2Activity : AppCompatActivity(), OnClickListener {

	override fun onClick(v: View?) {
		var b:Button = v as Button
		if (b === btn){
			txv.setExtText()
		}
		if (b === btn2){
//			txv.setExtText()
//			val intent:Intent = Intent(this,SecondActivity::class.java)
//			intent.putExtra(EXTRATEST,txv.text.toString())
//			startActivity(intent)
		var a =  aaaa()
		a.p()
		}
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main2)
		txv.text = "Hello World"
		btn.text = "Click"
		btn2.text = "Click2"
//		btn.setOnClickListener(View.OnClickListener {
//			txv.setExtText()
			val intent:Intent = Intent(this,MainActivity::class.java)
//			intent.putExtra(EXTRATEST,txv.text.toString())
//			startActivity(intent)

//		})
		btn.setOnClickListener(this)
		btn2.setOnClickListener(this)
//		btn.setOnClickListener({ v ->
//			var b:Button = v as Button
//			if (b === btn){
//				txv.setExtText()
//			}
////			txv.setExtText()
////			val intent:Intent = Intent(this,SecondActivity::class.java)
////			intent.putExtra(EXTRATEST,txv.text.toString())
////			startActivity(intent)
//			var a =  aaaa()
//			a.p()
//		})
	}

	override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
		super.onActivityResult(requestCode, resultCode, data)

	}
}

fun TextView.setExtText(){
	this.text = this.text.toString() +"Extension On text view"
}

fun List<String>.join(separator:String) : String{
	var s:String = ""
	this.forEach {
		s += separator + it
	}
	s = s.replaceFirst(separator,"")
	return s
}

 class aaaa {
	fun isOdd(x:Int) = x%2 != 0
	fun p(){
		val number = listOf(1,2,3,4)
//			print(number.filter { isOdd(it) })
		Log.d("Thanh",number.filter (aaaa()::isOdd).toString())
		val number1 = listOf("1","1","1","1")
//			print(number.filter { isOdd(it) })
		Log.d("Thanh",number1.join("+"))
	}
}

