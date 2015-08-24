/*
Name:     	Casey Carnnia
Date:    	10.09.2012
Scope:   	Consider the following pseudocode for finding the most attractive photo from a sequence of photos:
				Pick the first photo and call it "the best so far".
				For each photo in the sequence
   					If it is more attractive than the "best so far"
      					Discard "the best so far".
      					Call this photo "the best so far".
				The photo called "the best so far" is the most attractive photo in the sequence.
				Is this an algorithm that will find the most attractive photo?
				Suppose each photo in the above problem  had a price tag. Give an algorithm for finding the most expensive photo.
				
Solution: 	welcome the user
			set constant PHOTO_1, PHOTO_2, PHOTO_3, PHOTO_4, PHOTO_5 to the user input type float
			set variables photo1, photo2, photo3, photo4, photo5 to 0 type int
			
				if PHOTO_1 > PHOTO_2 => photo1++
				if PHOTO_1 > PHOTO_3 => photo1++
				if PHOTO_1 > PHOTO_4 => photo1++
				if PHOTO_1 > PHOTO_5 => photo1++
				
				if PHOTO_2 > PHOTO_1 => photo1++
				if PHOTO_2 > PHOTO_3 => photo1++
				if PHOTO_2 > PHOTO_4 => photo1++
				if PHOTO_1 > PHOTO_5 => photo1++
				
				if PHOTO_3 > PHOTO_1 => photo1++
				if PHOTO_3 > PHOTO_2 => photo1++
				if PHOTO_3 > PHOTO_4 => photo1++
				if PHOTO_3 > PHOTO_5 => photo1++
				
				if PHOTO_4 > PHOTO_1 => photo1++
				if PHOTO_4 > PHOTO_2 => photo1++
				if PHOTO_4 > PHOTO_3 => photo1++
				if PHOTO_4 > PHOTO_4 => photo1++
				
				if PHOTO_5 > PHOTO_1 => photo1++
				if PHOTO_5 > PHOTO_2 => photo1++
				if PHOTO_5 > PHOTO_3 => photo1++
				if PHOTO_5 > PHOTO_4 => photo1++
				
				output ranking:
				name:\t PHOTO 1\t PHOTO 2\t PHOTO 3\t PHOTO 4\t PHOTO 5\t
				price:\t PHOTO_1\t PHOTO_2\t PHOTO_3\t PHOTO_4\t PHOTO_5\t
				ranking:\t photo1\t photo2\t photo3\t photo4\t photo5\t
				
		
				 
			 
*/
// import needed package
import java.util.Scanner;
// declare class
public class pickPhoto{
    //declare the main method
    public static void main(String[] args) {
	// welcome the user
	System.out.println("I can choose the most expensive photo from a list of 5 if you tell me the price.");
	//ask the user to input price of PHOTO_1 type = double
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Please enter the price of PHOTO_1: ");
	//set constant PHOTO_1 to user input
	final double PHOTO_1 = keyboard.nextDouble();
	
	System.out.print("Please enter the price of PHOTO_2: ");
	//set constant PHOTO_2 to user input
	final double PHOTO_2 = keyboard.nextDouble();
	
	System.out.print("Please enter the price of PHOTO_3: ");
	//set constant PHOTO_3 to user input
	final double PHOTO_3 = keyboard.nextDouble();
	
	System.out.print("Please enter the price of PHOTO_4: ");
	//set constant PHOTO_4 to user input
	final double PHOTO_4 = keyboard.nextDouble();
	
	System.out.print("Please enter the price of PHOTO_5: ");
	//set constant PHOTO_5 to user input
	final double PHOTO_5 = keyboard.nextDouble();
	
	// declare set ranking variables to 0
	 int photo1 = 0, photo2 = 0, photo3 = 0, photo4 = 0, photo5 = 0;
	
	//start evaluating
	
	if (PHOTO_1 > PHOTO_2) { photo1++;}
	if (PHOTO_1 > PHOTO_3) { photo1++;}
	if (PHOTO_1 > PHOTO_4) { photo1++;}
	if (PHOTO_1 > PHOTO_5) { photo1++;}
	
	if (PHOTO_2 > PHOTO_1) { photo2++;}
	if (PHOTO_2 > PHOTO_3) { photo2++;}
	if (PHOTO_2 > PHOTO_4) { photo2++;}
	if (PHOTO_1 > PHOTO_5) { photo2++;}
	
	if (PHOTO_3 > PHOTO_1) { photo3++;}
	if (PHOTO_3 > PHOTO_2) { photo3++;}
	if (PHOTO_3 > PHOTO_4) { photo3++;}
	if (PHOTO_3 > PHOTO_5) { photo3++;}
	
	if (PHOTO_4 > PHOTO_1) { photo4++;}
	if (PHOTO_4 > PHOTO_2) { photo4++;}
	if (PHOTO_4 > PHOTO_3) { photo4++;}
	if (PHOTO_4 > PHOTO_4) { photo4++;}
	
	if (PHOTO_5 > PHOTO_1) { photo5++;}
	if (PHOTO_5 > PHOTO_2) { photo5++;}
	if (PHOTO_5 > PHOTO_3) { photo5++;}
	if (PHOTO_5 > PHOTO_4) { photo5++;}
	
	// format the output
	
	System.out.println("NAME:\t\t PRICE:\t\t RANKING\t");
	System.out.println("PHOTO 1\t\t" + PHOTO_1 + "\t\t" + photo1 + "\t");
	System.out.println("PHOTO 2\t\t" + PHOTO_2 + "\t\t" + photo2 + "\t");
	System.out.println("PHOTO 3\t\t" + PHOTO_3 + "\t\t" + photo3 + "\t");
	System.out.println("PHOTO 4\t\t" + PHOTO_4 + "\t\t" + photo4 + "\t");
	System.out.println("PHOTO 5\t\t" + PHOTO_5 + "\t\t" + photo5 + "\t");  
	
	 

    
        
 
 
    }//main END
}//class END

 