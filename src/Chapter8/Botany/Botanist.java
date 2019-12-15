package Chapter8.Botany;
//Initialize the class
public class Botanist {

  //The line of code below is illegal because of the abstract constructor in the class initialization
  //public Plant plant = new Plant();
  //However
  public Plant otherFern = new ImmortalFern(); // Legal because you're instantiating an Immortal Fern in a Plant type Object Reference

  public ImmortalFern fern = new ImmortalFern();
  public Daisy daisy = new Daisy();

}
