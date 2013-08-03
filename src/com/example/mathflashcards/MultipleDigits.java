package com.example.mathflashcards;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;

public class MultipleDigits extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_multiple_digits);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_multiple_digits, menu);
		return true;
	}
	
	public void multipleDigitAddition(View view)
	{
		Intent intent=new Intent(this, MultipleDigitAddition.class);
		startActivity(intent);
	}
	
	public void multipleDigitSubtraction(View view)
	{
		Intent intent=new Intent(this, MultipleDigitSubtraction.class);
		startActivity(intent);
	}
	
	public void multipleDigitMultiplication(View view)
	{
		Intent intent=new Intent(this, MultipleDigitMultiplication.class);
		startActivity(intent);
	}
	
	public void multipleDigitDivision(View view)
	{
		Intent intent=new Intent(this, MultipleDigitDivision.class);
		startActivity(intent);
	}
}
