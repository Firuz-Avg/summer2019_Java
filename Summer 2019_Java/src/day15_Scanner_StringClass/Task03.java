package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task03 {
/*
Write a program that asks user to enter first name
 and then last name.At the end system should display user
  full name.	
	
*/	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you first name");
		   String firstName = input.nextLine();
		   
		   System.out.println("Enter your last name");
		String lastName = input.nextLine();
		
		String fullName = lastName+" "+firstName;
		
	System.out.println("Your full name is: "+fullName);
		
		
		input.close(); // gets rid of warning of the scanner class
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
