package AssignmentFirstEx;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your First Number =");
		int a = scn.nextInt();
		
		System.out.println("Enter your Second Number =");
		int b = scn.nextInt();
		
		System.out.println("Enter your Third Number =");
		int c  = scn.nextInt();
		
		int largest;
		
		if (a >= b && a>=c) {
			largest = a;
		} else if (b >= a && b >= c) {
			largest = b;
		} else {
			largest = c;
		}
		System.out.println("The Largest number is  =" + largest);
		
		scn.close();
	}

}


//5.	Write a program to find and print the largest of three numbers.
