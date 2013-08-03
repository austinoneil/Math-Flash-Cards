 package com.example.mathflashcards;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class PrimeOrComposite extends Activity 
{

	static int number;
	Random r;
	boolean answerDisplayed;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prime_or_composite);
		answerDisplayed=false;
		r=new Random();
		number=2+r.nextInt(1998);
		TextView n=(TextView)this.findViewById(R.id.number);
		n.setText(Integer.toString(number));
		TextView a=(TextView)this.findViewById(R.id.primeOrComposite);
		a.setText("");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_prime_or_composite, menu);
		return true;
	}

	public void buttonPressed(View view)
	{
		if(answerDisplayed==false)
		{
			TextView a=(TextView)this.findViewById(R.id.primeOrComposite);
			String s;
			if(isPrime(number))
			{
				s=number+" is prime.";
			}
			else
			{
				s=number+" is composite.";
			}
			a.setText(s);
			Button b=(Button)this.findViewById(R.id.button1);
			b.setText("Answer");
		}
		else
		{
			number=2+r.nextInt(1998);
			TextView n=(TextView)this.findViewById(R.id.number);
			n.setText(Integer.toString(number));
			TextView a=(TextView)this.findViewById(R.id.primeOrComposite);
			a.setText("");
			Button b=(Button)this.findViewById(R.id.button1);
			b.setText("Next");
		}
		answerDisplayed=!answerDisplayed;	
	}
	
	public boolean isPrime(int x)
	{
		if(x%2==0 && x!=2)
		{
			return false;
		}
		int a=(int)Math.sqrt(x);
		for(int i=3; i<=a; i+=2)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}
}