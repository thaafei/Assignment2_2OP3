/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 4 (20 marks)
 * 
 * Write a Java program to print the area and perimeter of a circle.
 * 
 * INPUT: radius input by a user.
 * OUTPUT: the area and the perimeter of the circle defined by the radius. All results must use two significant digits after decimal point.
 * 
 * Hint: you may use java.util.Scanner to take user input real valued radius.
 * 
 */

import java.util.Scanner;


public class Q4_AreaOfCircle {
	public static void main(String[] args) {
		//intialize scanner
		Scanner sc = new Scanner(System.in);

		//prompts user to input the radius, stores it as a double
		System.out.print("Input the radius: ");
		double rad = sc.nextDouble();

		//calculates the perimeter and area
		double perimeter = rad*2*Math.PI;
		double area = Math.PI*Math.pow(rad,2);

		//prints the perimeter and area rounded to 2 decimal place
		System.out.printf("The perimeter is %.2f and the area is %.2f",perimeter,area);


	}
}
