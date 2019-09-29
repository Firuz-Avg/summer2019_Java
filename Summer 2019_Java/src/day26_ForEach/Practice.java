package day26_ForEach;

public class Practice {
	
	public static void main(String[] args) {
		
		RemoveDuplicat("aabbcccccddddaaa");
		
		
	}
	
	
	
	public static void RemoveDuplicat(String str) {
		
		String result ="";
		for( int i = 0; i < str.length(); i++) {
			if(! result.contains(str.substring(i, i+1))) {
				result += str.substring(i, i+1);
			}
		}
		System.out.println(result);
		
		
	}
   
	
	
	
	
	
	
}
