package core.infermieri;

import java.util.*;

/**
 * 
 */
public class Infermiere {

	private String Indirizzo;

	public Infermiere( String codiceFiscale,String nome, String cognome, String indirizzo,String numeroCellulare) {
		super();
		Nome = nome;
		Cognome = cognome;
		CodiceFiscale = codiceFiscale;
		Indirizzo=indirizzo;
		NumeroCellulare = numeroCellulare;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Infermiere other = (Infermiere) obj;
		if (CodiceFiscale == null) {
			if (other.CodiceFiscale != null)
				return false;
		} else if (!CodiceFiscale.equals(other.CodiceFiscale))
			return false;
		return true;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getCodiceFiscale() {
		return CodiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		CodiceFiscale = codiceFiscale;
	}

	public String getNumeroCellulare() {
		return NumeroCellulare;
	}

	public void setNumeroCellulare(String numeroCellulare) {
		NumeroCellulare = numeroCellulare;
	}

	public String getIndirizzo() {
		return Indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}

	/**
     * 
     */
    public Infermiere() {
    }

    public Infermiere(String cFInfermiere) {
		this.CodiceFiscale=cFInfermiere;
	}

	/**
     * 
     */
    private String Nome;

    /**
     * 
     */
    private String Cognome;

    /**
     * 
     */
    private String CodiceFiscale;

    /**
     * 
     */
    private String NumeroCellulare;




}