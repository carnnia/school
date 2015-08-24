/*
Name:		Casey Carnnia
Date: 		10.10.2012
Scope:		The following algorithm yields the season (Spring, Summer, Fall, or Winter) for a given month and day. 
			If month is 1, 2, or 3, season = "Winter"
			Else if month is 4, 5, or 6, season = "Spring"
			Else if month is 7, 8, or 9, season = "Summer"
			Else if month is 10, 11, or 12, season = "Fall"
	
			If month is divisible by 3 and day >= 21
			
   			If season is "Winter", season = "Spring"
   			Else if season is "Spring", season = "Summer"
   			Else if season is "Summer", season = "Fall"
   			Else season = "Winter"
   			
   			Write a program that prompts the user for a month and day and then prints
   			the season, as determined by this algorithm.


 
*/
// import needed package
import java.util.Scanner;
// declare class
public class season{
	//declare the main method
	public static void main(String[] args) {
		//declare variables
		int inputMonth = 0;
		int inputDay = 0;
		// welcome the user
		System.out.println("I can what season it is if you tell me the number indecating the month and one indecating the day. ");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for a number for month
		System.out.print("Please enter a number from 1 to 12 to indecate the month: ");
		// store the user input
		 inputMonth = keyboard.nextInt();
		
		 
		// evaluate valid input for month
		boolean validInput = true;
		if (inputMonth > 12 || inputMonth < 1) {
			System.out.println(inputMonth + " is not a valid month.");
			validInput = false;
		}
		else{
			// prompt the user for a number for day
			System.out.print("Please enter a number from 1 to 31 to indecate the day: ");
			// store the user input
			 inputDay = keyboard.nextInt();
			// evaluate valid input for month
			if (inputDay > 31 || inputMonth < 1) {
				System.out.println(inputDay + " is not a valid day.");
				validInput = false;
					
			}//if for day END
			
		}//if for month END
		
		// if we have valid data we work else we quit
		if (validInput){
			//variable to hold the season
			String season = "";
			//evaluate inputMonth and set the season accordingly  
			if (inputMonth == 1 || inputMonth == 2 || inputMonth == 3){
				season = "Winter";
			}
			else if (inputMonth == 4 || inputMonth == 5 || inputMonth == 6){
				season = "Spring";
			}
			else if (inputMonth == 7 || inputMonth == 8 || inputMonth == 9){
				season = "Summer";
			}
			else{
				season = "Fall";
			}//if for monthInput END
			//evaluate inputDay and update season accordingly
			 
			if (inputMonth % 3 == 0 && inputDay >= 21){
				if (season.equalsIgnoreCase("Winter")){
					season = "Spring";
				}
				else if (season.equalsIgnoreCase("Spring")){
					season = "Summer";	
				}
				else if(season.equalsIgnoreCase("Summer")){
					season = "Fall";
				}
				else{
					season = "Winter";
				}//if for 21 END
			}//if for inputDay END
		System.out.println("I think it is\t" + season);	
		}
		else{
			System.out.println(validInput + " data so quitting.");
		}//if valid input END
		
		 

		
			 
	  
  
	}//main END
}//class END

 