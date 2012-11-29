/*
Name:     Casey Carnnia
Date:     10.09.2012
Scope:    Suppose your cell phone carrier charges you $29.95 for up to 300 minutes of calls, 
		  and $0.45 for each additional minute, plus 12.5 percent taxes and fees.
		  Give an algorithm to compute the monthly charge from a given number of minutes.
Solution: 	welcome the user
			set constant BASIC_PRICE = 29.95 type = double
			set constant PLAN_MINUTES = 300 type = int
			set constant EXTRA_MINUTES_FEE = 0.45 type = double
			set constant TAX_FEES = 12.5 / 100 type = double
			set variable cost and totalCost type = double
			ask the user to input numberOfMinutes type = int 
			cost =  BASIC_PRICE + ( (numberOfMinutes - PLAN_MINUTES) * EXTRA_MINUTES_FEE )
			totalCost = cost + (cost  * TAX_FEES)
			out put the detail report
			 
*/
// import needed package
import java.util.Scanner;
// declare class
public class cellPhoneCalculator{
    //declare the main method
    public static void main(String[] args) {
	// welcome the user
	System.out.println("I can calculate your cell phone charges for the month.");
	//set constant BASIC_PRICE = 29.95 type = float
	final double BASIC_PRICE = 29.95; 
	//set constant PLAN_MINUTES = 300 type = int
	final int PLAN_MINUTES = 300;
	//set constant EXTRA_MINUTES_FEE = 0.45 type = float
	final double EXTRA_MINUTES_FEE = 0.45;
	//set constant TAX_FEES = 12.5 / 100 type = double
	final double TAX_FEES = 12.5 / 100;
	//set variable totalCost type = double
	double cost, totalCost = 0;
	//ask the user to input numberOfMinutes type = int
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter the number of minutes you have used this month: ");
	//store the user input
	int numberOfMinutes = keyboard.nextInt();
	//cost =  BASIC_PRICE + ( (numberOfMinutes - PLAN_MINUTES) * EXTRA_MINUTES_FEE )
	cost =  BASIC_PRICE + ( (numberOfMinutes - PLAN_MINUTES) * EXTRA_MINUTES_FEE );
	//totalCost = cost + (cost  * TAX_FEES)
	totalCost = cost + (cost  * TAX_FEES);
	System.out.printf("Your cost is $%10.2f: ",  totalCost);       
        
 
 
    }//main END
}//class END

 