package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import core.exception.InfermiereNotFound;
import core.exception.PazienteNotFound;
import core.exception.TerapiaNotFound;
import core.terapie.GestoreTerapie;
import core.terapie.Terapia;
public class UIPersonale {

	public void VisualizzaListaTerapie() {
		System.out.println("Dal periodo:"); 
		Date datainizio=selezionaData();
		System.out.println("Al periodo:");
		Date datafine=selezionaData();
		System.out.println("Hai scelto Data Inizio:"+datainizio.toString()+ "alla Data di Fine:"+datafine.toString());
		GestoreTerapie gestoreTerapie=GestoreTerapie.getinstance(); //richiamo singleton di gestoreterapie
		ArrayList<Terapia> listaterapie = null; //creo riferimento ad un array terapia
		try { 
			listaterapie=gestoreTerapie.VisualizzaListaTerapie(datainizio, datafine);//assegno il risultato della ricerca al mio riferimento
			System.out.println("Trovate "+ listaterapie.size()+" Terapie"); //stampo il numero di terapie
			for(int j=0;j<listaterapie.size();j++){ //per ogni terapia stampo  i dati
				System.out.println("Data Inizio: "+listaterapie.get(j).getDataInizio()+" Data Fine: "+listaterapie.get(j).getDataFine()+" Descrizione: "+listaterapie.get(j).getDescrizione());
				System.out.println(listaterapie.get(j).getPaziente().getGeneralita());
			}
			
		} catch (TerapiaNotFound e) {
			e.printErrorMessage();//terapie non presenti nel database
		} catch (PazienteNotFound e) {
			e.printErrorMessage(); //paziente associato a terapia inesistente
		} catch (InfermiereNotFound e) {
			e.printErrorMessage();;
		} catch (ParseException e) { 
			System.err.println("Date Invalide");
			System.exit(-1);
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
     * @throws NumberFormatException L'utente ha inserito un numero non valido
     */
    private Integer getFormattedInteger() throws NumberFormatException {
    	Integer intero=null;
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //imposto il terminale come sorgente di input
		boolean aspettainput = true;
		try {
			while (aspettainput) { //aspetto fin quando l'utente non digita 
					String bufferinput = bufferedReader.readLine(); //leggo il dato scritto dall'utente
					intero = Integer.parseInt(bufferinput); //elaboro il dato scritto dall'utente come intero
					aspettainput = false; //esco dal ciclo
			}
			return intero;
		} catch (IOException e) {
			System.err.println("Errore nell'inserimento"); //errore generico di in e out
		}
		return null;
    }
    
    @SuppressWarnings("deprecation")
	private Date formattaData(Integer year,Integer month,Integer day) {
    	if(year==null||month==null||day==null){
    		return null;
    	}
    	return new java.util.Date(year-1900, month-1, day);  
    }

}
