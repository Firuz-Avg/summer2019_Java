package Trainings;

import java.util.Arrays;
import java.util.Collections;

public class KaradAndVowels {
	
	
	public static void main(String[] args) {
	
		String str = "Tajikistan";
		int count = 0;
		for(int i = 0; i <str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count ++;
			}
			
		}
	System.out.println(count);
	   
	
	for(int i = 2; i <10; i++) {
		for(int j = 1; j<= 10; j++ ) {
			int result = i*j;
			System.out.println(i+ " X " +j+ " = "+ result);
		}
	}
	
	
	
	
	}
	
	
	
}



 

