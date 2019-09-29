package Day03_Variables;

public class PrimitiveDataTypes {
	
	/* 
	 byte: we can assign whole numbers.  Must be with in   -128 <= byte <=127
	 
	 short: we can only assign whole number. Must be with in -32768 <= short <= 32767
	    
	 int: (used more often) we can only assign whole number. Must be in  -2147483648 <= int <=2147483648
	 
	 long: We can only assign whole number. Must be with in -9223372036854775808 <= long <= 9223372036854775808
	       at the end of value we can give l or L)
	   
	       byte < short < int < long
	       small one can be assigned to larger one
	    
	       the variable dataType must be larger in order to contain another data type
	     
	 float: We can assign decimals 
	        (must have f or F letter at the end)
	        
	  double (used more often): we can assign to decimals.
	   
	   float < double
	  */
	
	
	public static void main(String[] args) {
		
		byte length = 3; 
		System.out.println(length);
		
		byte width  = 4;
		System.out.println(width);
		
		// byte 9num=100 variable names must start with a-z, or A-Z
		
		byte num_and$ = 90;
		
	//	byte length =6; variable name is not unique
		   
		
	//	byte public = 199; variable name cannot be java reserved words
		  
		
	//  byte muNum1 = -129; out of byte' range
		
		byte variableName = 127;
		
	//	short num2 = &; We can only assign whole number
		
	//	short num3 = 100000;		 out of range

		
		int num4 = -100000000;
				
		// 100,000,000
		
		int num5 = 1_000_000_000;   // easier to read, (just like , in accounting
		
		
		long longnNumber =   10l;
		
	//  int intNumber =10l;
		 
		byte byteNumber =10;
		short shortNumber = byteNumber; 
		  
		short shortNumber2 =18;
	//  byte byteNumber2 = shortNumber2; short is greater than byte
		
		int intNumber = -19876;
		long longNumber2 = intNumber; // long is greater than int
	//  left side of the = has to be equal or greater than the right side of =	
		
		short shortNumber3 = -30000;
		short shortNumber4 = shortNumber3;
		System.out.println(shortNumber4);
		
	//	int  exapmpleNum1 = 10.5;
		float examplenum2 =10.5F;
		float exampleNum3 = 20.5f;
		
		double doubleNumber =10.5;
		  
		
		double doubleNumber2 = 30.5;
	//	float floatNumber = doubleNumber2; double data type is larger than float data type
		
		byte bNum = 10; 
		short sNum = 20;
		int iNum = 30;
		long lNum = 40;
	    System.out.println(bNum);  
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		
		System.out.println("======================");
		
		
		float fNum = bNum;
		float fNum2 = sNum;
		float fNum3 = iNum;
		float fNum4 = lNum;
		
		System.out.println(fNum);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum4);
		
		System.out.println("===============================");
		
		double dNum = bNum; 
		double dNum2 = sNum;
		double dNum3 = iNum;
		double dNum4 = lNum;
		
		System.out.println(dNum);
		System.out.println(dNum2);
		System.out.println(dNum3);
		System.out.println(dNum4);
	}
		
		
		
		
		
	}
	
	
	
