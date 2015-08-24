import java.util.Scanner;
/*
Name:		Casey Carnnia
Date: 		10.22.2012
Scope:		Problem 4: Write a program that prints a multiplication table, like this:
			1 2 3 4 5 6 7 8 9 10
			2 4 6 8 10 12 14 16 18 20
			3 6 9 12 15 18 21 24 27 30
			…
			10 20 30 40 50 60 70 80 90 100

Solution: 	welcome the user
			using a loop 	
 				instantiate a counter
 				as long as this loops counter is less then or equal to 10
					using another loop
					as long as this loops counter is less then or equal to 10
					output outer loop counter times inner loop counter separated by tabs
 				output a line brake 
*/
 
// declare class
public class multiplicationTable{
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("I can print a multiplication table.");
		 
		for (int outterCounter = 1; outterCounter <= 10; outterCounter ++){
			for (int innerCounter = 1; innerCounter <= 10; innerCounter ++){
		 		System.out.print(outterCounter * innerCounter + "\t");
			}//inner loop END 	
			System.out.print("\n");
		}//outter loop END 
		
		 
	}//main END
}//class END

 