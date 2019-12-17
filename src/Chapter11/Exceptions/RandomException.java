package Chapter11.Exceptions;

public class RandomException {	
	
	public static void main(String[] args) {
		EvilClass weevil = new EvilClass();
		// A try will try to take a risk
		try {
			weevil.takeRisk();
		} catch (Exception ex) {
			// In the case of an evil exception the exception will be caught and displayed
			ex.printStackTrace();
			weevil.evilLaugh();
		} finally {
			// "Finally" does something no matter what the scenario
			System.out.println("The number was: " + weevil.evilNumber);
		}
		
	}
	
}
