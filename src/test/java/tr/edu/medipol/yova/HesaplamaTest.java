package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testToplama() {
		int sayi1 = 48;
		int sayi2 = 12;
		Hesaplama h = new Hesaplama();
		
		int gerceklesen = h.Toplama(sayi1, sayi2);
		
		assertEquals(60, gerceklesen);
	}
	
	public void testCikarma() {
		int sayi1 = 48;
		int sayi2 = 12;
		Hesaplama h = new Hesaplama();
		
		int gerceklesen = h.Cikarma(sayi1, sayi2);
		
		assertEquals(36, gerceklesen);
	}
	
	public void testCarpma() {
		int sayi1 = 48;
		int sayi2 = 12;
		Hesaplama h = new Hesaplama();
		
		int gerceklesen = h.Carpma(sayi1, sayi2);
		
		assertEquals(576, gerceklesen);
	}
	
	public void testBolme() {
		int sayi1 = 48;
		int sayi2 = 12;
		Hesaplama h = new Hesaplama();
		
		int gerceklesen = h.Bolme(sayi1, sayi2);
		
		assertEquals(4, gerceklesen);
	}
	
	
	

}
