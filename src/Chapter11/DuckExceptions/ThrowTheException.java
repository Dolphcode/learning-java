package Chapter11.DuckExceptions;

import Chapter11.CustomExceptions.DuckableException;

public class ThrowTheException {
	
	public void throwAnException() throws DuckableException {
		throw new DuckableException();
	}
	
}
