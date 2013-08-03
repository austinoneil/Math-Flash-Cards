package com.example.mathflashcards;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MultipleDigitSubtraction extends Activity 
{
	static int firstNum;
	static int secondNum;
	Random r;
	boolean answerDisplayed;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_multiple_digit_subtraction);
		r=new Random();
		firstNum=10+r.nextInt(90);
		secondNum=10+r.nextInt(90);
		answerDisplayed=false;
		if(secondNum>firstNum)
		{
			int dummy=secondNum;
			secondNum=firstNum;
			firstNum=dummy;
		}
		displayNums();
		TextView cto=(TextView)this.findViewById(R.id.carryTheOne);
		cto.setText("");
		TextView onesDigit=(TextView)this.findViewById(R.id.SolutionC);
		onesDigit.setText("");
		TextView tensDigit=(TextView)this.findViewById(R.id.SolutionB);
		tensDigit.setText("");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_multiple_digit_subtraction,
				menu);
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
			if(secondNum>firstNum)
			{
				int dummy=secondNum;
				secondNum=firstNum;
				firstNum=dummy;
			}
			displayNums();
			Button button=(Button)this.findViewById(R.id.button1);
			button.setText("Solution");
		}
		answerDisplayed=!answerDisplayed;
	}

	public void displayNums()
	{
		String A=Integer.toString(firstNum/10);
		String B=Integer.toString(firstNum%10);
		
		TextView onesDigit=(TextView)this.findViewById(R.id.numberA);
		onesDigit.setText(B);
		TextView tensDigit=(TextView)this.findViewById(R.id.numberB);
		tensDigit.setText(A);
		
		String C=Integer.toString(secondNum%10);
		String D=Integer.toString(secondNum/10);
		
		TextView onesDigit2=(TextView)this.findViewById(R.id.numberC);
		onesDigit2.setText(C);
		TextView tensDigit2=(TextView)this.findViewById(R.id.numberD);
		tensDigit2.setText(D);
		
		onesDigit=(TextView)this.findViewById(R.id.SolutionC);
		onesDigit.setText("");
		tensDigit=(TextView)this.findViewById(R.id.SolutionB);
		tensDigit.setText("");
	}
	
	public void displayAnswer()
	{
		int solution=firstNum-secondNum;
		String C=Integer.toString(solution%10);
		String B=Integer.toString((solution/10)%10);
		TextView onesDigit=(TextView)this.findViewById(R.id.SolutionC);
		onesDigit.setText(C);
		TextView tensDigit=(TextView)this.findViewById(R.id.SolutionB);
		tensDigit.setText(B);
	}
}
