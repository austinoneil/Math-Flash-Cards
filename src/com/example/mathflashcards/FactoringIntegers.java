package com.example.mathflashcards;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class FactoringIntegers extends Activity {

	static int number;
	Random r;
	boolean answerDisplayed;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_factoring_integers);
		answerDisplayed=false;
		r=new Random();
		number=2+r.nextInt(1998);
		TextView n=(TextView)this.findViewById(R.id.number);
		n.setText(Integer.toString(number));
		TextView a=(TextView)this.findViewById(R.id.factored);
		a.setText("");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_factoring_integers, menu);
		return true;
	}
	
	public void buttonPressed(View view)
	{
		if(answerDisplayed==false)
		{
			TextView a=(TextView)this.findViewById(R.id.factored);
			String s=primeFact(number);
			a.setText(s);
			Button b=(Button)this.findViewById(R.id.button1);
			b.setText("Answer");
		}
		else
		{
			number=2+r.nextInt(1998);
			TextView n=(TextView)this.findViewById(R.id.number);
			n.setText(Integer.toString(number));
			TextView a=(TextView)this.findViewById(R.id.factored);
			a.setText("");
			Button b=(Button)this.findViewById(R.id.button1);
			b.setText("Next");
		}
		answerDisplayed=!answerDisplayed;	
	}
	
	public String primeFact(int x)
	{
		int[] a=new int[x];
		int count=2;
		while(count<=x)
		{
			if(x%count==0)
			{
				x=x/count;
				a[count-1]++;
				count=2;
			}
			else
			{
				count++;
			}
		}
		String output="";
		for(int i=2; i<=a.length; i++)
		{
			if(a[i-1]!=0)
			{
				if(output.length()!=0)
				{
					output=output+" x "+(i);
				}
				else
				{
					output=output+(i);
				}
				if(a[i-1]!=1)
				{
					output=output+"^"+a[i-1];
				}
			}
		}
		return output;
	}
}
