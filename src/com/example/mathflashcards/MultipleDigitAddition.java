package com.example.mathflashcards;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MultipleDigitAddition extends Activity 
{
	static int firstNum;
	static int secondNum;
	Random r;
	boolean answerDisplayed;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_multiple_digit_addition);
		r=new Random();
		firstNum=10+r.nextInt(90);
		secondNum=10+r.nextInt(90);
		answerDisplayed=false;
		displayNums();
		TextView cto=(TextView)this.findViewById(R.id.carryTheOne);
		cto.setText("");
		TextView onesDigit=(TextView)this.findViewById(R.id.SolutionA);
		onesDigit.setText("");
		TextView tensDigit=(TextView)this.findViewById(R.id.SolutionB);
		tensDigit.setText("");
		TextView hundredsDigit=(TextView)this.findViewById(R.id.SolutionC);
		hundredsDigit.setText("");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater()
				.inflate(R.menu.activity_multiple_digit_addition, menu);
		return true;
	}

	public void buttonPressed(View view)
	{
		if(!answerDisplayed)
		{
			displayAnswer();
			Button b=(Button)this.findViewById(R.id.button1);
			b.setText("Next problem");
		}
		else
		{
			r=new Random();
			firstNum=10+r.nextInt(90);
			secondNum=10+r.nextInt(90);
			displayNums();
			TextView cto=(TextView)this.findViewById(R.id.carryTheOne);
			cto.setText("");
			TextView onesDigit=(TextView)this.findViewById(R.id.SolutionC);
			onesDigit.setText("");
			TextView tensDigit=(TextView)this.findViewById(R.id.SolutionB);
			tensDigit.setText("");
			TextView hundredsDigit=(TextView)this.findViewById(R.id.SolutionA);
			hundredsDigit.setText("");
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
	}
	
	public void displayAnswer()
	{
		int solution=firstNum+secondNum;
		String C=Integer.toString(solution%10);
		String B=Integer.toString((solution/10)%10);
		String A;
		if(solution>=100)
		{
			A="1";
		}
		else
		{
			A="";
		}
		TextView onesDigit=(TextView)this.findViewById(R.id.SolutionC);
		onesDigit.setText(C);
		TextView tensDigit=(TextView)this.findViewById(R.id.SolutionB);
		tensDigit.setText(B);
		TextView hundredsDigit=(TextView)this.findViewById(R.id.SolutionA);
		hundredsDigit.setText(A);
		if(firstNum%10+secondNum%10>9)
		{
			TextView cto=(TextView)this.findViewById(R.id.carryTheOne);
			cto.setText("1");
		}
		else
		{
			TextView cto=(TextView)this.findViewById(R.id.carryTheOne);
			cto.setText("");
		}
	}
}
