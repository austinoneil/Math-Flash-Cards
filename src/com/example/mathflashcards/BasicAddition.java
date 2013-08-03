package com.example.mathflashcards;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import java.util.Random;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class BasicAddition extends Activity 
{
	int a;
	int b;
	boolean answerShowing;
	Random r=new Random();
	String firstText;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_addition);
		answerShowing=false;
		a=r.nextInt(10);
		b=r.nextInt(10);
		firstText=a+" + "+b+" = ";
		TextView first=(TextView)this.findViewById(R.id.Equation);
		first.setText(firstText);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_basic_addition, menu);
		return true;
	}
	
	public void buttonPressed(View view)
	{
		if(answerShowing==false)
		{
			TextView second=(TextView)this.findViewById(R.id.Solution);
			second.setText(Integer.toString(a+b));
			Button button=(Button)this.findViewById(R.id.button1);
			button.setText("Next problem");
		}
		else
		{
			a=r.nextInt(10);
			b=r.nextInt(10);
			firstText=a+" + "+b+" = ";
			TextView first=(TextView)this.findViewById(R.id.Equation);
			first.setText(firstText);
			TextView second=(TextView)this.findViewById(R.id.Solution);
			second.setText(" ");
			Button button=(Button)this.findViewById(R.id.button1);
			button.setText("Solution");
		}
		answerShowing=!answerShowing;
	}
}