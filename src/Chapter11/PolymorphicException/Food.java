package Chapter11.PolymorphicException;

import Chapter11.CustomExceptions.SaltException;
import Chapter11.CustomExceptions.SeasoningException;

public class Food {
	
	public static void main(String[] args) {
		Chef chefRamsay = new Chef();
		// Exceptions are polymorphic therefore when looking for SeasonExceptions anything that extends that can be found
		// Go from specific to general
		try {
			chefRamsay.cook();
		} catch (SaltException salt) {
			System.out.println(salt);
		} catch (SeasoningException season){
			System.out.println(season);
		}
	}
	
}
