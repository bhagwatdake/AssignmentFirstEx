package AssignmentFirstEx;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your age =");
		int age  = scn.nextInt();
		
		age = age + 1;
		
		System.out.println("your age next year will be =" + age);
		
		scn.close();
	}

}

//4.	Write a program to take Age as input, increment it by 1, and print the result.

