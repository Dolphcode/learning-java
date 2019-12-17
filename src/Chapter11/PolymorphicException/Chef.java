package Chapter11.PolymorphicException;

import Chapter11.CustomExceptions.PepperException;
import Chapter11.CustomExceptions.SaltException;

public class Chef {
	
	// Instance variables
	private int seasoning;
	
	public void cook() throws PepperException, SaltException{
		seasoning = (int) Math.round((Math.random() * 2));
		if (seasoning == 0) {
			System.out.println("Perfecto!");
		} else if (seasoning == 1) {
			throw new PepperException();
		} else {
			throw new SaltException();
		}
	}
	
}
