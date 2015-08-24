/*
Name:        Casey Carnnia
Date:         09.25.2012
Scope:        Write a program that reads a score from the user, and calculates the
            letter grade according to the following rule:
                score between 90 and 100 -> grade is A
                score between 80 and 90 -> grade is B
                score between 70 and 80 -> grade is C
                score between 60 and 70 -> grade is D
                score below 60 -> grade is F
            In the end display the score along with the letter grade.

Algorithm:    1) prompt the user for a grade number
            2) capture the number in grade type = int
            3) declare variables to hold the letter grade letterGrade type = char
            4)     if grade > 100 -> letterGrade = N
                if grade >= 90 || grade = 100 -> letterGrade = A
                   if grade >= 80 && grade < 90  -> letterGrade = B
                   if grade >= 70 && grade < 80  -> letterGrade = C
                   if grade >= 60 && grade < 70  -> letterGrade = D
                   if grade < 60                 -> letterGrade = F
            5) print out "Your grade is\t" + grade + "\t Which is equal to: \t" +  letterGrade
*/
// import needed package
import java.util.Scanner;
// declare class
public class gradeWithSwitch{
    //declare the main method
    public static void main(String[] args) {
        // welcome the user
        System.out.println("I can calculate your letter grade based on your number grade. ");
        // get ready to read the user data
        Scanner keyboard = new Scanner(System.in);
        // prompt the user for a number grade
        System.out.print("Please enter your number grade: ");
        // store the user input
        int grade = keyboard.nextInt();
        // declare variables to hold the letter grade letterGrade type = char
        char letterGrade;
        // evaluate grade and set letterGrade
        if (grade > 100 || grade < 0) {
            letterGrade = 'N';
        }
        else if (grade >= 90)
        {
            letterGrade = 'A';
        }
        else if (grade >= 80 && grade < 90)
        {
            letterGrade = 'B';
        }
        else if (grade >= 70 && grade < 80)
        {
            letterGrade = 'C';
        }
        else if (grade >= 60 && grade < 70)
        {
            letterGrade = 'D';
        }
        else
        {
            letterGrade = 'F';
        }//if END
        // evaluate letterGrade and out put the proper massage
        switch (letterGrade) {
            case 'A':  System.out.println(grade + " Horrra, you got an\t" + letterGrade);
            break;

            case 'B':  System.out.println(grade + " Good Job, you got a\t" + letterGrade);
            break;

            case 'C':  System.out.println(grade + " You are still OK, you got a\t" + letterGrade);
            break;

            case 'D':  System.out.println(grade + " Got to staret working, you got a\t" + letterGrade);
            break;
 
            case 'F':  System.out.println(grade + " I am sorry, you got a\t" + letterGrade);
            break;

            case 'N':  System.out.println(grade + " Your input is not a valid grade\t" + letterGrade);
            break;
        }// switch END
     
 
    }//main END
}//class END

 