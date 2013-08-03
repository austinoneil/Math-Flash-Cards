package com.example.mathflashcards;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MultipleDigitMultiplication extends Activity
{
	static int firstNum;
	static int secondNum;
	Random r;
	boolean answerDisplayed;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_multiple_digit_multiplication);
		r=new Random();
		firstNum=10+r.nextInt(90);
		secondNum=10+r.nextInt(90);
		answerDisplayed=false;
		displayNums();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(
				R.menu.activity_multiple_digit_multiplication, menu);
		return true;
	}
	
	public void buttonPressed(View view)
	{
		if(!answerDisplayed)
		{
			displayAnswer();
			Button button=(Button)this.findViewById(R.id.button1);
			button.setText("Next problem");
		}
		else
		{
			r=new Random();
			firstNum=10+r.nextInt(90);
			secondNum=10+r.nextInt(90);
			displayNums();
			Button button=(Button)this.findViewById(R.id.button1);
			button.setText("Solution");
		}
		answerDisplayed=!answerDisplayed;
	}
	
	public void displayNums()
	{
		String A=Integer.toString(firstNum);
		String B=Integer.toString(secondNum);
		
		TextView firstNumber=(TextView)this.findViewById(R.id.firstNum);
		firstNumber.setText(A);
		
		TextView secondNumber=(TextView)this.findViewById(R.id.seconNum);
		secondNumber.setText(B);

		TextView firstNumSolution=(TextView)this.findViewById(R.id.firstSolutionNum);
		firstNumSolution.setText("");
		
		TextView secondNumSolution=(TextView)this.findViewById(R.id.secondSolutionNum);
		secondNumSolution.setText("");
		
		TextView zeroPlaceholder=(TextView)this.findViewById(R.id.zeroPlaceholder);
		zeroPlaceholder.setText("");
		
		TextView lastDashes=(TextView)this.findViewById(R.id.textView3);
		lastDashes.setText("");
		
		TextView soln=(TextView)this.findViewById(R.id.solution);
		soln.setText("");
	}
	
	public void displayAnswer()
	{
		int a=secondNum%10;
		int b=secondNum/10;
		
		// First string
		String A=Integer.toString(a*firstNum);
		
		// Second string
		String B=Integer.toString(b*firstNum);
		
		// Solution
		String C=Integer.toString(firstNum*secondNum);
		
		TextView firstNumSolution=(TextView)this.findViewById(R.id.firstSolutionNum);
		firstNumSolution.setText(A);
		
		TextView secondNumSolution=(TextView)this.findViewById(R.id.secondSolutionNum);
		secondNumSolution.setText(B);
		
		TextView zeroPlaceholder=(TextView)this.findViewById(R.id.zeroPlaceholder);
		zeroPlaceholder.setText("x");
		
		TextView lastDashes=(TextView)this.findViewById(R.id.textView3);
		lastDashes.setText("----------");
		
		TextView soln=(TextView)this.findViewById(R.id.solution);
		soln.setText(C);
	}
	
}
