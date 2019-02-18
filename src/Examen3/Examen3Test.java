package Examen3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import junit.framework.Assert;

class Examen3Test {

	
	@SuppressWarnings("deprecation")
	@Test
	public void testconcatenar() {
		String cadena1 = "Buenos ";
		String cadena2 = "días";
		
		//Concatenar cadenas
		String cadena3 = cadena1 + cadena2;
		Assert.assertEquals("Buenos días", cadena3);
	}
	
	@Test 
	public void testlongitud() {
		String c = "Buenos días";
		int numero = 14;
		int numero2 = c.length();
		Assert.assertEquals(numero, numero2);
		
	}
	
	@Test 
	public void testmayus() {
		String c = "Buenos días";
		Assert.assertEquals("BUENOS DÍAS", c.toUpperCase());

	}
	
	@Test
	public void testcomp() {
		int numero1 = 3;
		int numero2 = 2;
		Assert.assertEquals(1, comp(numero1, numero2));
	}
	
	@Test
	public void testcuadrado() {
		int numero1 = 9;
		Assert.assertEquals(16, cuadrado(4));
	}
	
	@Test
	public void testmayor() {
		int numero = 3;
		Assert.assertEquals(false, mayor(4));
	}
	
	public static boolean mayor(int numero) {
		if(numero>10) {
			System.out.println("El numero es mayor.");
			return true;
		} else {
			System.out.println("El numero es menor.");
			return false;
		}
	}
	
	public static int comp(int a, int b) {
		if(a > b) 
			return 1;
		else 
			return 0;
			
		
	}
	
	public static int cuadrado(int numero ) {
		return numero*numero;
	}
}




