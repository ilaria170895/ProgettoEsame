package core.terapie;

import java.util.*;

import core.infermieri.Infermiere;
import core.paziente.Paziente;

/**
 * 
 */
public class Terapia {
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Terapia other = (Terapia) obj;
		if (ID_Terapia == null) {
			if (other.ID_Terapia != null)
				return false;
		} else if (!ID_Terapia.equals(other.ID_Terapia))
			return false;
		return true;
	}

	public Integer getID_Terapia() {
		return this.ID_Terapia;
	}
	
	public void setID_Terapia(Integer Id) {
		this.ID_Terapia=Id; 
	}

    public String getDescrizione() {
		return this.Descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.Descrizione = descrizione;
	}

	public Date getDataInizio() {
		return this.DataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.DataInizio = dataInizio;
	}

	public Date getDataFine() {
		return this.DataFine;
	}

	public void setDataFine(Date dataFine) {
		this.DataFine = dataFine;
	}

	public Paziente getPaziente() {
		return this.paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public ArrayList<Infermiere> getInfermieri() {
		return this.infermieri;
	}

	public void setInfermieri(ArrayList<Infermiere> infermieri) {
		this.infermieri = infermieri;
	}

	public Terapia(Integer Id,String descrizione, Date dataInizio, Date dataFine, Paziente paziente,
			ArrayList<Infermiere> infermieri) {
		super();
		this.ID_Terapia=Id;
		this.Descrizione = descrizione;
		this.DataInizio = dataInizio;
		this.DataFine = dataFine;
		this.paziente = paziente;
		this.infermieri = infermieri;
	}
    public Terapia(Integer Id,String De, Date DI, Date DF, Infermiere I, Paziente P) {
    	super();
    	this.ID_Terapia=Id;
		this.Descrizione = De;
		this.DataInizio = DI;
		this.DataFine = DF;
		this.paziente = P;
		this.infermieri=new ArrayList<Infermiere>();
		this.infermieri.add(I);
    }
    public Terapia(Integer Id,String De, Date DI, Date DF, Paziente P) {
    	super();
    	this.ID_Terapia=Id;
		this.Descrizione = De;
		this.DataInizio = DI;
		this.DataFine = DF;
		this.paziente = P;
		this.infermieri=new ArrayList<Infermiere>();
    }
	/**
     * 
     */
    public Terapia() {
    }

    public Terapia(Integer iDTerapia) {
		this.ID_Terapia=iDTerapia;
	}

	/**
     * 
     */
    private String Descrizione;

    /**
     * 
     */
    private Date DataInizio;

    /**
     * 
     */
    private Date DataFine;
    
    private Paziente paziente;
    private ArrayList <Infermiere> infermieri;
    private Integer ID_Terapia;
	public void aggiungiInfermiere(Infermiere inferm) {
		this.infermieri.add(inferm);
		
	}
}