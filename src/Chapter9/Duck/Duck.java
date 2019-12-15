package Chapter9.Duck;

public class Duck {
	
	//Private instance variables for encapsulation, no biggie
	private int size;
	private int age;
	private String name;
	
	//What's this! It doesn't look like a method
	//It's actually a constructor, something used to construct the class
	//This is a no-arg constructor and we can actually set our defaults in here
	//Constructors must have different argument types
	//Two constructors cannot have one int arg even if they are different arguments for different purposes
	public Duck() {
		size = 27;
		age = 2;
		name = "Ducky";
	}
	
	//This constructor has arguments, this one is for when the programmer knows the size and age but not the name
	public Duck(int duckAge, int duckSize) {
		age = duckAge;
		size = duckSize;
		name = "Ducky";
	}
	
	//This constructor is for when the programmer knows the name but not the size or age
	public Duck(String duckName) {
		
		age = 2;
		size = 27;
		name = duckName;
	}
	
	//This is if the programmer knows everything, Mr. Knowitall
	public Duck(int duckAge, int duckSize, String duckName) {
		age = duckAge;
		size = duckSize;
		name = duckName;
	}
	
	//Encapulation stuff
	public int getAge() { return age; }
	public int getSize() { return size; }
	public String getName() { return name; }
	public void setAge(int duckAge) { age = duckAge; }
	public void setSize(int duckSize) { size = duckSize; }
	public void setName(String duckName) { name = duckName; }
	
	// Just a simple method here, not much really
	/**
	 * This is a method within the duck class which forces a poor duck somewhere in your computer to quack
	 * The Quack methode depends on the age and size instance variables
	 */
	public void quack() {
		String msg = name + ": Q";
		for(int i = 0; i < age;i++) {
			msg = msg + "u";
		}
		for(int i = 0;i < size;i++) {
			msg = msg + "a";
		}
		msg = msg + "ck";
		System.out.println(msg);
	}
	
}
