package Chapter5;
import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; //Import the ArrayList to utilize it

public class SimpleDotComGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Variable for number of guesses
        int numGuess = 0;

        //Variable for result to be stored
        String result;

        //Scanner necessary for user input
        Scanner myScanner = new Scanner(System.in);
        String coord;

        //Create the array for the locations based on some random number, scratch that, lets use an arrayList ae we can add and remove items
        int rand = (int) (Math.random() * 3);
        ArrayList<String> locations = new ArrayList<String>();
        locations.add(Integer.toString(rand));
        locations.add(Integer.toString(rand+1));
        locations.add(Integer.toString(rand+2));
        //int[] locations = {rand, rand+1, rand+2};

        //Make a SimpleDotCom object reference
        SimpleDotCom game = new SimpleDotCom();

        game.locationCells = locations;

        while (true) {

            //Gets user input and checks using checkYourself method
            System.out.println("Enter a number between 0 and 5 inclusive");
            coord = myScanner.nextLine();
            result = game.checkYourself(coord);

            //Does something based on results
            if (result == "miss" || result == "hit") {
                System.out.println(result + "!");
                numGuess++;
            } else {
                System.out.println(result + "! You've just sunk guess.com");
                numGuess++;
                break;
            }

        }
        myScanner.close();
        System.out.println("You completed the game in " + numGuess + " guesses!");
	}

}
