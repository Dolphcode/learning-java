package Chapter11.CustomExceptions;

public class DuckableException extends RuntimeException{

	private static final long serialVersionUID = 6730179946480017540L;
	
	// For catching the exception, here's the message
	public String toString() {
		return "DuckableException: You didn't duck!";
	}
}
