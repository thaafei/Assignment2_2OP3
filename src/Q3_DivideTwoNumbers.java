/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 3 (20 marks)
 * 
 * Write a Java program to print the result of first user input real number divided by the second user input real number.
 * 
 * INPUT: user input real number x, and user input real number y
 * OUTPUT: the result of x divided y. (The result should be printed with two significant digits after the decimal point.)
 * 
 * Hint1: you may use java.util.Scanner to take user input real numbers.
 * Hint2: you may use format string of System.out.printf() when printing the result.
 * 
 */

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Q3_DivideTwoNumbers {
	public static void main(String[] args) {
		//initializing scanner
		Scanner sc = new Scanner(System.in);

		//prompts user to enter the first number
		System.out.print("Enter first real number: ");
		double a = sc.nextDouble();

		//prompts user to enter the second number
		System.out.print("Enter second real number: ");
		double b = sc.nextDouble();

		//divids the first number by the second
		double divid =  a/b;

		//prints the output, rounded to 2 decimal place
		System.out.printf("The answer is %.2f", divid);
	}
}
