package Chapter11.Exceptions;

/**
 * @author basti
 * A very evil class that does evil things
 */
public class EvilClass {
	
	// Instance variables
	int evilNumber;
	
	// Constructor
	public EvilClass() {
		System.out.println("I am evil and I have been born!");
		evilNumber = (int) (Math.random() * 100.0);
	}
	
	// Risky method
	// The "throws exception" means this class can throw an exception and one must be careful with it
	/**
	 * A very evil method done by a very evil class, he's evil. that's all there is to it
	 * @throws Exception - Because this is an evil method he will throw an exception when he wishes
	 */
	public void takeRisk() throws Exception {
		evilNumber = (int) (Math.random() * 100.0);
		if (evilNumber > 25 && evilNumber < 75) {
			throw new Exception("Buahahaha! My exception!");
		} else {
			System.out.println("Too lazy to do evil deed right now, I'm gonna take a nap");
		}
	}
	
	// Method
	public void evilLaugh() {
		System.out.println("Haha! I win!");
	}
}
