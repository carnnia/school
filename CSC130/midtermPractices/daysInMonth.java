/*
Name:		Casey Carnnia
Date: 		10.09.2012
Scope:		Write a program that asks the user to enter a month 
			(1 for January, 2 for February, and so on) and then 
			prints the number of days in the month. 
			For February, print “28 or 29 days”. 
				Enter a month: 5
				30 days
			Do not use a separate if/else branch for each month. Use Boolean operators.


Algorithm:	 prompt the user for a month number between 1 and 12
			 capture the number in monthInput type = int  
			 use a switch to evaluate the input
			print out "monthInput has n number of days"
*/
// import needed package
import java.util.Scanner;
// declare class
public class daysInMonth{
	//declare the main method
	public static void main(String[] args) {
		// welcome the user
		System.out.println("I can tell you how many days are in  month.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for a number for month
		System.out.print("Please enter a number between 1 to 12 representing a month in the year: ");
		// store the user input
		int monthInput = keyboard.nextInt();
		// implement the switch
		switch (monthInput)
		{
		case 1:
			System.out.println("You entered " + monthInput + " there are 31 days in Januaray. ");
			break;
		case 2:
			System.out.println("You entered " + monthInput + " there are 28 days in Febuarary. ");
			break;
		case 3:
			System.out.println("You entered " + monthInput + " there are 31 days in March. ");
			break;
		case 4:
			System.out.println("You entered " + monthInput + " there are 30 days in April. ");
			break;
		case 5:
			System.out.println("You entered " + monthInput + " there are 31 days in May. ");
			break;
		case 6:
			System.out.println("You entered " + monthInput + " there are 30 days in June. ");
			break;
		case 7:
			System.out.println("You entered " + monthInput + " there are 31 days in July. ");
			break;
		case 8:
			System.out.println("You entered " + monthInput + " there are 31 days in Auguest. ");
			break;
		case 9:
			System.out.println("You entered " + monthInput + " there are 30 days in September. ");
			break;
		case 10:
			System.out.println("You entered " + monthInput + " there are 31 days in October. ");
			break;
		case 11:
			System.out.println("You entered " + monthInput + " there are 30 days in November. ");
			break;
		case 12:
			System.out.println("You entered " + monthInput + " there are 31 days in December. ");
			break;
		default:
			System.out.println("You entered " + monthInput + " which is invalid. ");
			break;
		}// switch END
		
			 
	  
  
	}//main END
}//class END

 