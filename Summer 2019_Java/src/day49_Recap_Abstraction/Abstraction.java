package day49_Recap_Abstraction;

public abstract class Abstraction {
	
	public abstract void startTheCar();
	
	
		
	

}

class Toyota extends Abstraction {
	
	// public abstract void startTheCar();
	
	@Override
	public void startTheCar() {
		System.out.println("Break");
		System.out.println("push the start button");
		System.out.println("Release the break");
		
		
	}
		
	public static void main(String[] args) {
	//	Abstraction obj = new Abstraction() {
			
			
				
	}
		
}

class Tesla extends Abstraction {
	  // regular class MUST implement the abstract method from the abstraction class 
	
	public void startTheCar() {
		System.out.println("voice control");
		System.out.println("drive");
	}
	
}
