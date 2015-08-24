/*
Name:  Casey Carnnia
Date:  012.13.2012
Scope: Write a program to test your class definition: Movie
*/

public class movieDemo
{
	//- declare the main method
	public static void main (String[] args)
	{
	Movie bruce = new Movie("The sixth sense");
	bruce.toString();
	bruce.writeOutput();
	bruce.setName("The Sixth Sense");
	bruce.writeOutput();
	bruce.setRating("PG");
	bruce.writeOutput();
	//bruce.addRating(0);
	bruce.addRating(1);
	bruce.addRating(2);
	//bruce.addRating(3);
	//bruce.addRating(4);
	//bruce.addRating(5);
	//bruce.addRating(6);
	bruce.writeOutput();
	System.out.println(3/5);
	double casey = 1/5;
	System.out.println(Math.ceil(casey));

	 
	}//main END
}//class END