package Chapter8.Pets;
//All classes extend Object, Object is the mother of all classes
public class AnimalTestDrive {
  public static void main (String[] args) {
      MyAnimalList list = new MyAnimalList();
      Dog a = new Dog();
      Cat c = new Cat();
      list.addAnimal(a);
      list.addAnimal(c);
      list.addObject(a);
      list.addObject(c);

      //Should be a cat right! Not so fast, remember, it came back to us as an object, we have to cast it back to a cat first
      Object myCatObject = list.getObject(1);
      Cat myCat = (Cat) myCatObject; // Perfect!
      myCat.makeNoise();
  }
}