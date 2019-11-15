package day38_CustomClassContinue;

public class Employee {
	
	String Name;
	String ID;
	int age;
	int SSN;
	String JobTitle;
	double salary;
	
	public Employee(String Name, String ID, int age, int SSN, String jobTitle, double salary) {
		this.Name = Name;
		this.ID = ID;
		this.age = age;
		this.SSN = SSN;	
		this.JobTitle = JobTitle;
		this.salary = salary;
		
	}
	
	public void getInfo() {
		System.out.println("Employee' name is: "+Name);
		System.out.println("Social Security number is: "+SSN);
		System.out.println(" age is: "+age);
		System.out.println("Job title is: "+JobTitle);
		System.out.println("employee Id is: "+ID);
		System.out.println("Salary is: "+salary);
		
		System.out.println("----------------------------------");
	}
	
	

}
