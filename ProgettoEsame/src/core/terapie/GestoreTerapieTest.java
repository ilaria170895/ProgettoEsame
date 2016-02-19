package core.terapie;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import core.exception.InfermiereNotFound;
import core.exception.PazienteNotFound;
import core.exception.TerapiaNotFound;
@SuppressWarnings("deprecation")

public class GestoreTerapieTest {
	static GestoreTerapie gestore;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		gestore=GestoreTerapie.getinstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		gestore=null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void ricercaTerapiaOk() throws TerapiaNotFound, PazienteNotFound, InfermiereNotFound, ParseException {
		assertFalse(gestore.VisualizzaListaTerapie(new Date(2016-1900,2-1,1), new Date(2016-1900,2-1,16)).size()==0);
	}
	@Test
	public final void ricercaTerapianonpresente() throws TerapiaNotFound, PazienteNotFound, InfermiereNotFound, ParseException{
		assertTrue((gestore.VisualizzaListaTerapie(new Date(2016-1900,1-1,1), new Date(2016-1900,2-1,1)).size()==0));
	}
	@Test
	public final void ricercaTerapieDataInvalid() throws TerapiaNotFound, PazienteNotFound, InfermiereNotFound, ParseException{
		assertTrue((gestore.VisualizzaListaTerapie(new Date(0,0,0),new Date(0,0,0)).size()==0));
	}
	@Test(expected=ParseException.class)
	public final void ricercaTerapieDataNull() throws TerapiaNotFound, PazienteNotFound, InfermiereNotFound, ParseException{
		assertTrue((gestore.VisualizzaListaTerapie(null,null).size()==0));
	}
}
