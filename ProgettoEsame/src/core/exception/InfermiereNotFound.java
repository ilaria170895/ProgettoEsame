package core.exception;

public class InfermiereNotFound extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2366899017590604235L;
	public void printErrorMessage() {
		System.err.println("Infermiere non Trovato");
	}

}
