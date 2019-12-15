package Chapter5;
import java.util.ArrayList;

public class SimpleDotCom {
    //Define variables
    ArrayList<String> locationCells = new ArrayList<String>();
    private int numOfHits;

    //Check yourself method that takes user guess and determines if its a hit
    String checkYourself(String guess) {

        //Convert guess to int
        int nguess = Integer.parseInt(guess);

        //Create string to store result which will automatically be miss if nothing happens
        String result = "miss";

        //The for loop, basically check each item in the array and see if it matches
        for (String cell:locationCells) {

            int ncell = Integer.parseInt(cell);

            if (nguess == ncell) {
                numOfHits++;
                result = "hit";
                locationCells.remove(cell);
                break;
            }

        }

        //.length is a property of arrays which gets the length of the array
        if (numOfHits == 3) {

            result = "kill";

        }

        //Return the string result
        return result;

    }
}
