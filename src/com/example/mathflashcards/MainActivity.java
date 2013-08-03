package com.example.mathflashcards;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void basicMath(View view)
	{
		Intent intent=new Intent(this, BasicMath.class);
		startActivity(intent);
	}
	
	public void multipleDigits(View view)
	{
		Intent intent=new Intent(this, MultipleDigits.class);
		startActivity(intent);
	}
	
	
	
	public void factoring(View view)
	{
		Intent intent=new Intent(this, Factoring.class);
		startActivity(intent);
	}
	
	
}