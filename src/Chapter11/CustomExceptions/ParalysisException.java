package Chapter11.CustomExceptions;

/**
 * Custom exception for when you get paralyzed
 * @author basti
 * 
 */
public class ParalysisException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String msg;
	
	// Constructors
	public ParalysisException() {
		msg = "You've been paralyzed!";
	}
	
	public ParalysisException(String msgIn) { 
		msg = msgIn; 
	}
	
	// For catching the exception, here's the message
	public String toString() {
		return "ParalysisException: " + msg;
	}

}
