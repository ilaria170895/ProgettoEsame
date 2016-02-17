package core.exception;

public class TerapiaNotFound extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4049754027722804598L;
	public void printErrorMessage() {
		System.err.println("Terapia non Trovata");
	}
}
