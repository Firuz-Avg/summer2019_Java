package day46_SuperKeyword;

class A {
	String name ="Madina";
	
	public void methodA() {
		
	}
	public A(int a) {
		
	}
	
}

public class SuperKeyWord extends A{
	//          sub             super
	
	public SuperKeyWord(int a) {
		super(10); // siper class constructor Must be called in the sub class
		
	}
	
	/*
	  String name = "Madina";
	 */
	
	public void method() {
		super.name = "Mahir";
		this.name = "Ishan";
		super.methodA();
		this.methodA();
		
	}

}
