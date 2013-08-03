package com.example.mathflashcards;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;

public class BasicMath extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_math);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_basic_math, menu);
		return true;
	}

	public void basicAddition(View view)
	{
		Intent intent=new Intent(this, BasicAddition.class);
		startActivity(intent);
	}
	
	public void basicSubtraction(View view)
	{
		Intent intent=new Intent(this, BasicSubtraction.class);
		startActivity(intent);
	}
	
	public void basicMultiplication(View view)
	{
		Intent intent=new Intent(this, BasicMultiplication.class);
		startActivity(intent);
	}
	
	public void basicDivision(View view)
	{
		Intent intent=new Intent(this, BasicDivision.class);
		startActivity(intent);
	}
}
