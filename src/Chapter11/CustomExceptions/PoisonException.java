package Chapter11.CustomExceptions;

/**
 * Custom exception for when you get poisoned
 * @author basti
 *
 */
public class PoisonException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String msg;
	
	// Constructors
	public PoisonException() {
		msg = "You've been poisoned!";
	}
	
	public PoisonException(String msgIn) { 
		msg = msgIn; 
	}
	
	// For catching the exceptiom, here's the message
	public String toString() {
		return "PoisonException: " + msg;
	}
	
	
}
