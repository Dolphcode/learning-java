package Chapter8.Botany;
//Initialize the class
public class ImmortalFern extends Plant {

  public void die() {
      super.die();
      System.out.println("Sike! The Immortal Fern cannot perish!");
  }

  //We had to override the method change, because it was abstract
  public void change() {
      System.out.println("It became a very angry fern");
  }

}
