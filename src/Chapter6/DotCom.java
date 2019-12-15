package Chapter6;
import java.util.ArrayList;

//Initialize classes
public class DotCom {

  //Variables for name and the locations of the dot com
  private String name = "";
  private ArrayList<String> locationCells;

  //Set the name of the DotCom
  public void setName(String inputName) {
      name = inputName;
  }

  //Get the name of the DotCom
  public String getName() {
      return name;
  }

  public void setLocationCells(ArrayList<String> loc) {
      locationCells = loc;
  }

  public String checkYourself(String userInput) {

      String result = "miss";

      int index = locationCells.indexOf(userInput);
      if (index >= 0) {
          locationCells.remove(index);
          if (locationCells.isEmpty()) {
              result = "kill";
          } else {
              result = "hit";
          }
      }

      return result;

  }

}
