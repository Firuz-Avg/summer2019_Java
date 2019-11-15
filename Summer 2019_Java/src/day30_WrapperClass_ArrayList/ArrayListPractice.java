package day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
	public static void main(String[] args) {
		
	
	
	ArrayList<String> nameList = new ArrayList<>();
	        
	// add method: 
	              nameList.add("Homayra");
	              nameList.add("Apple");
	              
	         System.out.println(nameList);     
	            
	         /*
	             create an ArrayList called studentNames 
	             create scanner object called scan
	              
	         */    
	              
	      ArrayList<String> studentNames = new ArrayList<>();     
	           Scanner scan = new Scanner(System.in);
	           
	           while(true) {
	         System.out.println("Enter name");
	         String name = scan.nextLine();
	             studentNames.add(name);
	             
	         System.out.println("do you want to add another name");
	         String answer = scan.nextLine().toLowerCase();
	         if ( !(answer.equals("yes") || answer.contentEquals("no") ) ){
	        	 System.out.println("Invalid");
	        	 break;
	         }
	         
	         if (answer.equals("no") ) {
	        	 break;
	         }
	         
	        }     
	         System.out.println(studentNames);
	         
	         
	              
	              
	              
	              
	              
	              
	}
}
