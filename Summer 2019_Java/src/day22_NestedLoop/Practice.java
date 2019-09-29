package day22_NestedLoop;

public class Practice {
	
	/*
	        *
	        **
	        ***
	        ****
	        *****
	        
	 */
	
	
	public static void main(String[] args) {
		
	for (int j = 1; j <= 7; j++) {	
		
		for (int i = 1; i <= j; i ++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
		
	System.out.println("\n\n");
	
	
for (int x = 7; x >= 0; x--) {	
		
		for (int y = 1; y <= x; y ++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
}
