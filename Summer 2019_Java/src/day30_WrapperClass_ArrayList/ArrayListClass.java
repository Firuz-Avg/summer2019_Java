package day30_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		/*
		
		Declaration of ArrayList:
                 ArrayList<Integer> List = new ArrayList<>();
		
		          ArrayList<Integer> List2 = new Arraylist<Integer>();
		 
		
		*/
		
		int[] array1 = new int[1];
		
		ArrayList<Integer> List = new ArrayList<>();
		
		ArrayList<Integer> List2 = new ArrayList<Integer>();
		                 List2.add( 10 );  // Auto-boxing
		                 List2.add( 20 );
		                 List2.add( 30 );
		                 // [10, 20, 30]
		 // index:            0   1   2                
		
		
		System.out.println(List2);
		System.out.println(List2.get(1));  // 20
	//	System.out.println(List2.get(9));  // maximum index number is 2
		
		
	System.out.println(List2.size() );  // 3
		
		List2.clear();
		System.out.println(List2);
		
		System.out.println(List2.size() );
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
