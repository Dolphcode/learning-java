package Chapter4.Dog;

public class DogTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Create several doggos
        Dog Fido = new Dog();
        Fido.size = 70;

        Dog Spike = new Dog();
        Spike.size = 8;

        Dog Banana = new Dog();
        Banana.size = 35;

        //What if we put the dogs in an array
        Dog[] dogs = new Dog[3];

        //Placing the references into the dog array
        dogs[0] = Fido;
        dogs[1] = Spike;
        dogs[2] = Banana;

        //Look the dogs are barking!
        dogs[0].bark(1);
        dogs[1].bark(2);
        dogs[2].bark(3);

        //Does anybody need to take a dump
        System.out.println("Does Fido need to go #2? " + dogs[0].isPooping());
        System.out.println("Does Spike need to go #2? " + dogs[1].isPooping());
        System.out.println("Does Banana need to go #2? " + dogs[2].isPooping());
	}

}
