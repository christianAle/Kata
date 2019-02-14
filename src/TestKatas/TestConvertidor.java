package TestKatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Katas.Convertidor;

public class TestConvertidor {

	@Test
	public void TestConvertidorRomano() 
	{
		int numero = 8;
		int numero2 =2;
		String resultRomano = Convertidor.convertir(numero);
		String resultRoman2 = Convertidor.convertir(numero2);
		
		assertEquals("Vlll",resultRomano,"Vlll");
		assertEquals("ll",resultRoman2,"ll");
		
		
		
	 	
	}
	
	@Test
	public void TestConvertidorDosDigitos() 
	{   
		
		int numero3 =45;
		int numerox=15;
		String resultRoman3 = Convertidor.convertir(numero3);
		String resultRomanx = Convertidor.convertir(numerox);
		
		assertEquals("XLV",resultRoman3,"XLV");
		assertEquals("XV",resultRomanx,"XV");
	}
	
	@Test
	public void TestConvertidorTresDigitos() 
	{   
		
		int numero3 =555;
		int numerox=240;
		String resultRoman3 = Convertidor.convertir(numero3);
		String resultRomanx = Convertidor.convertir(numerox);
		
		assertEquals("DLV",resultRoman3,"DLV");
		assertEquals("CCXL",resultRomanx,"CCXL");
	}
	
}
