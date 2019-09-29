
package Trainings;

import java.util.Scanner;


public class TORRIN {
	
	
	public static void main(String[] args) {
		
//	   
//	   String seasons ="";
//	   
//	if (seasons == "Spring") {
//		   System.out.println("March, April, May");
//	   }
//	else if (seasons == "Summer") {
//		System.out.println("june, july, august");
//	
//	}else if (seasons == "Autumn") {
//		System.out.println("September, october, November");
//		
//	}else if (seasons == "Winter") {
//		System.out.println("December, January, february");
//	}
	         
	  
//		String actualUsername = "ABC";
//		String actualPassword = "123";
//		
//		String expectedUserName="abc";
//		String expectedPassword="123";
//		
//		
//		
//		
//		
//		
//		if (actualUsername==expectedUserName && actualPassword==expectedPassword) {
//			System.out.println("You Successfully logged in ");
//			
//		} else if (actualUsername != expectedUserName  && actualPassword != expectedPassword) {
//			System.out.println("You entered invalid username and invalid password");
//		}
//		else if (actualUsername != expectedUserName && actualPassword==expectedPassword ) {
//			System.out.println("You entered Invalid username ");
//		}else if (actualPassword != expectedPassword) {
//			System.out.println("You entered invalid password");
//			
//		}
		
//		
//		Scanner scan= new Scanner(System.in);
//		int min = 99999 ; // min = 1
//		
//	for(int i = 1; i <=5; i++) {
//		System.out.println("Enter a number");
//		int inputNum = scan.nextInt();   // 1 , -2
//		if (inputNum < min) {
//			min = inputNum;
//		}
//		
//	}
//	System.out.println("min value is:"+min);	
//	
//		
        
	    
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter an email: ");
	    String email = scan.next();
	    String emailId = email.substring(0, email.indexOf("@"));
	    String domain = email.substring(email.indexOf("@")+1, email.length());
	    System.out.println("Email is: " + email);
	    System.out.println("email id is: " + emailId);
	    System.out.println("domail is: " + domain);
		  	
		  	
		  	
	    
	    }
	 }

	

