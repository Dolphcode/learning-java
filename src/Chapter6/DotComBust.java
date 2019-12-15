package Chapter6;
import java.util.ArrayList;

//Initialize Class
public class DotComBust {

  //Create Game Helper, List of Dot Coms, and variable for number of guesses
  private GameHelper gh = new GameHelper();
  private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>(3);
  private int numOfGuesses = 0;

  private void setUpGame() {
      //Make some dot coms and give them locations
      DotCom one = new DotCom();
      one.setName("Pets.com");
      DotCom two = new DotCom();
      two.setName("eToys.com");
      DotCom three = new DotCom();
      three.setName("Go2.com");
      dotComsList.add(one);
      dotComsList.add(two);
      dotComsList.add(three);

      //Instructions for user
      System.out.println("Your goal is to sink three dot coms.");
      System.out.println("Pets.com, eToys.com, Go2.com");
      System.out.println("Try to sink them all in the fewest number of guesses");

      //For loop which iterates through each dotCom in dotComsList
      for (DotCom dotComToSet:dotComsList) {
          ArrayList<String> newLocation = gh.placeDotCom(3); // Get locations of dotcoms
          dotComToSet.setLocationCells(newLocation); // Set those locations
      }
  }

  private void startPlaying() {
      //While loop which runs while the dotComsList is not yet empty
      while(!dotComsList.isEmpty()) {
          String userGuess = gh.getUserInput("Enter a guess"); // Get user guess
          checkUserGuess(userGuess); // Check user guess
      }
      finishGame(); //Finish the game once the list is empty
  }

  private void checkUserGuess(String userGuess) {

      numOfGuesses++; //Add to the number of guesses the user made
      String result = "miss"; // Automatically set the result to guess
      String msg = "Gosh darn! You missed!"; // Set the display message

      //For loop iterates through each dotCom in dotComsList
      for (DotCom dotComToTest:dotComsList) {
          result = dotComToTest.checkYourself(userGuess); // Set result to whatever we get from the checkYourself method of dotCom
          //If the result is hit, we break out of the loop
          if (result.equals("hit")) {
              msg = "You've hit a Dot Com! But which one?";
              break;
          }
          //If the result is kill, we remove the dotcom from the list and then break out of the loop
          if (result.equals("kill")) {
              msg = "Whoa! You've killed " + dotComToTest.getName();
              dotComsList.remove(dotComToTest);
              break;
          }
      }
      System.out.println(msg); // Print the result for the user

  }

  //Finish game notifies user that he/she won and tells how many guesses along with some victory banter
  private void finishGame() {
      System.out.println("All dot coms are dead! your stock is now worthless");
      if (numOfGuesses <= 18) {
          System.out.println("It only took you " + numOfGuesses + " guesses");
          System.out.println("You got out before your options sank");
      } else {
          System.out.println("Took you long enough, " + numOfGuesses + " guesses.");
          System.out.println("Fish are dancing with your options.");
      }
  }

  public static void main (String[] args) {
      DotComBust game = new DotComBust(); // Make a new DotComBust
      game.setUpGame(); // Set up the game
      game.startPlaying(); // Start playing
  }

}
