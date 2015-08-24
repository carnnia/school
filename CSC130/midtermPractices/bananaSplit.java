import java.util.Scanner;

/*
Name:		Casey Carnnia
Date: 		10.10.2012
Scope:		Write a multi-way if-else statement that evaluates a persons weight on the following criteria:  
			A weight less than 115 pounds, output:  Eat 5 banana splits!  
			A weight between 116 pounds and 130 pounds, output:  Eat a banana split!  
			A weight between 131 pounds and 200 pounds, output: Perfect!  
			A weight greater than 200 pounds, output:  Plenty of banana splits have been consumed!

Solution: 	Import Scanner class from java.util package
			Welcome the user
			prompt for INPUT_WEIGHT type = int
			store the input in constants INPUT_WEIGHT values will not change
			declare a variable msg type = String
			if INPUT_WEIGHT < 115
				msg = "Eat 5 banana splits!"
			else if INPUT_WEIGHT > 115 AND INPUT_WEIGHT <= 130
				msg = "Eat a banana splits!"
			else if INPUT_WEIGHT > 130 AND INPUT_WEIGHT <= 200
				msg = "Perfect!"
			else if INPUT_WEIGHT > 200
				msg = "Plenty of banana splits have been consumed!"
			 
			 
			output: "msg"
			
			 
*/
 
// declare class
public class bananaSplit{	
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("If you tell me your weight I'll tell you how many banana splits you should eat.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for INPUT_WEIGHT
		// store the user input
		System.out.print("Please enter your weight: ");
		final int INPUT_WEIGHT = keyboard.nextInt();
		
		 
		// declare variable for answer
		String msg = "";
		 
		// do the calculation
		if (INPUT_WEIGHT < 115){
			msg = "Eat 5 banana splits!";
		}
		else if (INPUT_WEIGHT > 115 && INPUT_WEIGHT <= 130){
			msg = "Eat a banana splits!";
		}
		else if (INPUT_WEIGHT > 130 && INPUT_WEIGHT <= 200){
			msg = "Perfect!";
		}
		else if (INPUT_WEIGHT > 200){
			msg = "Plenty of banana splits have been consumed!";
		}//if END
		
		//output to the console
		System.out.println(msg);
  
	}//main END
}//class END