package core.terapie;

import java.util.*;

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
     */
    public ArrayList<Terapia> VisualizzaListaTerapie(Date di, Date df) throws TerapiaNotFound, PazienteNotFound, InfermiereNotFound;

    /**
     * @param t
     */
    public void InserisciTerapia(Terapia t);

}