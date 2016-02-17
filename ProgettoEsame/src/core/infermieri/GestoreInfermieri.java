package core.infermieri;

import java.util.*;

/**
 * 
 */
public class GestoreInfermieri implements IGestoreInfermieri {

    /**
     * 
     */
    private static GestoreInfermieri instance;



    /**
     * @return
     */
    public static GestoreInfermieri getinstance() {
        if(instance==null) {
        	GestoreInfermieri.instance= new GestoreInfermieri();
        }
        return GestoreInfermieri.instance;
    }

    /**
     * 
     */
    protected GestoreInfermieri() {
        // TODO implement here
    }

	@Override
	public void InserisciInfermiere(Infermiere I) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RimuoviInfermiere(Infermiere I) {
		// TODO Auto-generated method stub
		
	}


}