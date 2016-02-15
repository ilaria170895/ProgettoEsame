package terapie;

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
    public Terapia VisualizzaListaTerapie(Date di, Date df);

    /**
     * @param t
     */
    public void InserisciTerapia(Terapia t);

}