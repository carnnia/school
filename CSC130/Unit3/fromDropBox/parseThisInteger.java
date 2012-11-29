/*
Name:		Casey Carnnia
Date: 		09.24.2012
Scope:		Problem 3: Write a program that reads in an integer, and breaks it into a sequence of individual digits. For example, the input 16384 is displayed as 
1 6 3 8 4 You may assume that the input has no more than five digits and is not negative.
Algorithm:	1) prompt the user for a 5 digit whole number
			2) capture the number in inputNumber type = int "we could do string too but this way we allow for error to be shown when the user types in none numeric data"
			3) cast the integer as a string so we can loop throught it  stringOfInputNumber type = String
			4) get the lenght of stringOfInputNumber  length type = int
			5) initilize a counter i type = int
			6) as long as counter i < lenght
				output value of " + i + "th digit is ==> \t" + stringOfInputNumber.charAt(i) **this wouldn't work if we wanted to show the value of the Ones column first**
*/
// import needed package
import java.util.Scanner;
// declare class
public class parseThisInteger{
	//declare the main method
	public static void main(String[] args) {
		// welcome the user
		System.out.println("I can print the indevidual numbers in a 5 digit integer. ");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for a 5 digit number
		System.out.print("Please enter a whole number between 1 and 99,999 : ");
		// store the user input
		int inputNumber = keyboard.nextInt();
		// cast the integer as a string so we can loop throught it
		String stringOfInputNumber = String.valueOf(inputNumber); 
		// start the output
		System.out.println("You entered:\t" + inputNumber + " which is " + stringOfInputNumber.length() + " digits long.");
		System.out.println (inputNumber + "contains the following digits: ");
		System.out.println("----------------------------------------------------------------------");
		// we need an integer variable to hold the lenght of the number 
		int length = stringOfInputNumber.length(); 

		for(int i = 0 ; i < length ; i++ ){
         System.out.print("value of " + i + "th digit is ==> \t" + stringOfInputNumber.charAt(i) + "\n" );
         System.out.println("----------------------------------------------------------------------");
      	}// for loop END

      	// looping allows me to open the app to larger number (beyond 5 digits)
  
	}//main END
}//class END

 