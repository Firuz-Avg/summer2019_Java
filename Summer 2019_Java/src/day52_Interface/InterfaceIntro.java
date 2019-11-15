package day52_Interface;

public interface InterfaceIntro {
	
//	public InterfaceIntro() { } interface cannot have constructor
	
//	public void methodB() { }
	
	public default void methodC() {
		
	}
	
	public abstract void methodA();
	
	public static void mm() {
		
	}
	
	

}

interface Data{
	
}

class Test implements InterfaceIntro, Data{
//    subtype        supertype      supertype
	
	@Override
	public void methodA() {
		
	}
	
}
