package Chapter11.CustomExceptions;

public class SeasoningException extends RuntimeException{
	
	private static final long serialVersionUID = -7047155959457501584L;
	// Protected makes something accessible within a package
	protected String msg;
	
	// Constructors
	public SeasoningException() {
		msg = "Lacks seasoning";
	}
	
	public SeasoningException(String msgIn) { 
		msg = msgIn; 
	}
	
	// For catching the exception, here's the message
	public String toString() {
		return "SeasoningException: " + msg;
	}
}
