/*
Name:		Casey Carnnia
Date: 		10.09.2012
Scope:		Write a program that translates a number between 0 and 4 into the closest letter grade. 
			For example, the number 2.8 (which might have been the average of several grades) would be converted to B–. 
			Break ties in favor of the better grade; for example 2.85 should be a B.

Algorithm:	1) prompt the user for a grade number between 0 and 4
			2) capture the number in grade type = double  
			3) declare variables to hold the letter grade letterGrade type = String
			4) 	if grade > 4.00 -> letterGrade = N
			   	
		   		if grade >= 3.85 && grade <= 4.0 -> letterGrade = A+
		   		if grade >= 3.5 && grade < 3.85 -> letterGrade = A
		   		if grade >= 3.333 && grade < 3.5 -> letterGrade = A-
			   
		   		if grade >= 3.0 && grade < 3.333 -> letterGrade = B+
			   	if grade >= 2.667 && grade < 3.0 -> letterGrade = B
			   	if grade >= 2.333 && grade < 2.667 -> letterGrade = B-
			   	
			   	if grade >= 2.0 && grade < 2.333 -> letterGrade = C+
			   	if grade >= 1.667 && grade < 2.0 -> letterGrade = C
			   	if grade >= 1.333 && grade < 1.667 -> letterGrade = C-
			   	
			   	if grade >= 1.0 && grade < 1.333  -> letterGrade = D+
			   	if grade > 0 && grade < 1.0  -> letterGrade = D
			   	if grade == 0                 -> letterGrade = F
			5) print out "Your grade is\t" + grade + "\t Which is equal to: \t" +  letterGrade
*/
// import needed package
import java.util.Scanner;
// declare class
public class holidays{
	//declare the main method
	public static void main(String[] args) {
		// welcome the user
		System.out.println("I can calculate your letter grade based on your number grade. ");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for a number grade
		System.out.print("Please enter your number grade: ");
		// store the user input
		double grade = keyboard.nextDouble();
		// declare variables to hold the letter grade letterGrade type = char
		String letterGrade;
		// evaluate grade and set letterGrade
		if (grade > 4.00 || grade < 0) {
			letterGrade = "N";
		}
		else if (grade >= 3.85 && grade <= 4.0 )
		{
			letterGrade = "A+";
		}
		else if (grade >= 3.5 && grade < 3.85 )
		{
			letterGrade = "A";
		}
		else if (grade  >= 3.333 && grade < 3.5 )
		{
			letterGrade = "A-";
		}
		else if (grade >= 3.0 && grade < 3.333 )
		{
			letterGrade = "B+";
		}
		else if (grade >= 2.667 && grade < 3.0 )
		{
			letterGrade = "B";
		}	
		else if (grade >= 2.333 && grade < 2.667 )
		{
			letterGrade = "B-";
		}		
		else if (grade >= 2.0 && grade < 2.333 )
		{
			letterGrade = "C+";
		}		
		else if (grade >= 1.667 && grade < 2.0 )
		{
			letterGrade = "C";
		}		
		else if (grade >= 1.333 && grade < 1.667 )
		{
			letterGrade = "C-";
		}
		else if (grade >= 1.0 && grade < 1.333 )
		{
			letterGrade = "D+";
		}
		else if (grade  > 0 && grade < 1.0 )
		{
			letterGrade = "D";
		}
		else 		{
			letterGrade = "F";
		}//if END
		
		if (letterGrade.equalsIgnoreCase("N")){
			
			System.out.println(grade + " Your input is not a valid grade\t" + letterGrade);
		}
		else{
			System.out.println("Your grade is\t" + grade + "\t Which is equal to: \t" +  letterGrade);
			
		}//if END

		
			 
	  
  
	}//main END
}//class END

 