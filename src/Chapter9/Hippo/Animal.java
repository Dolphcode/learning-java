package Chapter9.Hippo;

public abstract class Animal {
	
	//Some instance variables for the abstract class
	private String sound;
	private int size;
	
	//Encapsulation stuff
	public int getSize() { return size; }
	public String getSound() { return sound; }
	public void setSize(int animalSize) { size = animalSize; }
	public void setSound(String animalSound) { sound = animalSound; }
	
	//A nice constructor, where's the no-arg constructor you ask
	//Here's a better question, what sound does an animal make?
	//How big is an animal?
	//There's no point in putting a no arg constructor because it doesn't make sense
	//It doesn't make sense for this superclass to be missing any arguments either
	public Animal(int animalSize, String animalSound) {
		sound = animalSound;
		size = animalSize;
	}
	
	public void makeSound() {
		for (int i = 0; i < size; i++) {
			System.out.println(sound);
		}
	}
	
}
