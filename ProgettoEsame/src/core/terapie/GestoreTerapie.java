package core.terapie;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

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
    private static GestoreTerapie instance;//l'unica istanza della classe GestoreTerapie


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

	@Override //throws definisce i tipi di eccezioni risollevati al metodo chiamante
	public ArrayList<Terapia> VisualizzaListaTerapie(java.util.Date di, java.util.Date df) throws TerapiaNotFound, PazienteNotFound, InfermiereNotFound, ParseException {
		if(di==null&&df==null){
			throw new ParseException("Data nulla non Valida",0);
		}
		ArrayList<Terapia> listaterapie=new ArrayList<Terapia>();
		try{
			ArrayList<Terapia> totaleterapie=Terapia_Dao.readall();//scarico tutte le terapie dal db
			for(int i=0;i<totaleterapie.size();i++){
				if(totaleterapie.get(i).getDataInizio().getTime()>=di.getTime()&&totaleterapie.get(i).getDataFine().getTime()<=df.getTime()){
					listaterapie.add(totaleterapie.get(i));//prendo l'elem iesimo che ho appena confrontato e l'ho inserisco in lista in caso positivo
				}
			}
			
		} catch (SQLException e) {
			System.err.println("Errore nel recupero dei Dati");
			System.exit(-1);
		}
		return listaterapie;
	}

}