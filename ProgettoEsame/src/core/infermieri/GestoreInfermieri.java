package core.infermieri;

import java.util.*;

/**
 * 
 */
public class GestoreInfermieri implements IGestoreInfermieri {

    /**
     * 
     */
    private GestoreInfermieri instance;



    /**
     * @return
     */
    public GestoreInfermieri getinstance() {
        if(this.instance==null) {
        	this.instance= new GestoreInfermieri();
        }
        return this.instance;
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