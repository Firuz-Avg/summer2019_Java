package Trainings;
import java.util.*;
public class King_Dain2 {

	
	
	  public static void main(String[] args) {
  
		  // firstname Firuz
		  //lastname Avganov
		  
//		  
//		  Scanner scan = new Scanner (System.in);
//		 System.out.println("Enter your first name");
//	     String firstname = scan.nextLine();
//	            firstname = firstname.substring(0,1).toUpperCase()
//	            		+ firstname.substring(4).toLowerCase();
//	     
//	   System.out.println("Enter your last name");
//	            String lastName = scan.nextLine();
//	            lastName = lastName.substring(0,1).toUpperCase()
//	            		+ lastName.substring(6).toLowerCase();
//	            
//	            System.out.println(firstname+ " "+ lastName);
	            
//	
//	       Scanner scan1 = new Scanner (System.in);
//	      
//	       String city = "Lagrange is a baeutiful city";
//	       int num =city.indexOf("c");
//	           System.out.println(num);   
//	            
//	         String room = "I love this fucking room ";
//	         char ch1 = room.charAt(3);
//	         System.out.println("char at 1 index  is:"+ch1);
//	         
//	        char ch2 = room.charAt(5);
//	        System.out.println("char at 5 index is: "+ch2);
//	        
		  Scanner scan = new Scanner(System.in);
	        System.out.println("Enter your string here: "); 
		  
		  String str = scan.nextLine();
	        String Hi="hi";
	        String temp[] = str.split(" ");
	        int numHi =0;
	        for (int i = 0; i < temp.length; i++) {
	            if(Hi.equals(temp[i]))
	                numHi++;
	        }
	        System.out.println("The string is: " + str);
	        System.out.println("The word " + "\"hi\" occurs " + numHi + " times in this string.");
	     
		  
		  
		  
	  }	
}
