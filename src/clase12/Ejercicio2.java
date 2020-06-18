package clase12;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Dada una cadena invertir la misma y mostrar por pantalla. Ejemplo: Entrada: "casa blanca"
		Salida: "acnalb asac" */
		
		Scanner sc=new Scanner(System.in);		
		String cadena,cadenaInvertida="";
		
		System.out.println("Ingrese cadena de texto:");		
		cadena=sc.nextLine();
		
		for (int x=cadena.length()-1;x>=0;x--) {
			  cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		}
		
		System.out.println(cadenaInvertida);
	}

}
