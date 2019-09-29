package day07_Unary_ShortHand;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
	         System.out.println( 12.8/3L);	
		     System.out.println( 10.5 % 3);
		
		
		/*
		      +:   positive
		      -:   negative
		      ++:  increment
		      --:  decrement
		      
		  for + & - :    
		      + - ===> -
		      - - ===> +
		      + + ===> +
		      - + ===> -
		      
		      
		*/
		
		int a = 10;
		int b = -a;
		System.out.println(b);
		
		int c = +b;   // + (-10) ==> -10
		System.out.println(c);
		
		int d = -c;
		System.out.println(d);  // - (-10) ==> 10
		
		int f = - (10);
		System.out.println(f);
		
		// increment: increases the value by 1.
		
		   //   increment are : 
		               //     1. pre increment
		                          
		               //     2. post increment
		// decrement: decrease  the value by 1.
		
		
		// increment:
		// pre increment: operator is placed before the variable; by one imediatelly
		 int num1= 100;
		 
		System.out.println( ++num1 ); // num1+1
		
		int num2 = ++num1;    // ++(101)  ==> 102
		
		System.out.println(num2);
		
		// post increment: operator is placed after the variable;
		  int IntNum = 100;
		  
		  System.out.println(IntNum ++);  // 100
		  System.out.println(IntNum);     // 101
		
		  int IntNum2 = IntNum ++ ; // IntNum2 = 101
		  // IntNum2 = 101
		  
		  System.out.println(IntNum2);
		  
		  System.out.println(IntNum );   // 102
		  
		  
		  int x = 100;
		  int y = x++ -1;
		  //   y = 100 - 1;
		System.out.println(y);
		
		// decrement: decreases the value by 1
		         // pre-decrement: operator is placed before the variable
		         // decreases the value by 1 imediatelly 
		
		int Z = 100;
		 
		System.out.println(-- Z);  // 99
		
		
		// Post-decrement: operator is placed after the variable 
		     // it will pass current value and then decrease by 1
		
		int Y = 95;
		
	 System.out.println( Y -- );  // 95
		System.out.println(Y);    // 94
		
		int T = 25;
		System.out.println( ++ T);  // 26
		System.out.println( -- T);  // 25
		
		int P = 50;
		P = --P + P++ + P-- + P++;
		// pre    post  post  post
		// 49  +  49  + 50  + 49 
		
		 System.out.println( P );  // 197
		
		short S = 4;  // 3
		int R = S * 4 - S--;
		//           16   -  4   = 12
		System.out.println(R);  // 12
		System.out.println(S);
		
		int W = 1;
		 W = - W-- + W++ / -W-- * --W ;
		//    post  post   post   pree
		//   -1  +  0   / 	-1  *  -1
		 //  -1 + 0 * -1
		 //  -1 + 0
		 //  -1
		 
		   System.out.println(W);
		 
		 
		 
		 
		 
		 
	}
	
	

}
