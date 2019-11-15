package day30_WrapperClass_ArrayList;

public class WrapperClassMethods {
	
	/*
	 * useful methods of Wrapper class: 
                Max_Value
                Min_Value
                parse methods
                ValueOfmethods

	
     */
	
	
	public static void main(String[] args) {
		
		// max_Value: return the maximum value of the primitive
		
		int maximum = Integer.MAX_VALUE;
		System.out.println(maximum);

		double maximumDouble = Double.MAX_VALUE;
		System.out.println(maximumDouble);
		
		byte maximumByte = Byte.MAX_VALUE;
		System.out.println(maximumByte);
		
		char maximumChar = Character.MAX_VALUE;
		System.out.println(maximumChar);
		
		char ch = 12324;
		System.out.println(ch);
		
  // min_Value: returns the minimum value of primitive
		
		int minimumInt = Integer.MIN_VALUE;
		System.out.println(minimumInt);
		
		byte minimumByte = Byte.MIN_VALUE;
		System.out.println(minimumByte);
		
		double minimumDouble = Double.MIN_VALUE;
		System.out.println(minimumDouble);
		
  // parsa methods: converts String values to  primitives, returns  primitives values
		
		     // parseInt("StrValue"): takes the String and converts the string to int primitive
		
		Integer num1 = Integer.parseInt("123"); // auto-boxing
		System.out.println(num1 +1 );
		
		int num2 = Integer.parseInt("125");  // none
		System.out.println(num2+1);
		
		// parseByte("StrValue"): take the string and converts the string value to Byte
		 
		         //    byte num3 = Byte.parseByte("198");   // out of range
		
		   byte num3 = Byte.parseByte("18");   // none
		    System.out.println(num3 +1);
		
		  Byte num4 = Byte.parseByte("18");   // auto-boxing
		  System.out.println(num4+1);
		
		// parseShort ("StrValue"): takes the string and converts it to short primitive value
		
		        short num5 = Short.parseShort("200");
		         System.out.println(num5+1);
		         
		         Short num6 = Short.parseShort("200");  // auto-boxing
		         System.out.println(num6+1);
		
		// parseLong: ("StrValue"): takes the string value and converts to long primitive
		         
		         
		      int num7 = (int)Long.parseLong("1222");
		         System.out.println(num7+1);
		         
		       long num8 = Long.parseLong("1222");
		       System.out.println(num8+1);
		         
		 // parseFloat("StrValue"): takes string value and converts it to float primitive      
		         
		        float num9 = Float.parseFloat("12.5"); // none
		         System.out.println(num9+1);
		         
		         Float num10 = Float.parseFloat("12.5f");  // Auto-boxing
		         System.out.println(num10+1);
		         
		       
		 // parseDouble("StrValue"): takes string value and converts it to double primitive        
		         
		       double num11 = (int)Double.parseDouble("8.5");  // none
		         System.out.println(num11 + 1);
		         
		        double num12 = Double.parseDouble("8.8");
		        System.out.println(num12+1);
		         
		         Double num13 = Double.parseDouble("8.5");
		         System.out.println(num13+1);
		         
		 // parseBoolean("StrValue"): takes string value and converts to boolean primitive        
		         
		      boolean A = Boolean.parseBoolean("Cybetek");
		                  // any string values other than true will return false
		      
		        System.out.println(A); 
		         
		        boolean B = Boolean.parseBoolean("TrUe"); // method ignores the case sensitivity
		        System.out.println(B);
		        
		        
		        boolean C = Boolean.parseBoolean("10>9");  // "10>9"  !="true"
		        System.out.println(C);
		        
		        
		        Boolean D = Boolean.parseBoolean("TrUe"); // Auto-boxing
		         System.out.println(D);
		         
		         
     //============================================================
		         
		         int a = 10;
		         double b = a;
		         
		     //    Double c = a;  // Double wrapper class is only Dedicated to double primitive
		         
		         
		        int A1 = Byte.parseByte("19");
		        Integer A2 = (int)Byte.parseByte("19");
		         
		         
		          Short A3 =  (short)Double.parseDouble("10.9");
		                
		        
		        int A5 =100;
		        Float A6 = (float)A5 ; // Float wrapper class is only dedicated to float primitive
		        
		        
		
		        
		        
		   // ValueOf method: converts String value to Wrapper class value, returns wrapper class value    
		        
		      int z = Integer.valueOf("1234"); // un-boxing
		      Integer z1 = Integer.valueOf("1234"); // none
		      
		      Integer z2 =(int)Integer.valueOf("1215"); // auto-boxing
		       
		         System.out.println(z2);
		         
		         
		         
		      boolean result1 = !Boolean.parseBoolean("TRUE"); // un-boxing
		        System.out.println(result1);     // ValueOfmethod ignores the case sensitivity
		         
		         
		        int totalNumber = 100;
		        String str3 = ""+totalNumber;  // none
		       
		         
		         
		         
	}
}
