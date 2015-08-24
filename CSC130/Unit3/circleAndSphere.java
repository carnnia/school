/*
Name:		Casey Carnnia
Date: 		09.23.2012
Scope:		Problem 2: Write a problem that prompts the user for a radius and then prints:
			The area and the circumference of a circle with that radius
			The volume and surface area of a sphere with that radius
Algorithm:	1) prompt the user for a radius allow fractions
			2) capture input value in radious type = float
			3) set a constant for PI typle = float value = 3.14159265359
			4) output: "You entered:\t" + radius + "\t and Pi is:\t" + PI
			5) area = Pi * radias ^ 2
				output: "The AREA of that circle is ==>\t" + (float)(PI * (radius * radius)) + " square units"
			6) circumference = Pi * radious * 2
				output: "The CIRCUMFERENCE of that circle is ==>\t" + (float)(PI * (radius * 2)) + " units"
			7) circumference of sphere = 4 * Pi * radious ^ 2
				output: "The CIRCUMFERENCE of a sphere with that radius is ==>\t" + (float)(4 * PI * (radius * radius)) + " square units"
			8) volume of a sphere = 4/3 * Pi * radious ^ 3
				output: "The VOLUME of a sphere with that radius is ==>\t" + (float)( (4/3) * PI * (radius * radius * radius)) + " units cubed"

*/
// import needed package
import java.util.Scanner;
// declare class
public class circleAndSphere{
	//declare the main method
	public static void main(String[] args) {
		// welcome the user
		System.out.println("I can calculate the area and circumference of a circle as well as the volume of a sphere. ");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for number ** radius **
		System.out.print("Please enter the radius, you can use fractions: ");
		// store the user input
		float radius = keyboard.nextFloat();
		// declare a constant for Pi
		final double PI = 3.14159265359; 
		 
		System.out.println("You entered:\t" + radius + "\t and Pi is:\t" + PI); 
		System.out.println("----------------------------------------------------------------------");
		// area = Pi * radias ^ 2
		System.out.println("The AREA of that circle is ==>\t" + (float)(PI * (radius * radius)) + " square units");
		System.out.println("----------------------------------------------------------------------");
		// circumference = Pi * radious * 2
		System.out.println("The CIRCUMFERENCE of that circle is ==>\t" + (float)(PI * (radius * 2)) + " units");
		System.out.println("----------------------------------------------------------------------");
		// circumference of sphere = 4 * Pi * radious ^ 2
		System.out.println("The CIRCUMFERENCE of a sphere with that radius is ==>\t" + (float)(4 * PI * (radius * radius)) + " square units");
  		System.out.println("----------------------------------------------------------------------");
		// volume of a sphere = 4/3 * Pi * radious ^ 3
		System.out.println("The VOLUME of a sphere with that radius is ==>\t" + (float)( (4/3) * PI * (radius * radius * radius)) + " units cubed");
  
  
	}//main END
}//class END

 