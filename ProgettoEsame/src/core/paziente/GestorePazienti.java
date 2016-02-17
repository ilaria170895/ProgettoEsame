package core.paziente;

import java.util.*;

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
	public void VisualizzaGeneralitaPaziente(Paziente p) {
		System.out.println("Paziente Nome: "+p.getNome()+" Cognome: "+p.getCognome());
	}

	@Override
	public void InserisciDatiPaziente(Paziente p) {
		// TODO Auto-generated method stub
		
	}

}