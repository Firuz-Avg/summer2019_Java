package day04_variables2;

public class PrimitiveDataTypes {

	/*Primitives: byte, short, int, long, float, double, boolean,char
	
	      Boolean: takes either true or false boolean expression
          Char:	declared with in the single quote '';  single character only.
          ''is a MUST when you give character 
	
	*/
	
	public static void main(String[] args) {
		  
		
		
		// boolesan result = Earth is Flat;
		// boolean num1 = 100; boolean only takes true or false results
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 =  9 > 3 ;
	
		
		System.out.println(result);   // true
		System.out.println(result2);  // false
		System.out.println(result3);  // true
		
		
		// char: 
		
		char char1 = 'a';
		
		System.out.println(char1);
		
		char char2 = '9';
		char char3 = '#';
		    
		
		// char with numbers 
		 char char4 = 67;
		 System.out.println( char4 );
		
		char char5 = 'C';
		
		
		// initializing char to other primitives: byte, short, int, long, float, double
		   char MyChar1        =        'b';
		   // Variablename              vlue
		   int MyInt = MyChar1; // the number that represents b is initialized to the int

		   System.out.println(MyInt);  //98
		   
//      byte Mybyte = MyChart1 ; // char's memory is 2byte, byte' memory is 1 bytes
		   byte MyByte2 = 'b';   // b's corresponding number is 98 from ASCII table
		   System.out.println( MyByte2 );
		
//     short ShortNum = Mychar1;  // char's memory is could be bigger than short, range is great
		   short ShortNum2 = 'b'; // b's corresponding number is 98 from ASCII table
		   System.out.println( ShortNum2 );
		
		   long LongNum = MyChar1;  // long's memory is 8 bytes
		   long LongNum2 = 'b';  // 98
		   System.out.println( LongNum );
		
		   float floatNum = MyChar1; 
		   float floatNum2 = 'b';
		   System.out.println(floatNum2);    // 98.0
		   
		   double doubleNum = MyChar1;
		   double doubleNum2 = 'b';
		   System.out.println(doubleNum2);   // 98.0
		   
		   // java is case sensitive: A does not equal to a
		   
		   char mycharValue = 1222;
		   System.out.println( mycharValue );
		   
		   
	}
	
	
	
	
	
	
	
	
	
}
