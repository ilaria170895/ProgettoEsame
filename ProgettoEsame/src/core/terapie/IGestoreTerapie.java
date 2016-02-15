package core.terapie;

import java.util.*;

/**
 * 
 */
public interface IGestoreTerapie {

    /**
     * @param di 
     * @param df 
     * @return
     */
    public ArrayList<Terapia> VisualizzaListaTerapie(Date di, Date df);

    /**
     * @param t
     */
    public void InserisciTerapia(Terapia t);

}