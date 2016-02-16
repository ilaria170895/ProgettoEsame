package core.exception;

public class PazienteNotFound extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4657926215490878283L;
	public void printErrorMessage() {
		System.err.println("Paziente non Trovato");
	}


}
