package Chapter11.DuckExceptions;

import Chapter11.CustomExceptions.DuckableException;

public class DuckTheException {

	public static void main(String[] args) throws DuckableException {
		//This ducks/avoids the duckable exception, basically delays the inevitable
		System.out.println("Ducked?!");
	}
	
}
