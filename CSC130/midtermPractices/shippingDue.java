import java.util.Scanner;

/*
Name:		Casey Carnnia
Date: 		10.10.2012
Scope:		Write an if-else statement to compute the amount of shipping due on an online sale. 
			If the cost of the purchase is less than $20, the shipping cost is $5.99.  
			If the cost of the purchase over $20 and  at most $65, the shipping cost is $10.99.  
			If the cost of the purchase is over $65, the shipping cost is $15.99.

Solution: 	Import Scanner class from java.util package
			Welcome the user
			prompt for INPUT_PRICE type = double
			store the input in constants INPUT_PRICE values will not change
			declare a variable shipping type = double
			if INPUT_PRICE < 20
				shipping = 5.99
			else if INPUT_PRICE > 20 AND INPUT_PRICE <= 65
				shipping = 10.99
			else if INPUT_PRICE > 65
				shipping = 15.99 
			 
			output: "Cost of shipping is $ shipping"
			
			 
*/
 
// declare class
public class shippingDue{	
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("I can calculate the shipping charges based on the purchase price.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for INPUT_PRICE
		// store the user input
		System.out.print("Please enter price of your purchases: ");
		final double INPUT_PRICE = keyboard.nextDouble();
		// declare variable for answer
		double shipping = 0;
		 
		// do the calculation
		if (INPUT_PRICE < 20){
			shipping = 5.99;
		}
		else if (INPUT_PRICE > 20 && INPUT_PRICE <= 65){
			shipping = 10.99;
		}
		else if (INPUT_PRICE > 65){
			shipping = 15.99;
		}
	 
		//output to the console
		System.out.printf("Cost of shipping is $%4.2f ",shipping);
  
	}//main END
}//class END