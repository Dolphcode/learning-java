package Chapter8.Pets;
//Initialize the class
public class Cat extends Animal {

  //Override make noise method
  public void makeNoise() {
      super.makeNoise(); // Calls the version of make noise in the superclass then proceeds to do some other code, this allows you to add on to superclass methods rather than completely replacing them
      System.out.println("meow");
  }

}
