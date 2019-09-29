package day26_ForEach;

import java.util.Arrays;

public class ForEach {
	
	public static void main(String[] args) {
		
		/*
		   syntax:
		            for(DataType each: ArrayName){
		            
		        }
		*/
		
		int[] arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
		//	arr[i] = arr[i]+1;
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		System.out.println("===============");
		for (int each : arr) {
			System.out.print(each);
		}
		
		System.out.println();
		
		String[] str1 = {"A", "B", "C", "D", "E", "F"};	// length +1 (no)	
		for (String each : str1) {
			System.out.print(each);
		}
		
		System.out.println();
		
		char[] ch = {'z', 'x', 'y', 'c', 'a', 'b'};
		Arrays.sort (ch);
		for(char each : ch) {
			System.out.print(each);
		}
		
		System.out.println();
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		
		for (int each : arr1) {
		      if(each %2 != 0)  	
		
			
			System.out.print(each+" ");
		}
		
		System.out.println();
		
		
		// print out 1 ~ 1000: we cannot use for each loop
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
