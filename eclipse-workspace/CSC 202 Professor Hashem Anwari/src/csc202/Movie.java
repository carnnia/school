/**
 * CSC 202 NOVA / Loudoun County
 * Professor Hashem Anwari 
 */
package csc202;

/**
 * @author Casey Carnnia - Assigned: 8/27/2015 - Due: 9/3/2015
 * A stylistic assessment and a review of CSC201. 
 * Write OOP based application that provides movies with following attributes, and instantiate at least 2 objects:
 * - name
 * - show time
 * - list of stars in the movie
 * - movies official rating
 * - movies review rating 
 */
public class Movie {
	
	// make private variables
	private String movieName;
	private String movieStar;
	
	// make constructor
	Movie(String name, String star){
		movieName = name;
		movieStar = star;
	}
	
	// make default constructor
	Movie(){
		movieName = "Comming Atreaction";
		movieStar = "TBD";
	}
	
	// provide setters 
	String setMovieName(String aName){
		movieName = aName;
		return movieName;
	}
	// provide getters
	
		

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
