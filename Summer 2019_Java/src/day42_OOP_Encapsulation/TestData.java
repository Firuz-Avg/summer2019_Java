package day42_OOP_Encapsulation;

public class TestData {
	
	/*
	 Name 
	 ID
	 */
	
	private String Name = "Enes";  // tha data is not visible to any other classes
	private int ID = 200;
	
// getter: Read the data
	public String getName() {   // read the private data only 
		return Name;
	}	
	
	public int getID() {
		return ID;
	}

	
// setter: Change the value	// or modify the data same
	public void setName(String Name) {
		this.Name = Name;
		
	}
	
//	public String setName(String str) {
//		Name = str;
//		return Name;   // add return if we change void to String
//	}
	
	public void setID(int ID) {
		this.ID = ID;
		
	}
	
		
}
