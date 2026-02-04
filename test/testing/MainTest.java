package testing;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testContaoccorrenze() {
		EsempioFullStack es = new EsempioFullStack();
		String testo = "Lorem ipsum Lorem ipsum";
		int occ=4;
		assertEquals(occ, es.ContaOccorrenze(testo, "m"),"Il numero di occorenze è corretto");
	}
	
	@Test
	void testPalindroma() {
		EsempioFullStack pl = new EsempioFullStack();
		String str = "osso";
		assertTrue(pl.isPalindroma(str),"Risultato atteso");
	}

}
