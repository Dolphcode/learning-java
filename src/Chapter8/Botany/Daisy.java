package Chapter8.Botany;
//Initialize the class
public class Daisy extends Plant {
  //We had to override the method change, because it was abstract
  public void change() {
      System.out.println("It became a very zen daisy");
  }
}
