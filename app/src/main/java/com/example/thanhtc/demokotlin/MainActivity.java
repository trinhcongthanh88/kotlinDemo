package com.example.thanhtc.demokotlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView a = (TextView) findViewById(R.id.tvText);
		Intent i = getIntent();
		String b = i.getStringExtra("user_id");
		a.setText(b);
	}
}