package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import core.exception.InfermiereNotFound;
import core.exception.PazienteNotFound;
import core.exception.TerapiaNotFound;
import core.paziente.GestorePazienti;
import core.terapie.GestoreTerapie;
import core.terapie.Terapia;
public class UIPersonale {

	public void VisualizzaListaTerapie() {
		System.out.println("Dal periodo:");
		Date datainizio=selezionaData();
		System.out.println("Al periodo:");
		Date datafine=selezionaData();
		System.out.println("Hai scelto Data Inizio:"+datainizio.toString()+ "alla Data di Fine:"+datafine.toString());
		GestoreTerapie gestoreTerapie=GestoreTerapie.getinstance();
		GestorePazienti gestorePazienti=GestorePazienti.getinstance();
		ArrayList<Terapia> listaterapie = null;
		try {
			listaterapie=gestoreTerapie.VisualizzaListaTerapie(datainizio, datafine);
			System.out.println("Trovate "+ listaterapie.size()+" Terapie");
			for(int j=0;j<listaterapie.size();j++){
				System.out.println("Data Inizio: "+listaterapie.get(j).getDataInizio()+" Data Fine: "+listaterapie.get(j).getDataFine()+" Descrizione: "+listaterapie.get(j).getDescrizione());
				gestorePazienti.VisualizzaGeneralitaPaziente(listaterapie.get(j).getPaziente());
			}
			
		} catch (TerapiaNotFound e) {
			e.printErrorMessage();
		} catch (PazienteNotFound e) {
			e.printErrorMessage();
		} catch (InfermiereNotFound e) {
			e.printErrorMessage();;
		}
	}

	private Date selezionaData() {
		System.out.println("Inserisci Anno");
		Integer Anno=getFormattedInteger();
		System.out.println("Inserisci Mese");
		Integer Mese=getFormattedInteger ();
		System.out.println("Inserisci Giorno");
		Integer Giorno=getFormattedInteger ();
		return formattaData(Anno,Mese,Giorno);
	}
		
		
	/**
     * Preleva un input intero
     * @return Intero Formattato
     * @throws NumberFormatException Numero non valido
     */
    public Integer getFormattedInteger() throws NumberFormatException {
    	Integer intero=null;
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		boolean WFI = true;
		try {
			while (WFI) {
					String bufferinput = bufferedReader.readLine();
					intero = Integer.parseInt(bufferinput);
					WFI = false;
			}
			return intero;
		} catch (IOException e) {
			System.err.println("Errore nell'inserimento");
		}
		return null;
    }
    
    @SuppressWarnings("deprecation")
	public Date formattaData(Integer year,Integer month,Integer day) {
    	if(year==null||month==null||day==null){
    		return null;
    	}
    	return new java.util.Date(year-1900, month-1, day);
    }

}
