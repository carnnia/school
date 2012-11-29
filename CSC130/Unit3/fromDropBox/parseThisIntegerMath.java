/*
Name:		Casey Carnnia
Date: 		09.25.2012
Scope:		Problem 3: Write a program that reads in an integer, and breaks it into a sequence of individual digits. For example, the input 16384 is displayed as 
1 6 3 8 4 You may assume that the input has no more than five digits and is not negative.
Algorithm:	1) prompt the user for a 5 digit whole number
			2) capture the number in inputNumber type = int 
			3) declare variables to hold the digits of the input num1, num2, num3, num4, num5 type = int
			4) if inputNumber > 99,999 
					print an error and END
				else
					num1 = inputNumber / 10000
					num2 = (inputNumber % 10000) / 1000
					num3 = (inputNumber % 1000) / 100
					num4 = (inputNumber % 100) / 10
					num5 = (inputNumber % 10) 

			5) print out num1, num2, num3, num4, num5  seperated by tabs
*/
// import needed package
import java.util.Scanner;
// declare class
public class parseThisIntegerMath{
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
		// declare variables to hold the digits of the input
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0; // i didn't want to initilize them but the compiler made me do it !!!
		// evaluate to make sure the input is not larger than 99,999
		if (inputNumber > 99999) {
			System.out.println("You entered:\t" + inputNumber + " which is larger than 99,999. I am not smart enough to pars that yet.");	
		}
		else{
			num1 = inputNumber / 10000;
			num2 = (inputNumber % 10000) / 1000;
			num3 = (inputNumber % 1000) / 100;
			num4 = (inputNumber % 100) / 10;
			num5 = (inputNumber % 10) ;
			// start the output
			System.out.println("You entered:\t" + inputNumber  );
			System.out.println (inputNumber + "contains the following digits: ");
			// print out digits seperated by tab
			System.out.println(num1 + "\t" + num2  + "\t" + num3  + "\t" + num4  + "\t" + num5  + "\t");

		}//if END
	  
  
	}//main END
}//class END

 