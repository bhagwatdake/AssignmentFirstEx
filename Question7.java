package AssignmentFirstEx;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = scn.nextInt();
		
		System.out.println("Enter second number");
		int b = scn.nextInt();
		
		int sum = a + b;
		
		System.out.println("The sum is  =" + sum );
		scn.close();
	}

}
//7.	Write a program to take two numbers as input, add them, and print the sum.
