package day50_Abstraction;

public class Zoo {
	
	public static void main(String[] args) {
		
		Cat  Cleo  =  new  Cat('M', (byte)5, "Blue", "Eagle");
//		System.out.println("Nickname is: " + obj.Nickname); // Eagle
//		System.out.println("Gender is: " + obj.Gender);
//		System.out.println("Color is: " + obj.Color);
//		System.out.println("Age is: " + obj.Age);
		
		
		
		Cleo.getInfo();
		
		
		
		Cat Misha = new Cat('F', (byte)6, "Black", "Misha");
		Misha.getInfo();
		Misha.Sleep(15);
		Misha.Eat("Chicken");
		Misha.Drink("Water");
		Misha.Speak("Meow");
		
		System.out.println("\n======================");
		
		Dog Tarzan = new Dog('M', (byte)2, "Brown", "Tarzan");
		Tarzan.getInfo();
		Tarzan.Speak("Tajik");
		Tarzan.Eat("Bone");
		Tarzan.Drink("Water");
		Tarzan.Sleep(8);
		
		System.out.println("\n======================");
		
		Dog Tuzik = new Dog('M', (byte)12, "Black", "Tuzik");
		Tuzik.getInfo();
		Tuzik.Drink("Redbull");
		Tuzik.Eat("Hotdog");
		Tuzik.Sleep(10);
		Tuzik.Speak("Kyrgyz woof");
		
		System.out.println("\n======================");
		
		Dog[] dog = {Tarzan, Tuzik};
		Cat[] cat = {Cleo, Misha};
		
		dog[1].getInfo();
		
		
		/*
		 
		 abstract class Countries:
		         Data: name, flag, language, population, religion, rivals, capital city...
		         
		         constructor that can set all those data
		         
		         Actions (abstract): exports(parameter), imports(parameter),
		         		              economy(parameter my choice), currency()...
		         
	             sub class:  
		                  South Korea
		                  USA
		                  Kazakhistan
		                  New Zealand
		                  Russia
		                  Turkey
		                   .......		              
		 */
		
		
		
	}

}
