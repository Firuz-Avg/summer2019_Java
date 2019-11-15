package day29_ReturnMethods;

import java.util.Arrays;

public class MethodOverLoading {
	
	// overloading: same method name, different parameters
	
	public static void main(String[] args) {
		int result = sum(10, 20);
		System.out.println(result);
		
		System.out.println(sum(10,20,30) );
		
		System.out.println(sum(0.5, 10.5) );
	/*	
		overload method example: the sort methods of Arrays class,
		        it accepts all data type
	*/	
		
		int[] arr = {1,2,3,4,5};
		Sort(arr);   // 5 4 3 2 1
		
		char[] ch = {'a', 'b', 'c' };
		Sort(ch);
		
		String[] str = {"A", "B", "C","D"}; // {D, C, B, A}
		Sort(str);
		
		
	}
	
	
	
	
	
	public static int sum (int a, int b) {
		return a+b;
	}
	
	public static int sum (int a, int b, int c) {
		//                        long
		return a + (int) b + c;
		//       int because of long
	}
	
//	public static double sum(int a, int b) { // parameters MUST be different
//		return a+b;
	
	
	public static double sum(double a, double b) {
		return a+b;
	}
	
	// wrtie a method called sort, that can sort an int array in descending order 
	public static void Sort(int[] arr) {
		                  //  {1,2,3,4,5};
		Arrays.sort(arr);
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void Sort(char[] arr) {
        //  {1,2,3,4,5};
       Arrays.sort(arr);
       for(int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }
	
	public static void Sort(String[] arr) {
		 Arrays.sort(arr);
	       for(int i = arr.length-1; i>=0; i--) {
	            System.out.print(arr[i]+" ");
	        }
	       System.out.println();
	}

	
	
}
