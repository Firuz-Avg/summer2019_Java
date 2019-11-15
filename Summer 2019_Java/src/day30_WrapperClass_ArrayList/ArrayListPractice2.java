package day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice2 {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i <= 30; i++) {
			if(i %2 != 0 ) {
				continue;
			}		
		        list.add(i);
		
		}	
		System.out.println(list);
		
		System.out.println(list.size() );
		
		System.out.println(list.get(4));
		
		for (int i =0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		for( int each : list ) { // un-boxing
			System.out.print(each + " ");
		}
		System.out.println();
		
		int num = list.get(7);  // un-boxing, there is no primitives in ArrayList
		
		System.out.println(num);
		
//		list.clear();  // m size of list become 0:  []
//		
//		System.out.println(list.get(2));
		
		
		// sorting the ArrayList:
		     Collections.sort(list);
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i=20; i >=0; i--) {
		list2.add(i);
		}
		System.out.println(list2);
		
		// sorting the ArrayList:
		Collections.sort(list2);
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
