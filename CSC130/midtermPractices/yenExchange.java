/*
Name:     Casey Carnnia
Date:     10.09.2012
Scope:    Currency conversion. Write a program that first asks the user to type today's
            price for one dollar in Japanese yen, then reads U.S. dollar values and converts
            each to yen. Use 0 as a sentinel.
Solution: 	welcome the user
			ask the user to make a decision [1 = sell , 2 = buy , 0 = Exit ]
			if 1
				get sell value of one yen in dollars yenSellValue double
				get transaction amount
			if 2 
				get buy value of one yen in dollars yenBuyValue double
			if 3
				exit
*/
// import needed package
import java.util.Scanner;
// declare class
public class yenExchange{
    //declare the main method
    public static void main(String[] args) {
        // welcome the user
        System.out.println("I can exchange yen to dollar. ");
       
        // get ready to read the user data
        Scanner keyboard = new Scanner(System.in);
        // prompt the user for a buy/sell option
        System.out.println("Do you  want to sell or buy YEN [1 = sell , 2 = buy , 0 = Exit ] ");
        // store the user input
        int inputOption = keyboard.nextInt();
        // basic if logic       
        if (inputOption == 1) {
            System.out.println("giving YEN to get DOLLAR");
            System.out.println("What is the selling price of Yen against Dollars today? ");
            double yenSellValue = keyboard.nextDouble();
            System.out.println("How many YEN  do you want to sell? ");
            double transactionAmmount = keyboard.nextDouble();
            double answer = yenSellValue * transactionAmmount;
            System.out.printf("With YEN at $%5.2f ==> you will get $%10.2f for %10.2f YEN.", yenSellValue, answer, transactionAmmount);
               
        }
        else if (inputOption == 2){
            System.out.println("giving DOLLAR to get YEN");
            System.out.println("What is the buying price of Yen against Dollar today? ");
            double yenBuyValue = keyboard.nextDouble();
            System.out.println("How many YEN  do you want to buy? ");
            double transactionAmmount = keyboard.nextDouble();
            double answer = yenBuyValue * transactionAmmount;
            System.out.printf("With YEN at $%5.2f ==> it will cost you $%10.2f  for %10.2f YEN.", yenBuyValue, answer, transactionAmmount);
           
       
           
            }
        else if (inputOption == 0){
            System.out.println("You exited the program.");        
           
            }
        else {
            System.out.println("You entered an invalid value.");        
           
            }//if END
 
 
    }//main END
}//class END

 