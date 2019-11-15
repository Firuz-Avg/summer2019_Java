package day47_JavaReview;

import Inheritance_Trasining.main;

class Mehmet {
	
	public Mehmet() {
		System.out.println("Mehmet");
	}
	
}

class Resul extends Mehmet {
	
	public Resul() {
		// super()  // Mehmet
		System.out.println("Resul");
	}
	
	
}

class Victoria extends Resul {
	
	public Victoria() {
		   // super();
		System.out.println("Victoria");
	}
	
	
}



public class Constructors {
	
	public static void main(String[] args) {
		
		Victoria obj = new Victoria();
		
		
	}

}
