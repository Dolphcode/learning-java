package Chapter1;
//Create the class
public class BeerSong {

  //Main method
  public static void main(String[] args) {

      //Define variables
      int bottles = 99;
      String word = "bottles";
      String word2 = "bottles";

      //While loop will keep running until bottles < 1
      while (bottles > 0) {

          if (bottles == 2) {
              word2 = "bottle";
          } else {
              word2 = "bottles";
          }

          if (bottles == 1) {
              word = "bottle";
          } else {
              word = "bottles";
          }

          System.out.println(bottles + " " + word + " of beer on the wall!");
          System.out.println(bottles + " " + word + " of beer!");
          System.out.println("You take one down");
          System.out.println("Pass it around");

          if (bottles > 1) {
              System.out.println((bottles - 1) + " " + word2 + " of beer on the wall!");
          } else {
              System.out.println("No more bottles of beer on the wall!");
          }

          //Line break
          System.out.println("");

          bottles = bottles - 1;

      }

  }

}