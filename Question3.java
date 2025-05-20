package AssignmentFirstEx;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter User ID =");
		String UserId =scn.nextLine();
		
		if(UserId.equals("j456")) {
			String name = "Jake";
			int age = 26;
			System.out.println("User ID matched .");
			System.out.println("Name = " +name);
			System.out.println("Age =" +age);
		} else {
			System.out.println("User ID does not match");
		}
		scn.close();
	}

}


//3.	Write a program to take User ID as input and print Jake's name & age if the ID matches.