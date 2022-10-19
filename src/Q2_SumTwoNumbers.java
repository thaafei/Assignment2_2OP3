/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 2 (20 marks)
 * 
 * Write a Java program to print the sum of two user input integer numbers.
 * 
 * INPUT: two user input integer numbers
 * OUTPUT: the sum of the two user input integer numbers
 * 
 * Hint1: you may use java.util.Scanner to take user input numbers.
 * 
 */

import java.util.Scanner;


public class Q2_SumTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //intiailizing scanner

		//prompts user to enter the first number, stores as int a
		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		//prompts user to enter the second number, stores as int b
		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		//adds the two numbers together
		int sum = a+b;

		//prints the sum of the two numbers
		System.out.println("The sum is "+ sum);
	}
}
