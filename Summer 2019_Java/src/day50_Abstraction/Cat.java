package day50_Abstraction;

public class Cat extends Animal {
	
	public Cat(char Gender, byte Age, String Color, String Nickname) {
		super(Gender, Age, Color, Nickname);
	}
	
	// Cat mycat = new Cat(Gender, Age, Color, Nickname);

	@Override
	public void Speak(String language) {
		System.out.println(Nickname + " Speaks " + language + " Language");
	}

	@Override
	public void Eat(String food) {
		System.out.println(Nickname + " Eats " + food);
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(Nickname + " Sleeps " + hour + " hours");
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(Nickname + " Drinks " + drinks);
	}

}

//class Dog extends Animal {
//
//	public Dog(char Gender, byte Age, String Color, String Nickname) {
//		super(Gender, Age, Color, Nickname);
//		
//	}
//
//	@Override
//	public void Speak() {
//		System.out.println("Dog speaks Russian");
//	}
//
//	@Override
//	public void Eat() {
//		System.out.println("Dog eats Sushi");
//	}
//
//	@Override
//	public void Sleep() {
//		System.out.println("Dog sleeps 8 hours ");
//	}
//
//	@Override
//	public void Drink() {
//		System.out.println("Dog drinks Pepsi");
//	}
//	
//}
//
//class Cow extends Animal {
//
//	public Cow(char Gender, byte Age, String Color, String Nickname) {
//		super(Gender, Age, Color, Nickname);
//	}
//
//	@Override
//	public void Speak() {
//		System.out.println("Cow speaks Chinese");
//	}
//
//	@Override
//	public void Eat() {
//		System.out.println("Cow eats Carrot Salad");
//	}
//
//	@Override
//	public void Sleep() {
//		System.out.println("Cow Sleeps 9 hours");
//	}
//
//	@Override
//	public void Drink() {
//		System.out.println("Cow drinks Vodka");
//		
//	}
//	
//}
	

