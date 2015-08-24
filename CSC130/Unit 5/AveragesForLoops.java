import java.util.Scanner;
/*
Name:		Casey Carnnia
Date: 		10.22.2012
Scope:		Problem 1: Write a program that reads a set of floating-point values. Ask the user to enter the values, then print:
		    The average of the values
		    The smallest of the values
		    The largest of the values
		    The range, that is the difference between the smallest and the largest Of course, you may only prompt for the values once.


Solution: 	prompt the user for input. 
 			**Important**
 				the problem says a set of numbers so we don't need to program for a variable set. we can say a set of 5, or 10.
			Instantiate an array with a length of 5 
			using a loop
				Instantiate an counter 
 				as long as that counter is smaller then 5
 				read the user input into next index of the array
 				
 			instantiate a variable sum = 0 type = double
			instantiate a variable averageOutput = 0 type = double
 			using a loop 	
 				instantiate a counter
 				as long as the counter is less then the length of the array
 				add value of this index of array to sum
 				averageOutput is sum divided by length of array 
 			output the averageOutput

 			instantiate a variable maxValue = 0 type = double
 			using a loop
 				instantiate a counter 
 				as long as the counter is less then array length
 				if this index of array is greater then maxValue 
 					set maxValue to this instance of array
 			output the maxValue
 					
 			
 			instantiate a variable minValue = 0 type = double
 			using a loop
 				instantiate a counter 
 				as long as the counter is less then array length
 				if this index of array is less then minValue 
 					set minValue to this instance of array
 			output the minValue
 			
 			out put the range as maxValue - minValue
 			
 			 
				
*/
 
// declare class
public class AveragesForLoops{
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("I can calculate the average of a bunch of numbers and also tel you the larges and the smalles of the numbers and their range.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for input
		// store the user input
		System.out.print("Please enter a set of 5 numbers seperated by blank space. It is OK to use fractions:");
		double[] inputArray;
		inputArray = new double[5];
		
		for (int inputCounter = 0; inputCounter < 5; inputCounter ++){
			inputArray[inputCounter] =  keyboard.nextDouble();		
		}//input loop END 
		
		double sum = 0;
		for (int averageCounter = 0; averageCounter < inputArray.length; averageCounter ++){
			sum = sum + inputArray[averageCounter];	
		}//average loop END
		double averageOutput = sum / inputArray.length; 
		System.out.printf("The average if the numbers you entered is: %10.2f", averageOutput);
		System.out.print("\n");
		
		double maxValue = inputArray[0];
		for (int maxCounter = 0; maxCounter < inputArray.length; maxCounter ++){
			if (inputArray[maxCounter] > maxValue){
				maxValue = inputArray[maxCounter];
			}//if END	
		}//MAX loop END
		System.out.printf("The largest value you entered is: %10.2f", maxValue);
		System.out.print("\n");
		
		double minValue = inputArray[0];
		for (int minCounter = 0; minCounter < inputArray.length; minCounter ++){
			if (inputArray[minCounter] < minValue){
				minValue = inputArray[minCounter];
			}//if END	
		}//MIN loop END
		System.out.printf("The smallest value you entered is: %10.2f",  minValue);
		System.out.print("\n");
		
		System.out.printf("The range of values you entered is: %10.2f", (maxValue - minValue));
		System.out.print("\n");
		  
		  
  
	}//main END
}//class END

 