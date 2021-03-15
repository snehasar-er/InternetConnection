package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {


	RadioButton android, java, angular, python;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		android = (RadioButton)findViewById(R.id.rdbAndroid);
		angular = (RadioButton)findViewById(R.id.rdbAngular);
		java = (RadioButton)findViewById(R.id.rdbJava);
		python = (RadioButton)findViewById(R.id.rdbPython);
		Button btn = (Button)findViewById(R.id.getBtn);
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String result = "Selected Course: ";
				result+= (android.isChecked())?"Android":(angular.isChecked())?"AngularJS":(java.isChecked())?"Java":(python.isChecked())?"Python":"";
				Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
			}
		});
	}
	public void onRadioButtonClicked(View view) {
		boolean checked = ((RadioButton) view).isChecked();
		String str="";
		// Check which radio button was clicked
		switch(view.getId()) {
			case R.id.rdbAndroid:
				if(checked)
					str = "Android Selected";
				break;
			case R.id.rdbAngular:
				if(checked)
					str = "AngularJS Selected";
				break;
			case R.id.rdbJava:
				if(checked)
					str = "Java Selected";
				break;
			case R.id.rdbPython:
				if(checked)
					str = "Python Selected";
				break;
		}
		Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
	}
	}


