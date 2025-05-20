package AssignmentFirstEx;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first Number =");
		int x = scn.nextInt();
		
		System.out.println("Enter second Number =");
		int y = scn.nextInt();
		
		int product = x * y;
		
		System.out.println("The product of =" + product);
		
		scn.close();
		
		System.out.println("**Program Ends**");
		
	}

}
//8.	Write a program to take two numbers as input, multiply them, and print the result.