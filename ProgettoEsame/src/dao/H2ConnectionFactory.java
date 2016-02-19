package dao;


import java.sql.DriverManager;

public class H2ConnectionFactory implements IConnectionFactory {
	
	protected final static String DB_PATH = "./test";//stringa percorso db
	protected final static String CONNECTION_STRING = "jdbc:h2:" + DB_PATH;
	
	@Override
	public java.sql.Connection createConnection() throws Exception {//creo connessione al db,se non viene creata solleva l'eccezione
		Class.forName("org.h2.Driver"); //ricerca il driver del db
        return DriverManager.getConnection(CONNECTION_STRING, "sa", "");//ritorna la connessione creata
	}
}

//la classe H2ConnFactory implementa l'interfaccia,ha due attributi che sono protected e final(immodificabili)