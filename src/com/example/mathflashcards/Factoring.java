package com.example.mathflashcards;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;

public class Factoring extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_factoring);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_factoring, menu);
		return true;
	}
	
	public void primeOrComposite(View view)
	{
		Intent intent=new Intent(this, PrimeOrComposite.class);
		startActivity(intent);
	}
	
	public void factoringIntegers(View view)
	{
		Intent intent=new Intent(this, FactoringIntegers.class);
		startActivity(intent);
	}
}
