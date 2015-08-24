/*
Name:  Casey Carnnia
Date:  12.13.2012
Scope: Problem 3:
Consider a class Movie that contains information about a movie. The class has the following attributes:
•	The movie name
•	The MPAA rating (e.g. G, PG, PG-13, R)
•	The number of people that have rated this movie as a 1 (Terrible)
•	The number of people that have rated this movie as a 2 (Bad)
•	The number of people that have rated this movie as a 3 (OK)
•	The number of people that have rated this movie as a 4 (Good)
•	The number of people that have rated this movie as a 5 (Great)
Implement the class with accessors and mutators for the movie name and MPAA rating. 
Write a method addRating that takes an integer as an input parameter. 
	The method should verify that the parameter is a number between 1 and 5, and if so, 
	increment by one the number of people rating the movie that matches the input parameter. 
	For example, if 3 is the input parameter, then the number of people that rated the movie as a 3 should be incremented by one. 
	Write another method, getAverage, that returns the average value for all the movie ratings.
Test the class by writing a main method that creates at least two movie objects, adds at least five ratings for each movie, 
and output the movie name, MPAA rating, and average rating for each movie object.


*/

public class Movie
{
	//instance variables 
	private String name;
	private String rating;
	private double averageReview = 0;
	private int terrible = 0;
	private int bad = 0;
	private int ok = 0;
	private int good = 0;
	private int great = 0;

	/**
  Constructors
	*/
	public Movie()
	{
		name = "Blank Movie.";
		rating = "Not rated";
	}// Constructor no parm END

	public Movie(String initialName)
	{
		name = initialName;
		rating = "Not rated";
	}// Constructor name only END

	public Movie(String initialName, String initialRating)
	{
		name = initialName;
		rating = initialRating;
	}// Constructors END

  /**
  Sets Movie Name
  */
	public void setName(String newName)
	{
		name = newName;
	}
/**
  Sets Movie Rating
  */
	public void setRating(String newRating)
	{
		rating = newRating;
	}

/**
  Gets Movie Name
  */
	public String getName()
	{
		return name;
	}
/**
  Gets Movie Rating
  */
	public String getRating()
	{
		return rating;
	}


  /**
  Precondition: the int for review passed is between 1 and 5
  Postcondition: Increase the proper rating by one
  */
	public void addRating(int newReview)
	{
		switch (newReview)
		{
			case 1: 
				terrible ++;
				break;
			case 2: 
				bad ++;
				break;
			case 3: 
				ok ++;
				break;
			case 4: 
				good ++;
				break;
			case 5: 
				great ++;
				break;
			default: 
				System.out.println("A value other then 1,2,3,4, or 5 was entered for Review.");
				break;
		}//switch END
	}//addRating END
  /**
  Precondition: None
  Postcondition: returns the average review for a movie as a rounded up integer
  */
	public double getAverage()
	{
		averageReview = Math.round(((terrible * 1) + (bad * 2) + (ok * 3) + (good * 4) + (great * 5))/5.00);
		return averageReview;
	}
	/**
	Precondition: None
	Postcondition: writes movie object as a string
	*/
	public String toString()
	{
		return "Name: " + name +
					 "\nRating: " + rating +
					 "\nAverage Review " + averageReview;
	}
/**
	Precondition: None
	Postcondition: writes the movie object to the screen
	*/
	public void writeOutput()
	{
		System.out.println("Name: " + getName());  
		System.out.println("Rating: " + getRating());
		System.out.println("Average Review " + getAverage());
		System.out.println(terrible + " people have rated this movie as terrible.");
		System.out.println(bad + " people have rated this movie as bad.");
		System.out.println(ok  + " people have rated this movie as OK.");
		System.out.println(good + " people have rated this movie as good.");
		System.out.println(great + " people have rated this movie as great.");
	}
	/**
	Precondition: 2 movies from the same rating that have the same review are equal
	Postcondition: true or false
	*/
	public boolean equal(Movie otherObject)
	{
		return (this.rating.equalsIgnoreCase(otherObject.rating)) && (this.averageReview == otherObject.averageReview);
	}

 
 }//Movie END