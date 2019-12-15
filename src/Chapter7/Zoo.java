package Chapter7;

public class Zoo {
    public Dog fido = new Dog(); // The usual way to create an object-reference variable
    public Animal simba = new Lion(); // Polymorphism, you can substitute a subclass for anything that expects the superclass that subclass extends

    public static Animal[] zoo = new Animal[4];

    public static void main (String[] args) {
        zoo [0] = new Animal();
        zoo [1] = new Dog();
        zoo [2] = new Lion();
        zoo [3] = new Hippo();
    }

    private void giveMedicine(Animal a) {
        a.makeNoise();
    }

    public void medicineTime() {
        Zoo zoo = new Zoo();
        Lion l = new Lion();
        zoo.giveMedicine(l);
    }

    //This method has the "final" modifier, which means it cannot be overriden
    public final void feedingTime() {
        System.out.println("It's feeding time!");
    }
}
