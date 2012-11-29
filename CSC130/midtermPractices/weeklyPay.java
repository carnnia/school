import java.util.Scanner;

/*
Name:		Casey Carnnia
Date: 		10.09.2012
Scope:		Write a program that reads in the name and salary of an employee. 
			Here the salary will denote an hourly wage, such as $9.25. 
			Then ask how many hours the employee worked in the past week. 
			Be sure to accept fractional hours. Compute the pay. 
			Any overtime work (over 40 hours per week) is paid at 150 percent of the regular wage. 
			Print a paycheck for the employee.
Solution: 	welcome the user
			prompt for input of hourlyWage input type = double
			prompt the user for hoursWorked input type = double
			store the input in constants
			declare variable payAmount type = double 
			declare variable otPayAmout type = double
			declare variable totalPay type = double 
			
			if hoursWorked > 40 => 
				payAmount = hourlyWage * 40
				otPayAmount = (hoursWorked - 40 ) * (hourlyWage * 1.5)
				totalPay = payAmount + otPayAmount
			else
				totalPay = hourlyWage * hoursWorked

			output "Your paycheck amount for this week is " + totalPay
			
*/
 
// declare class
public class weeklyPay{	
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("I can calculate your weekly pay.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for hourlyWage
		// store the user input
		System.out.print("Please enter your hourly wage, you can enter fractions too: ");
		final double HOURLY_WAGE = keyboard.nextDouble();
		
		// prompt the user for hoursWorked
		// store the user input
		System.out.print("Please enter number hours you worked this week, you can enter fractions too: ");
		final double HOURS_WORKED = keyboard.nextDouble();
		
		// declare variables and set to 0 
		double payAmount = 0;
		double otPayAmount = 0;
		double totalPay = 0;
		// do the calculation
		if (HOURS_WORKED > 40){ 
			payAmount = HOURS_WORKED * 40 ;
			otPayAmount = (HOURS_WORKED - 40 ) * (HOURLY_WAGE * 1.5) ;
			totalPay = payAmount + otPayAmount ;
		}
		else{
			totalPay = HOURLY_WAGE * HOURS_WORKED ;
		}// if END
			 
	   System.out.printf("You worked %5.2f hours and your normal rate of pay is $%4.2f ", HOURS_WORKED, HOURLY_WAGE );
	   System.out.printf("\nYour overtime pay is $%5.2f and your total paycheck is $%10.2f ", otPayAmount, totalPay );
  
	}//main END
}//class END