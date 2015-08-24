/*
Name:  Casey Carnnia
Date:  12.13.2012
Scope: Problem 1:
Define a class called Counter. 
An object of this class is used to count things 
so it records a count that is a non-negative whole number. 
Include methods to set the counter to 0, 
to increase the counter by 1, 
and to decrease the counter by 1. 
Be sure that no method allows the value of the counter to become negative. 
Also include an accessor method that returns the current count value, 
as well as a method that displays the count on the screen. 
Do not define an input method. 
The only method that can set the counter is the one that sets it to zero. 
Write a program to test your class definition. (Hint: you need only one instance variable). 
counterDemo

*/

public class Counter
{
	//instance variables 
	private int counterVal = 0;

  /**
  Sets the counter to zero
  */
	public void resetCounter()
	{
		counterVal = 0;
	}
  /**
  Increase the counter by one
  */
	public void increaseCounter()
	{
		counterVal = counterVal + 1;
	}
  /**
  Decrease counter by one 
  But not bellow 0
  */
	public void decreaseCounter()
	{
		if (counterVal > 0)
		{
			counterVal = counterVal - 1;
		}
		else
		{
			System.out.println("Counter is zero. A negative counter is not allowed.");
		}
		
	}
	/**
	Return the current counter value
	*/
	public int getCounterValue()
	{
		return counterVal;
	}
	/**
	Print the current value to the screen
	*/
	public void tostringCounter()
	{
		System.out.println("Currently the counter reads: " + counterVal);
	}

 
 }//class END