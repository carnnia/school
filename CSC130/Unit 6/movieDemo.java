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
	Movie bruce = new Movie("The sixth sense."); 
	bruce.writeOutput();
	bruce.setName("The SIXTH sense!");
	bruce.writeOutput();
	System.out.println("set the rating of an existing odject");
	bruce.setRating("PG");
	bruce.writeOutput();
	System.out.println("add a rating");
	bruce.addRating(1);
	bruce.addRating(2);
	bruce.addRating(3);
	bruce.addRating(4);
	bruce.addRating(5);
	bruce.writeOutput();
	System.out.println("lets make a new object");
	Movie tom = new Movie("Rain man", "PG");
	tom.addRating(3);
	tom.writeOutput();
	System.out.println("comparing bruce and tom resaults in " + bruce.equal(bruce, tom));



	}//main END
}//class END