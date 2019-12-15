package Chapter8.Botany;
//Initialize class, now this is interesting, you'll see the daisy and fern subclass and it makes sense to make a daisy and a fern
//But what does a plant look like? There aren't many specifics
//If you want the prevent someone from insantiating the class, we can add the abstract constructor to it
public abstract class Plant {

  public int leaves;
  public String name;
  public String color;

  public void grow() {
      System.out.println("Grow my child!");
  }

  public void die() {
      System.out.println(":(");
  }

  //A normal change method may not make sense because different plants change in different ways
  //An abstract method means it must be overridden like an abstract class must be extended
  //Keep in mind abstract methods can only be made in abstract classes
  public abstract void change();

}
