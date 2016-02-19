package core.paziente;

/**
 * 
 */
public class Paziente {

 	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paziente other = (Paziente) obj;
		if (CodFiscale == null) {
			if (other.CodFiscale != null)
				return false;
		} else if (!this.CodFiscale.equals(other.CodFiscale))
			return false;
		return true;
	}

 	public String getGeneralita(){
 			return new String("Paziente Nome: "+this.getNome()+" Cognome: "+this.getCognome());
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



	public String getCodFiscale() {
		return CodFiscale;
	}



	public void setCodFiscale(String codFiscale) {
		CodFiscale = codFiscale;
	}



	public String getDomicilio() {
		return Domicilio;
	}



	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}



	/**
     * 
     */
    public Paziente() {
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
    private String CodFiscale;

    /**
     * 
     */
    private String Domicilio;



    /**
     * @param n 
     * @param c 
     * @param CF 
     * @param Dom
     */
    public Paziente(String CF,String n, String c,String Dom) {
        super();
        this.Nome=n;
        this.Cognome=c;
        this.CodFiscale=CF;
        this.Domicilio=Dom;
    }



	public Paziente(String id) {
		this.CodFiscale=id;
	}

}