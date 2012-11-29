import java.util.Scanner;

/*
Name:		Casey Carnnia
Date: 		10.10.2012
Scope:		Write a complete Java console application that prompts the user for two numbers, 
			multiplies the numbers, and then displays the result to the user.  

Solution: 	Import Scanner class from java.util package
			Welcome the user
			prompt for input one INPUT_NUM1 type = int
			prompt for input one INPUT_NUM2 type = int
			store the input in constants INPUT_NUM1 INPUT_NUM2 these values will not change
			declare variable to hold the multiplication outputAnswer type = int
			outputAnswer = INPUT_NUM1 * INPUT_NUM2
			output: "INPUT_NUM1 times INPUT_NUM2 equals outputAnswer"
			
			 
*/
 
// declare class
public class multiplyNum1Num2{	
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("I can multiply 2 numbers for you.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for INPUT_NUM1
		// store the user input
		System.out.print("Please enter a number: ");
		final int INPUT_NUM1 = keyboard.nextInt();
		
		// prompt the user for INPUT_NUM2
		// store the user input
		System.out.print("Please enter another number: ");
		final int INPUT_NUM2 = keyboard.nextInt();
		
		// declare variable for answer
		int outputAnswer = 0;
		 
		// do the calculation
		outputAnswer = INPUT_NUM1 * INPUT_NUM2;
		
		//output to the console
		System.out.println(INPUT_NUM1 + " times " + INPUT_NUM2 + " equals " + outputAnswer);
  
	}//main END
}//class END