/*
Name:	Casey Carnnia
Date: 	09.20.2012
Scope:	Read three integer numbers from the user and calculate the average. Display the initial numbers, as well as the average in a table like output.
*/
// import needed package
import java.util.Scanner;
// declare class
public class average{
	//declare the main method
	public static void main(String[] args) {
		// welcome the user
		System.out.println("I can calculate the average of 3 numbers for you.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for input
		System.out.println("Please enter 3 integers for me to use.");
		// read the input into variables
		int number1 = keyboard.nextInt();
		int number2 = keyboard.nextInt();
		int number3 = keyboard.nextInt();
		// start the output
		System.out.println("******************************************");
		System.out.println("Value 1: \t" + " |\t " + number1 + " \t" + " |\t " );
		System.out.println("******************************************");
		System.out.println("Value 2: \t" + " |\t " + number2 + " \t" + " |\t " );
		System.out.println("******************************************");
		System.out.println("Value 3: \t" + " |\t " + number3 + " \t" + " |\t " );
		System.out.println("******************************************");
		System.out.println("AVERAGE: \t " + ((number1 + number2 + number3) / 3.0 ) );
		System.out.println("******************************************");
	}
}

 
