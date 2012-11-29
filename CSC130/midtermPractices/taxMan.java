import java.util.Scanner;

/*
Name:		Casey Carnnia
Date: 		10.10.2012
Scope:		The original US income tax of 1913 was quite simple. The tax was:
			•	1 percent on the first $50,000
			•	2 percent on the amount over $50,000 up to $75,000
			•	3 percent on the amount over $75,000 up to $100,000
			•	4 percent on the amount over $100,000 up to $250,000
			•	5 percent on the amount over $250,000 up to $500,000
			•	6 percent on the amount over $500,000.
			There was no separate schedule for single or married taxpayers. 
			Write a program that computes the income tax according to this schedule.

Solution: 	welcome the user
			prompt for input of INCOME_AMOUNT type = double
			store the input in constants INCOME_AMOUNT
			declare variable taxAble1 taxAble2 taxAble3 taxAble4 taxAble5 taxAble6 type = double set to 0 
			declare variable taxItMore type = double set to 0
			declare variable incomeTax type = double set to 0
			
			
			if INCOME_AMOUNT =< 50000  => 
				taxAble1 = INCOME_AMOUNT * .01
			
			else if INCOME_AMOUNT > 50000 && INCOME_AMOUNT >= 75000  => 
				taxAble1 = 50000 * .01
				taxItMore = INCOME_AMOUNT - 50000
				taxAble2 = taxItMore * .02
				
			else if INCOME_AMOUNT > 75000 && INCOME_AMOUNT >= 100000  => 
				taxAble1 = 50000 * .01
				taxAble2 = 25000 * .02
				taxItMore = INCOME_AMOUNT - 75000
				taxAble3 = taxItMore * .03
				
			else if INCOME_AMOUNT > 100000 && INCOME_AMOUNT >= 250000  => 
				taxAble1 = 50000 * .01
				taxAble2 = 25000 * .02
				taxAble3 = 25000 * .03
				taxItMore = INCOME_AMOUNT - 100000
				taxAble4 = taxItMore * .04
				
			else if INCOME_AMOUNT > 250000 && INCOME_AMOUNT >= 500000  => 
				taxAble1 = 50000 * .01
				taxAble2 = 25000 * .02
				taxAble3 = 25000 * .03
				taxAble4 = 150000 * .04
				taxItMore = INCOME_AMOUNT - 150000
				taxAble5 = taxItMore * .05
				
			else if INCOME_AMOUNT > 500000  => 
				taxAble1 = 50000 * .01
				taxAble2 = 25000 * .02
				taxAble3 = 25000 * .03
				taxAble4 = 150000 * .04
				taxAble5 = 250000 * .05
				taxItMore = INCOME_AMOUNT - 250000
				taxAble6 = taxItMore * .06
				
			incomeTax = taxAble1 + taxAble2 + taxAble3 + taxAble4 + taxAble5 + taxAble6
			output: You said your income was INCOME_AMOUNT so your tax is incomeTax 
				
			 
			
*/
 
// declare class
public class taxMan{	
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("I can calculate your taxes as if you lived in 1913.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for INCOME_AMOUNT
		// store the user input
		System.out.print("Please enter your income for: ");
		final double INCOME_AMOUNT = keyboard.nextDouble();
		
		 
		
		// declare variables and set to 0 
		double taxAble1 = 0;
		double taxAble2 = 0;
		double taxAble3 = 0;
		double taxAble4 = 0;
		double taxAble5 = 0;
		double taxAble6 = 0;
		double taxItMore = 0;
		double incomeTax = 0;
		
		// do the calculation

		if (INCOME_AMOUNT <= 50000){ 
		taxAble1 = INCOME_AMOUNT * .01;
		}
		else if (INCOME_AMOUNT > 50000 && INCOME_AMOUNT <= 75000){ 
			taxAble1 = 50000 * .01;
			taxItMore = INCOME_AMOUNT - 50000;
			taxAble2 = taxItMore * .02;
		}	
		else if (INCOME_AMOUNT > 75000 && INCOME_AMOUNT <= 100000){ 
			taxAble1 = 50000 * .01;
			taxAble2 = 25000 * .02;
			taxItMore = INCOME_AMOUNT - 75000;
			taxAble3 = taxItMore * .03;
		}
		else if (INCOME_AMOUNT > 100000 && INCOME_AMOUNT <= 250000){ 
			taxAble1 = 50000 * .01;
			taxAble2 = 25000 * .02;
			taxAble3 = 25000 * .03;
			taxItMore = INCOME_AMOUNT - 100000;
			taxAble4 = taxItMore * .04;
		}
		else if (INCOME_AMOUNT > 250000 && INCOME_AMOUNT <= 500000){ 
			taxAble1 = 50000 * .01;
			taxAble2 = 25000 * .02;
			taxAble3 = 25000 * .03;
			taxAble4 = 150000 * .04;
			taxItMore = INCOME_AMOUNT - 150000;
			taxAble5 = taxItMore * .05;
		}
		else if (INCOME_AMOUNT > 500000){ 
			taxAble1 = 50000 * .01;
			taxAble2 = 25000 * .02;
			taxAble3 = 25000 * .03;
			taxAble4 = 150000 * .04;
			taxAble5 = 250000 * .05;
			taxItMore = INCOME_AMOUNT - 250000;
			taxAble6 = taxItMore * .06;
		}//if END
		
	incomeTax = taxAble1 + taxAble2 + taxAble3 + taxAble4 + taxAble5 + taxAble6;
  
			 
	   System.out.printf("You said your income was $%10.2f ", INCOME_AMOUNT );
	   System.out.printf("\nso your tax is $%5.2f ",  incomeTax );
  
	}//main END
}//class END