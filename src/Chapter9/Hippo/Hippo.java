package Chapter9.Hippo;

public class Hippo extends Animal {
	
	//Okay so here's our no-arg constructor, but wait, what's this!?
	//So since Animal has no no-arg constructors we need to call the constructor in the Hippo's constructor
	//This is because Hippo extends Animal
	public Hippo(int size, String sound) {
		//You wouldn't do this to call the superclass's constructor
		//Animal(size, sound);
		//Instead do:
		super(size, sound);
	}
	
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("I'm a hippo by the way");
	}
	
	
}
