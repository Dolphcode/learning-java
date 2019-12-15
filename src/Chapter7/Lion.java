package Chapter7;

public class Lion extends Animal {
    //Override animal's eat method
    public void eat() {
        System.out.println("The lion feasts on fresh gazelle");
    }

    //though the superclass has the roam method, we can overload it which has nothing to do with polymorphism, it's adding a method with the same method as that in a superclass
    //The return type can never be the only thing being changed
    public int roam(int roamHours) {
        return roamHours * 2;
    }

    public double roam(double roamHoursDbl) {
        return roamHoursDbl * 2.3D;
    }
}
