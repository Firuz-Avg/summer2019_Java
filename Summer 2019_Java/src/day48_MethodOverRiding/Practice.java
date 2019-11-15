package day48_MethodOverRiding;

class WebDriver {
	public void get() {
		System.out.println("Open Browser");
	}
	
}

class ChromeDriver extends WebDriver {
	
	@Override
	public void get() {
		System.out.println("Opens chrome browser");
	}
	
}

class FireFoxDriver extends WebDriver {
	
	@Override
	public void get() {
		System.out.println("Open firefox browser");
	}
	
}

public class Practice {
	
	public static void main(String[] args) {
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get();  // chrome browser
		
		FireFoxDriver driver2 = new FireFoxDriver();
		driver2.get();  // firefox browser
		
	}
}
