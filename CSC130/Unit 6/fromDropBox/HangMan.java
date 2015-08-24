/*
Name:  Casey Carnnia
Date:  12.13.2012
Scope: Problem 2:
Consider a class that could be used to play a game of hangman. The class has the following attributes:
    The secret word
    The disguised word, in which each unknown letter in the secret word is replaced with a question mark (?). For example, if the secret word is abracadabra, and the letters a , and b have been guessed, the disguised word would be ab?a?a?ab?a
    The number of guesses made
    The number of incorrect guesses
It will have the following methods:
    MakeGuess(c) guesses that character c is in the word
    getDisguisedWord returns a string containing correctly guessed letters in their correct positions 
    and unknown letters replaced with ?
    getSecretWord returns the secret word
    getGuessCount returns the number of guesses made
    isFound returns true if the hidden word has been discovered.
Perform the following actions:
    Write a method heading for each method.
    Write preconditions and postconditions for each method.
    Write some Java statements that test the class.
    Implement the class.
    List any additional methods and attributes needed in the implementation that were not listed 
    in the original design. List any other changes made to the original design.
    Write a program that implements the game of hangman, using the class you wrote for part d.

*/
import java.util.Scanner
public class hangman
{
	//instance variables 
	private int guessCount;
	private int correctGuessCount;
	private int limit;
	private int startFlag;
	private String secret;
	private String disguised;

  /**
  Sets the counter to zero gets a new secret word ===game start===
  */
	public int newGame()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Player 1 Please enter the SECRET word: ");
		secret = keyboard.next();
		secret = secret.trim();
		for (int x = 0; x < secret.length(); x++)
		{
			disguised = disguised + "?"
		}
		guessCount = 0;
		correctGuessCount = 0;
		limit = secret.length();
		if (limit > 0)
		{
			startFlag = 0;
			//clear the screen
			for (int y = 0; y < 30; y++)
			System.out.println("*** Game is about to start ***");
		}
		System.out.println("Player 2 your secret word is " + limit + "letters long " + disguised );
		System.out.println("You have " + limit + "chances to guess the word.");
		System.out.println("Counter is set to " + guessCount);
		System.out.println("*** READY ~~~ SET ~~~ GO ***");
		//just in case if we wanted to do some validation later
		return startFlag;
  /**
  Increase the guessCount by one
  Evaluate the input
  Increase the correctGuessCount if input is correct

  */
	public void MakeGuess(char playerInput)
	{
		char letter = playerInput;
		int position = secret.indexOf(letter);
		for (int g = 0; g < position; g++)
		{
			disguised = disguised.substring
		}
		if (secret.indexOf(letter) >= 0)
		{

		}
	}
  /**
  Decrease counter by one 
  But not bellow 0
  */
	public void decreaseCounter()
	{
		if (counterVal > 0)
		{
			counterVal = counterVal - 1;
		}
		else
		{
			System.out.println("Counter is zero. A negative counter is not allowed.");
		}
		
	}
	/**
	Return the current counter value
	*/
	public int getCounterValue()
	{
		return counterVal;
	}
	/**
	Print the current value to the screen
	*/
	public void tostringCounter()
	{
		System.out.println("Currently the counter reads: " + counterVal);
	}





 }