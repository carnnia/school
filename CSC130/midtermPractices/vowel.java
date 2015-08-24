/*
Name:		Casey Carnnia
Date: 		10.10.2012
Scope:		Write a program that prompts the user to provide a single character from the alphabet. 
			Print Vowel or Consonant, depending on the user input. 
			If the user input is not a letter (between a and z or A and Z), 
			or is a string of length > 1, print an error message.

Solution:	welcome the user
			declare a variable to hold user input inputLetter type = String
			prompt for user input
			store the input in inputLetter
			trim inputLetter
			evaluate the inputLetter length 
			if inputLetter.lenghth() > 1 => error msg
			convert inputLetter toLowerCase
			if inputLetter < a or inputLetter > z => error msg
			if inputLetter.equals [a,e,i,o,u] => this is a vowel
			else => this is a consonant
 	

 
*/
// import needed package
import java.util.Scanner;
// declare class
public class vowel{
	//declare the main method
	public static void main(String[] args) {
		//declare variables
		String inputLetter = ""; 
		// welcome the user
		System.out.println("I can tell you if a letter in the alphabet is a vowel or a consonant.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for a letter
		System.out.print("Please enter a letter from English alphabet: ");
		// store the user input
		 inputLetter = keyboard.next();
		
		//trim it to remove white space
		 inputLetter = inputLetter.trim();
		 
		 //check the length 
		 if (inputLetter.length() == 1){
			 //convert inputLetter to lowercase 
			 inputLetter = inputLetter.toLowerCase();
			 //is inputLetter between a and z and not a number or other char
			 if (inputLetter.compareTo("a") >= 0 ){
				 if (inputLetter.equals("a") || inputLetter.equals("e") || inputLetter.equals("i") || inputLetter.equals("o") || inputLetter.equals("u")){
					 System.out.println(inputLetter + " is a VOWEL.");
				 }
				 else{
					 System.out.println(inputLetter + " is a CONSONANT.");
				 }// output decision END
				 
			 }
			 else{
				 System.out.println(inputLetter + " is not valid. You might have entered somthing other then a to z. ");
			 }//if between a and z END
		 }
		 else{
			 System.out.println(inputLetter + " is not valid. You either entered more then one letter. ");
		 }//if length END

		
			 
	  
  
	}//main END
}//class END

 