package day05_Recap;

public class Primitives_Review {
	
	
	/*
	   
	   	Primitives:
	   	         byte:     only takes whole numbers
	   	         short:    only takes whole numbers
	   	         int:     (used more often) only takes whole numbers
	   	         long:     only takes whole numbers
	   	         
	   	         float:    can take decimals (Must have F or f at the end)
	   	         double:   ( used more often):  can take decimals 
	   	         
	   	         boolean:  true or false boolean expression
	   	         char:     character within single quote ''
	   	                   also takes number
	   	                   
	  Range: double > float > long > int > short > byte
	  
	  */
	
	
	
	public static void main(String[] args) {
		
	//	System.out.println(bNum);  
		// Java application are executed from top to bottom
		
		// byte range: -128 to 127
		
	//	byte bNum = 126.5; // byte only takes whole number
		
		
		short sNum2 = 1000;
	//  short sNum = 126.5; // short only takes whole number
		
	//	bNum = sNum2; // short is greater than byte
		
		
	//	sNum2 = bNum;  // sNum = 127;
		System.out.println(sNum2);
		
		short sNum = 127;
    // byte 	bNum5 = sNum3;   // short > byte
			 
			int intNum =100;
	//		int intNum2 = 100.5 // int takes whole number
			
			System.out.println(intNum);
			
	//      byte ByteNum = intNum; //int > byte
	//      short ShortNum = intNum; // int > short
			
			short ShortNum2 = 105;
			intNum = ShortNum2;       //intNum =105
		
		
		System.out.println(intNum);  // 105
		
		
	// long:
		
		
		long LongNum = 100l;
		long LongNum2 =100L;
		
	// byte ByteNum3 = LomgNum;	
	// short ShortNum4 = 100l;	
	// int IntNum3 =100L;	      long > int, byte, short
		
		
		byte a=10;
		int b=30;
		short c=40;
		
		long LongNumber =a;
		long LongNumber2 =b;
		long LongNumber3 =c;
		
	// float:	
		
		float floatNumber = 10.5f;
		float floatNumber2 = 20.5F;
		
		short a1 =10; byte b1=20; long c1=30; int d1 = 40;
		
		float Floats = a1;
		float Floats2 = b1;
		float Floats3 = c1;
		float Floats4 = d1;
		
		System.out.println(Floats); // 10.0;
		
	// double: takes all the whole and decimal numbers
		   double DoubleNum1 = 10L;   // long is smaller than double
		
		double DoubleNum2 = 10.5F;
		
	//  boolean:
		         boolean result = true;
		         boolean result2 = false;
		
		
	// char:	         
		         
		         
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
