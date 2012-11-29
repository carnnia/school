import java.util.Random;
import java.lang.Math;
/*
Name:		Casey Carnnia
Date: 		10.22.2012
Scope:		Problem 5: The Drunkard's Walk. 
			A drunkard in a grid of streets randomly picks one of four directions and stumbles to the next intersection, 
			then again randomly picks one of the four directions, and so on. 
			You might think that on average the drunkard doesn't move very far because the choices cancel each other out, 
			but that is actually not the case.
			Represent locations as integer pairs(x,y). Implement the drunkard's walk over 100 intersections, 
			starting at (0,0) and print the ending location.



Solution: 	welcome the user
 			instantiate a variable x = 0 type = int
 			instantiate a variable y = 0 type = int
 			instantiate a variable distance = 0 type = double
 			using a loop
 				initialize a counter 
 				as long as the counter is less then 100
 				pick random number between 1 and 4 
 					if 1 we are going east so increment y by 1 
 					if 2 we are going west so decrement y by 1 
 					if 3 we are going north so increment x by 1
 					if 4 we are going south so decrement x by 1
 			
 			use since we started from position (0,0):
 			modify the distance formula so distance = sqrt of [(x - 0)^2 + (y - 0)^2]
			output the answer
*/
 
// declare class
public class drunkardWalk{
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("If a drunk person at location (x,y) randomly travels i various directions in a grid city. What happens after 100 random choices.");

		Random randomGenerator = new Random();
		int x = 0;
		int y = 0;
		double distance = 0;
		for (int decisionCounter = 0; decisionCounter < 100; decisionCounter ++){
			int direction = randomGenerator.nextInt(4) + 1 ;

			 switch (direction) {
			 case 1: x = x + 1; //going east one block
			 	break;
			 case 2: x = x + -1;//going west one block
			 	break;
		 		
			 case 3: y = y + 1;//going north one block
			 	break;
		 		
			 case 4: y = y - 1;//going south one block\
		 		break;
			 }//switch END
			
		}//loop END
		// d= sqrt of [(x - 0)^2 + (y - 0)^2]
		distance = Math.sqrt(((x * x) + (y * y)));
		
		
		
		System.out.printf("If the city blockes are one mile by one mile then the drunk person has traveled %4.2f", distance);
		System.out.println(" miles away from his original location by walking 100 miles. ");
		  
  
	}//main END
}//class END

 