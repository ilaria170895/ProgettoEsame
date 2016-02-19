package core.terapie;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import core.exception.InfermiereNotFound;
import core.exception.PazienteNotFound;
import core.exception.TerapiaNotFound;

/**
 * 
 */
public interface IGestoreTerapie {

    /**
     * @param di 
     * @param df 
     * @return
     * @throws InfermiereNotFound 
     * @throws PazienteNotFound 
     * @throws TerapiaNotFound 
     * @throws ParseException 
     */
    public ArrayList<Terapia> VisualizzaListaTerapie(Date di, Date df) throws TerapiaNotFound, PazienteNotFound, InfermiereNotFound, ParseException;

    /**
     * @param t
     */
    public void InserisciTerapia(Terapia t);

}