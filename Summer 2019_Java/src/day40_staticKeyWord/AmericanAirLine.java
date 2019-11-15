package day40_staticKeyWord;

public class AmericanAirLine {
	
	public static void main(String[] args) {
		
		EmployeeInfo emrah = new EmployeeInfo();
            //  emrah.Name = "Emrah";   // private data is not visible outside the classes
		emrah.setName("Emrah");
		
	//	System.out.println(emrah.Name);  // // private data is not visible outside the classes
		
		System.out.println(emrah.getName() ); // emrah
		
		emrah.setSSN(1234546);
		System.out.println(emrah.getSSN() );
		
		emrah.setAge((byte)20);
		System.out.println(emrah.getAge());
		
		emrah.setSalary(120000);
		System.out.println(emrah.getSalary());
		
		System.out.println("===============================");
		   
		EmployeeInfo Shirin = new EmployeeInfo();
		      Shirin.setName("Shirin");
		      Shirin.setAge((byte)20);
		      Shirin.setSSN(777777);
		      Shirin.setSalary(2);
		
		System.out.println(Shirin.getName());
		System.out.println(Shirin.getSSN());
		System.out.println(Shirin.getAge());
		System.out.println(Shirin.getSalary());
		
		EmployeeInfo Rohan = new EmployeeInfo();
		   Rohan.setInfo("Rohan", 321456, (byte)34, 135000);
		   System.out.println(Rohan.getName());
		   System.out.println(Rohan.getSSN());
		   System.out.println(Rohan.getAge());
		   System.out.println(Rohan.getSalary());
		
	}

}
