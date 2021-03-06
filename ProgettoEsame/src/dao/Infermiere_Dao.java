package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import core.exception.InfermiereNotFound;
import core.infermieri.Infermiere;

public class Infermiere_Dao {

	protected static java.util.Map<String,Infermiere> restoredObjects= new java.util.HashMap<String,Infermiere>();
	public static Infermiere create(String CFInfermiere) throws SQLException{
		Connection c = DBManager.getConnection();
		PreparedStatement preparedstat = c.prepareStatement("INSERT INTO Infermiere (CODF) VALUES (?)");
		preparedstat.setString(1, CFInfermiere);
		preparedstat.executeUpdate();
		preparedstat.close();
		Infermiere infermiere=new Infermiere(CFInfermiere);
		restoredObjects.put(CFInfermiere, infermiere);
		return infermiere;

	}
	public static Infermiere create() throws SQLException{
		Connection c = DBManager.getConnection();
		Statement stat = c.createStatement();
		String id;
		try {
			stat.executeUpdate("INSERT INTO Infermiere (Nome,Cognome,Indirizzo) VALUES (NULL,NULL,NULL)");
			ResultSet rs = stat.getGeneratedKeys();
			if (rs.next() == false) {
				throw new SQLException("ID value was not autogenerated!");
			}
			id = rs.getString(1);
		} finally {
			stat.close();	
		}
		
		Infermiere infermiere=new Infermiere(id);
		restoredObjects.put(id, infermiere);
		return infermiere;

	}
	public static Infermiere read(String CODFInfermiere) throws SQLException, InfermiereNotFound {
		if(CODFInfermiere==null){
			throw new InfermiereNotFound();
		}
		if(restoredObjects.containsKey(CODFInfermiere)){
			return restoredObjects.get(CODFInfermiere);
		}
		Connection connessione=DBManager.getConnection();
		PreparedStatement preparedStatement = connessione.prepareStatement("SELECT * FROM Infermiere WHERE CODF=?");
		preparedStatement.setString(1, CODFInfermiere);
		Infermiere infermiere = null;
		ResultSet rs= preparedStatement.executeQuery();
		if(rs.first()){
			if (!rs.wasNull()){
					infermiere=new Infermiere(rs.getString("CODF"),rs.getString("Nome"),
							rs.getString("Cognome"),rs.getString("Indirizzo"),rs.getString("Cellulare"));
				restoredObjects.put(CODFInfermiere, infermiere);
			}
		}
		else {
			throw new InfermiereNotFound();
		}
		rs.close();
		preparedStatement.close();
		return infermiere;
	}
	public static void update(Infermiere infermiere) throws SQLException, InfermiereNotFound{
		if(infermiere.getCodiceFiscale()==null){
			Infermiere Inf = Infermiere_Dao.create(); // Ottengo un nuovo id
			infermiere.setCodiceFiscale(Inf.getCodiceFiscale());
			restoredObjects.put(infermiere.getCodiceFiscale(), infermiere); 

		}
		Connection connessione=DBManager.getConnection();
		PreparedStatement preparedStatement=connessione.prepareStatement("UPDATE Infermiere SET Nome=? ,Cognome=?,Indirizzo=?,Cellulare=? WHERE CODF=?");
		preparedStatement.setString(1,infermiere.getNome());
		preparedStatement.setString(2, infermiere.getCognome());
		preparedStatement.setString(3, infermiere.getIndirizzo());
		preparedStatement.setString(4, infermiere.getNumeroCellulare());
		preparedStatement.setString(5, infermiere.getCodiceFiscale());
		
		boolean rowaffected = preparedStatement.execute();
		if(!rowaffected){
			throw new InfermiereNotFound();
		}
		DBManager.closeConnection();
	}
	
	public static void delete(Infermiere infermiere) throws SQLException {
		String CODF=infermiere.getCodiceFiscale();
		if(CODF != null){
			Connection connection = DBManager.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Infermiere WHERE CODF=?");
			preparedStatement.setString(1, CODF);
			preparedStatement.executeUpdate();
			restoredObjects.remove(CODF);			
			infermiere.setCodiceFiscale(null);
			preparedStatement.close();
		}
	}
}

