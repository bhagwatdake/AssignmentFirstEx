package AssignmentFirstEx;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Enter radius of the circle =");
		double radius = scn.nextDouble();
		
		double area = Math.PI * radius * radius;  // πr²
		double circumference = 2 * Math.PI * radius;  //2πr
		
		System.out.println("Area of the circle  =" + area);
		System.out.println("Circumfernce of the  circle =" + circumference);
		scn.close();
	}

}

//11.	Write a program to find the Area and Circumference of a Circle.