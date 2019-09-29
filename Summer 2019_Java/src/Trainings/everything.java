package Trainings;

import java.util.Scanner;

public class everything {

	
		public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Please enter a single digit number: ");
	        int pyramid = scan.nextInt();
	        System.out.println("");
	        for (int i = 1; i <= pyramid; i++) {
	            for (int j = 1; j <= pyramid - i; j++) {
	                System.out.print("  ");
	            }
	            for (int j = i; j >= 1; j--) {
	                System.out.print(" " + j);
	            }
	            for (int j = 2; j <= i; j++) {
	                System.out.print(" " + j);
	            }
	            
	            System.out.println(" ");
	        }
	        for (int i = 1; i <=pyramid ; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("  ");
	            }
	            for (int j = pyramid-i; j >= 1; j--) {
	                System.out.print(" " + j);
	            }
	            for (int j = 2; j <= pyramid-i; j++) {
	                System.out.print(" " + j);
	            }
	            
	            System.out.println(" ");
	        }
	        
	        
	        while(true) {
	            System.out.println("The best is: \n"
	                    + ""
	                    + "\n" + 
	                    "" + 
	                    "___  ____   _ _   _ _____ ___  ______ \n" + 
	                    "|  \\/  | | | | | | |_   _/ _ \\ | ___ \\\n" + 
	                    "| .  . | | | | |_| | | |/ /_\\ \\| |_/ /\n" + 
	                    "| |\\/| | | | |  _  | | ||  _  ||    / \n" + 
	                    "| |  | | |_| | | | | | || | | || |\\ \\ \n" + 
	                    "\\_|  |_/\\___/\\_| |_/ \\_/\\_| |_/\\_| \\_|\n" + 
	                    "                                      \n" + 
	                    "                                      \n" + 
	                    "\n" + 
	                    "");
	             }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    }
}
