package Chapter1;
//Initialize the class Phraseomatic for fancy talking with the boss, like a boss B)
public class Phraseomatic {

  public static void main(String[] args) {

      //Make three sets of words(Use String[] because this signifies a list of strings) adding [] after a type says it is a list of this type
      String[] wordListOne = {"24/7", "multi-Tier", "30000 foor", "B-to-B", "win-win",
      "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

      String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
      "clustered", "branded", "outside-the-box", "positioned", "positioned", "networked", "focused",
      "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};

      String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
      "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

      //Find the amount of words in each list
      int oneLength = wordListOne.length;
      int twoLength = wordListTwo.length;
      int threeLength = wordListThree.length;

      //generate three random numbers, Math.random generates a random number between 0 and 1, (int) forces it to be an integer
      int rand1 = (int) (Math.random() * oneLength);
      int rand2 = (int) (Math.random() * twoLength);
      int rand3 = (int) (Math.random() * threeLength);

      //now build the phrase
      String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

      //and print it
      System.out.println("What we need is a " + phrase);
  }

}