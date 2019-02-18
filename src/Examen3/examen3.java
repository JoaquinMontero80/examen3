package Examen3;

import java.util.Scanner;

public class examen3 {

	private static Scanner entrada;

	public static void main(String[] args) {
		String a = "Buenos ";
		String b = "Días";
		String c;
		
		c = a + b;
		
		//Concatenar
		System.out.println("Las palabras concatenadas es: " +c);
	
		
		//Mayusculas
		System.out.println("En mayusculas: " +c.toUpperCase());
		
		//Longitud
		System.out.println("El numero de elementos de la cadena es: " + c.length());
		
		//Mayor o menor
		int num1 = 3;
		int num2 = 2;
		System.out.println("Retorna: "+comp(num1, num2));
		
		entrada = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero = entrada.nextInt();
		System.out.println("El cuadrado es: "+cuadrado(numero));
		
		//Mayor que 10
		System.out.println("El retorno es: "+mayor(numero));
	
	}
	
	private static String comp(int num1, int num2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int cuadrado(int numero ) {
		return numero*numero;
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
	
	
	}
	
	
	



	

