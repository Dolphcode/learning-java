package Chapter11.CustomExceptions;

public class SaltException extends SeasoningException{

	private static final long serialVersionUID = -6935217868673757985L;

	// Constructors
	public SaltException() {
		msg = "Lacks salt";
	}
	
	public SaltException(String msgIn) { 
		msg = msgIn; 
	}
	
	// For catching the exception, here's the message
	public String toString() {
		return "SaltException: " + msg;
	}
	
}
