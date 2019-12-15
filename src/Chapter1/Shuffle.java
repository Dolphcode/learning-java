package Chapter1;

//Initialize the class
public class Shuffle {

  public static void main(String[] args) {

      //Define variables
      int x = 3;

      //Run this while x > 0
      while (x > 0) {

          //If x > 2 print "a"
          if (x > 2) {
              System.out.print("a");
          }

          //If x == 2 print "b c"
          if (x == 2) {
              System.out.print("b c");
          }

          //If x == 1 print "d"
          if (x == 1) {
              System.out.print("d");
          }

          //decrease x by 1
          x = x - 1;

          //Print a hyphen
          if (x > 0) {
              System.out.print("-");
          }

      }
  }

}
