package AssignmentFirstEx;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first Number =");
		int x = scn.nextInt();
		
		System.out.println("Enter second Number =");
		int y = scn.nextInt();
		
		int difference = x-y;
		
		System.out.println("difference of two number =" + difference);
		
		scn.close();
		
		System.out.println("**Program Ends**");
		
	}

}
//	9.	Write a program to take two numbers as input, subtract them, and print the difference.