/*
Name:		Casey Carnnia
Date: 		09.24.2012
Scope:		Problem 1: Write a program that prompts the user for a measurement in meters, and then converts it in to miles, feet, and inches.
Algorithm:	1) we also need the math libraray for this problem
			2) prompt the user for a input allow fractions
			3) capture the input in meters type = double
			4) declare constants
				METER_TO_MILE = 0.000621371; 
				METER_TO_FOOT = 3.28084; 	
				METER_TO_INCH = 39.3701; 
			5) initilize calculation variables miles, feet, inches type = double
			6) initilize output variables roundedMiles, roundedFeet, roundedInches type = double 
			7) set the output variables to the rounded value of calculation variables **there has to be a better way to d this**
			8) output: meters + " meters is equal to ==>\t" + miles + " miles or rounded to ==>\t" + roundedMiles + " miles."
			9) output: meters + " meters is equal to ==>\t" + feet + " feet or rounded to ==>\t" + roundedFeet + " feet."
			10)output: meters + " meters is equal to ==>\t" + inches + " inches or rounded to ==>\t" + roundedInches + " inches."

*/
// import needed package
import java.util.Scanner; 
import static java.lang.Math.*;
// declare class
public class lengthCalculator{
	//declare the main method
	public static void main(String[] args) {
		// welcome the user
		System.out.println("I can convert from meters!");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for number ** lenght in meters **
		System.out.print("Please enter length in meters, you can use fractions: ");
		// store the user input
		double meters = keyboard.nextDouble();
		// declare a constant for meter to mile
		double METER_TO_MILE = 0.000621371; 
		// declare a constant for meter to foot
		double METER_TO_FOOT = 3.28084; 
		// declare a constant for meter to inch
		double METER_TO_INCH = 39.3701; 
		// do the calculation
		double miles  = meters * METER_TO_MILE;
		double roundedMiles = (int)round(miles) ;

		double feet   = meters * METER_TO_FOOT;
		double roundedFeet = (int)round(feet) ;

		double inches = meters * METER_TO_INCH;
		double roundedInches = (int)round(inches) ;
		 

		// output meter to mile
		System.out.println(meters + " meters is equal to ==>\t" + miles + " miles or rounded to ==>\t" + roundedMiles + " miles."); 
		System.out.println("----------------------------------------------------------------------");
		// out put meter to foot
		System.out.println(meters + " meters is equal to ==>\t" + feet + " feet or rounded to ==>\t" + roundedFeet + " feet."); 
		System.out.println("----------------------------------------------------------------------");
		//out put meter to inch
		System.out.println(meters + " meters is equal to ==>\t" + inches + " inches or rounded to ==>\t" + roundedInches + " inches."); 
		System.out.println("----------------------------------------------------------------------");
  
	}//main END
}//class END

 