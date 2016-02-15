package core.paziente;

import java.util.*;

/**
 * 
 */
public class GestorePazienti implements IGestorePazienti {


    /**
     * 
     */
    private GestorePazienti instance;


    /**
     * @return
     */
    public GestorePazienti getinstance() {
        if(this.instance==null) {
        	this.instance=new GestorePazienti();
        }
        return instance;
    }

	/**
     * 
     */
    protected GestorePazienti() {
        // TODO implement here
    }

	@Override
	public void VisualizzaGeneralitaPaziente(Paziente p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InserisciDatiPaziente(Paziente p) {
		// TODO Auto-generated method stub
		
	}

}