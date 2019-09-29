package day20_JavaRecap;

import java.util.Scanner;

public class WarmUp4 {
	
	public static void main(String[] args) {
		
	
	
	Scanner scan= new Scanner(System.in);
	int min = 99999 ; // min = 1
	
for(int i = 1; i <=5; i++) {
	System.out.println("Enter a number");
	int inputNum = scan.nextInt();   // 1 , -2
	if (inputNum < min) {
		min = inputNum;
	}
	
}
System.out.println("min value is:"+min);	

	}
}
