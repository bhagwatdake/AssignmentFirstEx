package AssignmentFirstEx;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your name =");
		String name = scn.nextLine();
		
		System.out.println("Enter your age =");
		int age = scn.nextInt();
		
		System.out.println("your name is =" + name);
		System.out.println("your age is =" + age);
		
		scn.close();
	}

}


//2.	Write a program to take Name and Age as input and print them.

