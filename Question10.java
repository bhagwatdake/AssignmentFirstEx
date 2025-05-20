package AssignmentFirstEx;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		System.out.println("**Program Start**");
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter temperature in fahrenhit =");
		double fahrenheit = scn.nextDouble();
		
		double celsius =(fahrenheit - 32) * 5/9;
		
		System.out.println("Temperature in Celsius =" + celsius);
		
		scn.close();
		System.out.println("**Program Ends**");
	}

}
//10.	Write a program to convert Fahrenheit to Celsius.
