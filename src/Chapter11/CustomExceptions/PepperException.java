package Chapter11.CustomExceptions;

public class PepperException extends SeasoningException{

	private static final long serialVersionUID = -7707123846046438653L;
	
	// Constructors
	public PepperException() {
		msg = "Lacks pepper";
	}
	
	public PepperException(String msgIn) { 
		msg = msgIn; 
	}
	
	// For catching the exception, here's the message
	public String toString() {
		return "PepperException: " + msg;
	}
	
}
