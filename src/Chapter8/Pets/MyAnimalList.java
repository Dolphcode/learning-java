package Chapter8.Pets;
//Let's put polymorphism into action
//Look at the addObject method, we made a list of objects, objects are the mother of all classes
//Everything extends object so making an array of objects allows you to place any object reference in it
//This comes with a cost, anything that goes into, for example and ArrayList of objects, comes out as an object
//A dog that comes out of an arraylist of objects is now an object and not a Dog
public class MyAnimalList {

  private Object[] objects = new Object[5];
  private Animal[] animals = new Animal[5];
  private int nextIndex = 0;
  private int nextIndex2 = 0;

  public void addObject(Object o) {
      if (nextIndex < objects.length) {
          objects[nextIndex] = o;
          System.out.println("Object added at " + nextIndex);
          nextIndex++;
      }
  }

  public void addAnimal(Animal a) {
      if (nextIndex2 < animals.length) {
          animals[nextIndex2] = a;
          System.out.println("Animal added at " + nextIndex2);
          nextIndex2++;
      }
  }

  public Object getObject(int index) {
      if (index < 5) {
          return objects[index];
      } else {
          return null;
      }
  }

  public Animal getAnimal(int index) {
      if (index < 5) {
          return animals[index];
      } else {
          return null;
      }
  }

}
