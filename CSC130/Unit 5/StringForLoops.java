import java.util.Scanner;
/*
Name:		Casey Carnnia
Date: 		10.22.2012
Scope:		Problem 2: Write a program that reads a word and prints each character of the word on a separate line.
			For example, if the user provides the input "Harry", the program prints:
			H
			a
			r
			r
			y


Solution: 	welcome the user
			instantiate a variable userInput = "" type = String
			prompt the user for input
			store the user input in userInput
			using a loop 	
 				instantiate a counter
 				as long as the counter is less then the length of userInput
 				output using println() this index of userInput 				
*/
 
// declare class
public class StringForLoops{
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("I loop throughn the charecters of an string. ");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for input
		// store the user input
		System.out.print("Please enter a word or a name:");
		String userInput;
		userInput = keyboard.next();	
		for (int inputCounter = 0; inputCounter < userInput.length(); inputCounter ++){
			System.out.println(userInput.charAt(inputCounter));		
		}//input loop END 
		
		 
	}//main END
}//class END

 