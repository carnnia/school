/*
Name:		Casey Carnnia
Date: 		09.28.2012
Scope:		One day soon, the US government will finally decide to do away with pennies, as they currently cost more than a penny to produce. 
			Complete the program below so that it prompts the user for a price in dollars and cents, determines the cents portion of the price 
			to the nearest dime, and prints the revised price.

			For example, if a price was $32.56, the revised price would be $32.60. 
			However, if a price was $23.34, the revised price would be $23.30.

			Complete the following code:
*/
	    
	 
// import needed package
import java.util.Scanner;
// declare class
public class NearestDime{
	//declare the main method
	public static void main(String[] args) {
		// welcome the user
		System.out.println("I can round the price of something to the neaerest dime. ");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for a price
		System.out.print("Please enter the price: ");
		// store the user input
		double price = keyboard.nextDouble(); 
		int pennies = (int)(price * 100);     
		// Determine dollar and cents worth of pennies     
		int cents = pennies % 100;    
		int dollars = pennies / 100;     
		// Your work here          
		// Round cents to nearest dime    
		float  dimes = Math.round(cents * 0.1);  
		float dimesAsFraction = dimes / 10;  
		float revised = dollars + dimesAsFraction; 

		// int pennies = (int) Math.round(price * 100);  
		//int dimesRounded = (int) Math.round(cents * 0.1); 
		//float dimesAsFraction = dimesRounded / 10;

		// Your work here          
		// Print revised price    
		//double revised = dollars + dimes * 0.1;    
		System.out.printf("%.2f\n", revised);  
		//System.out.println("price "  + price + " pennies " + pennies + " cents " + cents + " dollars " + dollars + " dimes 	" + dimes + " dimesAsFraction " + dimesAsFraction + " revised " + revised); 
  
	}//main END
}//class END

 