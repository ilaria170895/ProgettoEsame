package core.terapie;

import java.sql.Date;
import java.sql.SQLException;
import java.util.*;

import core.exception.InfermiereNotFound;
import core.exception.PazienteNotFound;
import core.exception.TerapiaNotFound;
import dao.Terapia_Dao;

/**
 * 
 */
public class GestoreTerapie implements IGestoreTerapie {



    /**
     * 
     */
    private static GestoreTerapie instance;


    /**
     * @return
     */
    public static GestoreTerapie getinstance() {
       if(instance==null) {
    	   GestoreTerapie.instance=new GestoreTerapie();
       }
       return GestoreTerapie.instance;       
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
	public ArrayList<Terapia> VisualizzaListaTerapie(java.util.Date di, java.util.Date df) throws TerapiaNotFound, PazienteNotFound, InfermiereNotFound {
		ArrayList<Terapia> listaterapie=new ArrayList<Terapia>();
		try{
			ArrayList<Terapia> totaleterapie=Terapia_Dao.readall();
			for(int i=0;i<totaleterapie.size();i++){
				if(totaleterapie.get(i).getDataInizio().equals(di)&&totaleterapie.get(i).getDataFine().equals(df)){
					listaterapie.add(totaleterapie.get(i));
				}
			}
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.err.println("Errore nel recupero dei Dati");
			System.exit(-1);
		}
		return listaterapie;
	}

}