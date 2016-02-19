package core.paziente;

/**
 * 
 */
public class GestorePazienti implements IGestorePazienti {


    /**
     * 
     */
    private static GestorePazienti instance;


    /**
     * @return
     */
    public static GestorePazienti getinstance() {
        if(instance==null) {
        	GestorePazienti.instance=new GestorePazienti();
        }
        return GestorePazienti.instance;
    }

	/**
     * 
     */
    protected GestorePazienti() {
        // TODO implement here
    }


	@Override
	public void InserisciDatiPaziente(Paziente p) {
		// TODO Auto-generated method stub
		
	}

}