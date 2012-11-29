import java.util.Scanner;

/*
Name:		Casey Carnnia
Date: 		10.10.2012
Scope:		A year with 366 days is called a leap year. 
			Leap years are necessary to keep the calendar synchronized with the sun 
			because the earth revolves around the sun once every 365.25 days. 
			Actually, that figure is not entirely precise, and for all dates after 1582 the Gregorian corrections apply. 
			
			Usually years that are divisible by 4 are leap years, for example 1996. 
			
			However, years that are divisible by 100 (for example 1900) are not leap years, 
			but years that are divisible by 400 are leap years (for example 2000). 
			Write a program that asks the user for a year and computes whether that year is a leap year. 
			Use a single if statement and Boolean operators.

Solution: 	welcome the user
			prompt for input of INPUT_YEAR type = int
			store the input in constants INPUT_YEAR
						
			if INPUT_YEAR < 1582
				out put "i can not count that far back. I Can only evaluate years after 1582."
			else if ((INPUT_YEAR % 4 == 0 && INPUT_YEAR % 100 > 0) OR (INPUT_YEAR % 400 == 0)) 
				out put "INPUT_YEAR is a leap year"
			else
				out put "INPUT_YEAR is a leap year
			  
			
*/
 
// declare class
public class newLeapYear{	
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("I can tell you if it is a leap year or not.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for INPUT_YEAR
		// store the user input
		System.out.print("Please enter a year after 1582: ");
		final int INPUT_YEAR = keyboard.nextInt();
		 
		// do the calculation

		if (INPUT_YEAR < 1582){
			System.out.println("I can not count that far back. I Can only evaluate years after 1582.");
		}
		else if ((INPUT_YEAR % 4 == 0 && INPUT_YEAR % 100 > 0) || (INPUT_YEAR % 400 == 0)) {
			System.out.println(INPUT_YEAR + " is a leap year.");
		}
		else{
			System.out.println(INPUT_YEAR + " is NOT a leap year.");
		}// if END
  
	}//main END
}//class END