package Chapter8.Instruments;

public class Bass extends StringInstrument implements Percussion{

    //Since percussion is an interface all of its methods must be overriden
    @Override
    public void slap() {
        System.out.println("slapp");
    }

}
