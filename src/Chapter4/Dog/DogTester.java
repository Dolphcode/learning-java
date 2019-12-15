package Chapter4.Dog;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Create several doggos
        Dog Fido = new Dog();
        Fido.size = 70;

        Dog Spike = new Dog();
        Spike.size = 8;

        Dog Banana = new Dog();
        Banana.size = 35;

        //Look the dogs are barking!
        Fido.bark(1);
        Spike.bark(2);
        Banana.bark(3);

        //Does anybody need to take a dump
        System.out.println("Does Fido need to go #2? " + Fido.isPooping());
        System.out.println("Does Spike need to go #2? " + Spike.isPooping());
        System.out.println("Does Banana need to go #2? " + Banana.isPooping());
	}

}
