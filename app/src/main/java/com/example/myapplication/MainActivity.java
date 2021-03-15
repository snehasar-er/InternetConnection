package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {


	CheckBox android, java, angular, python;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		android = (CheckBox)findViewById(R.id.chkAndroid);
		angular = (CheckBox)findViewById(R.id.chkAngular);
		java = (CheckBox)findViewById(R.id.chkJava);
		python = (CheckBox)findViewById(R.id.chkPython);
		Button btn = (Button)findViewById(R.id.getBtn);
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String result = "Selected Courses";
				if(android.isChecked()){
					result += "\nAndroid";
				}
				if(angular.isChecked()){
					result += "\nAngularJS";
				}
				if(java.isChecked()){
					result += "\nJava";
				}
				if(python.isChecked()){
					result += "\nPython";
				}
				Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
			}
		});
	}
	public void onCheckboxClicked(View view) {
		boolean checked = ((CheckBox) view).isChecked();
		String str="";
		// Check which checkbox was clicked
		switch(view.getId()) {
			case R.id.chkAndroid:
				str = checked?"Android Selected":"Android Deselected";
				break;
			case R.id.chkAngular:
				str = checked?"AngularJS Selected":"AngularJS Deselected";
				break;
			case R.id.chkJava:
				str = checked?"Java Selected":"Java Deselected";
				break;
			case R.id.chkPython:
				str = checked?"Python Selected":"Python Deselected";
				break;
		}
		Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
	}
	}


