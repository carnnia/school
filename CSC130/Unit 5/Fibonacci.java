import java.util.Scanner;
/*
Name:		Casey Carnnia
Date: 		10.22.2012
Scope:		Problem 3: The Fibonacci numbers are defined by the sequence:
		    f1 = 1
		    f2 = 1
		    fn = fn-1 + fn-2.
			Reformulate that as 
			    Fold1 = 1;
			    Fold2=1;
			    Fnew=fold1+fold2;
			After that, discard fold2, which is no longer needed, and set fold2 to fold1, and fold1 to fnew. Repeat an appropriate number of times.
			Implement a program that prompts the user for an integer n and prints the nth Fibonacci number, using the above algorithm.


Solution: 	welcome the user
			instantiate a variable userInput = "" type = int
			prompt the user for input
			store the user input in userInput
			using a loop 	
 				instantiate a counter
 				as long as the counter is less then the userInput
 				foldNew = total of fold1 and fold2
 				fold2 = fold1
 				fold1 = foldNew
 				
 			output using println() foldNew 				
*/
 
// declare class
public class Fibonacci{
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("I can tell you the Nth Fibonacci number.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for input
		// store the user input
		System.out.print("Please enter an integer to test this program:");
		int userInput;
		userInput = keyboard.nextInt();	
		int fold1 = 0;
		int fold2 = 1;
		int foldNew = 0;
		int inputCounter;
	
		for ( inputCounter = 0; inputCounter < userInput; inputCounter ++){
			foldNew = fold1 + fold2;
			fold2 = fold1;
			fold1 = foldNew;		
		}//input loop END 
		
		System.out.println("The" + inputCounter + "th Fibonacci is: " + foldNew);
		 
	}//main END
}//class END

 