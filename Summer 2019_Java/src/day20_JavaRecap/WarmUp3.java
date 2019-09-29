package day20_JavaRecap;

import java.util.Scanner;

public class WarmUp3 {
	
	 /*	
	  4. write a program that asks user to enter number 10 times:
		1. find the maximum number and the minimum number
	 */	
		public static void main(String[] args) {
			
		Scanner scan= new Scanner(System.in);
		int max = -999999 ; // max = 1
		
	for(int i = 1; i <=5; i++) {
		System.out.println("Enter a number");
		int inputNum = scan.nextInt();   // 1 , -2
		if (inputNum > max) {
			max = inputNum;
		}
		
	}
	System.out.println("max value is:"+max);	
	
	
	
	
	
  }
	

}
