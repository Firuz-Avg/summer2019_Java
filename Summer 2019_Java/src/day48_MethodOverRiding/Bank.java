package day48_MethodOverRiding;

public class Bank {
	
	public void InterestRate() {
		System.out.println("9 percent");
	}
	
	public static void main(String[] args) {
		BankOfAmerica BOA = new BankOfAmerica();
		        BOA.InterestRate();  // 9
		        
		Chase Chase = new Chase();
		       Chase.InterestRate(); // 9 
		       
		CapitalOne co = new CapitalOne();  
		        co.InterestRate();   // 9
		        
		        
	}
	

}

class BankOfAmerica extends Bank {
	
	public void InterestRate() {
		System.out.println("5%");
	}
	
}

class Chase extends Bank {
	@Override
	public void InterestRate() {
		System.out.println("6%");
	}
	
//	@Override
//	public void print() {  the method not overriding // 888689886 Davlat
//		
//	}
	
}

class CapitalOne extends Bank {
	
	public void InterestRate() {
		System.out.println("4%");
	}
	
}
