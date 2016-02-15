package core.infermieri;

import java.util.*;

/**
 * 
 */
public class Infermiere {

	public Infermiere(String nome, String cognome, String codiceFiscale, String numeroCellulare) {
		super();
		Nome = nome;
		Cognome = cognome;
		CodiceFiscale = codiceFiscale;
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

	/**
     * 
     */
    public Infermiere() {
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