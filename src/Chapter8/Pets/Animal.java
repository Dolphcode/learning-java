package Chapter8.Pets;
//Initialize the class
public class Animal {

  //Instance variables, encapsulation will not be necessary for now because this is just a sample
  public String food;
  public int hunger;

  //Make noise method
  public void makeNoise() {
      System.out.println("The animal is making noise");
  }

  //Eat method
  public void eat() {
      System.out.println("The animal is eating food");
  }

  //Sleep method
  public void sleep() {
      System.out.println("zzzzzz... the animal is sleeping, he sleeps for about 5 hours.");
  }

  //Roam method
  public void roam() {
      System.out.println("The animal roams for about a half an hour");
  }

}
