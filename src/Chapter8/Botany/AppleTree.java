package Chapter8.Botany;
//This unfortunate apple tree has to implement all the abstract methods in tree and plant
public class AppleTree extends Tree {

  public void change() {
      System.out.println("It turned into a... whoa that's a pretty big plant!");
  }

  public void bearFruit() {
      System.out.println("What's this! An Apple!? What is an Apple?");
  }

}