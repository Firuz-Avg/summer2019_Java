package day26_ForEach;

import java.util.Arrays;

public class ForEachMultidD {
	
	public static void main(String[] args) {
		
		// n dimensional array contains multiple (n-1) dimensional arrays
		
		int[] arr1D = {1,2,3,4};
		
		int[][] arr2D = { {1,2,3,4} , {5,6,7,8,9} };
		         //          0             1
		
		for(int i = 0; i < arr2D.length; i++) {
			                //    counts the 1D arrays
			for(int j = 0; j < arr2D[i].length; j++ ) {
			  System.out.print(arr2D[i][j]+" ");
			}
			
		}
		System.out.println();
	
		for(int[] each1: arr2D) {
			for(int each2 : each1) {
				System.out.print(each2+" ");
			}
		}
		
		System.out.println();
		
		String[][] str2D = { { "Bibish", "Seyfo" } , { "Seyfooo", "Julia" } };
		
		for(String[] each1DArrays : str2D) {
		//  	System.out.print(Arrays.toString(each1) );
			for(String EachValues : each1DArrays ) {
				System.out.print(EachValues+" ");
			}
			
		}
		
		System.out.println();
		
		int[][] num2D = { {1,2} , {3,4} };
		
		int [][][] num3D = { { {1,2} , {3,4}, } , { {5,6} , {7,8,9} }  };
		
		for(int[][] each2DArray : num3D) {
			// each2DArray: each 2 dimensional arrays that are contained with in the 3D arrays
			for(int[] each1DArray : each2DArray) {
				
				// each1DArray: each single dimensional that are contained within 2D arrays
				for(int eachValues : each1DArray) {
					
					// eachValues: each values that are contained with 1D arrays 
					System.out.print(eachValues+" ");
				}
			}
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}

}
