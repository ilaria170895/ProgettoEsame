package core.terapie;

import java.sql.Date;
import java.util.*;

/**
 * 
 */
public class GestoreTerapie implements IGestoreTerapie {



    /**
     * 
     */
    private GestoreTerapie instance;


    /**
     * @return
     */
    public GestoreTerapie getinstance() {
       if(this.instance==null) {
    	   this.instance=new GestoreTerapie();
       }
       return this.instance;       
    }

    /**
     * 
     */
    protected GestoreTerapie() {
        // TODO implement here
    }


	@Override
	public void InserisciTerapia(Terapia t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Terapia> VisualizzaListaTerapie(java.util.Date di, java.util.Date df) {
		// TODO Auto-generated method stub
		return null;
	}

}