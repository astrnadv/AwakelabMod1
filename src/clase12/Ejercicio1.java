package clase12;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Dada una cadena. Ej. : “Mi Talento digital” mostrar por pantalla la cantidad de vocales que
		tiene. Ejemplo: Entrada: “Talento digital" Salida: La cantidad de vocales es 6 */
		
		Scanner sc=new Scanner(System.in);		
		String cadena;
		
		System.out.println("Ingrese cadena de texto:");		
		cadena=sc.nextLine();
	    cadena =cadena.replaceAll("[^AEIOUaeiou]","");
	    System.out.println("La cadena de texto tiene: "+cadena.length()+" vocales.");
		
	}

}
