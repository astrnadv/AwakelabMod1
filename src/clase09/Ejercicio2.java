package clase09;

import java.util.*;

public class Ejercicio2 {

	private static final double PI = 3.14;

	public static void main(String[] args) {
		/*Haz una aplicación que calcule el área de un círculo (pi*R2). El radio se pedirá por teclado
		*(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método
		*pow de Math.*/
		
		Scanner sc = new Scanner(System.in);
		int radio=0;
		double area=0;
		
		System.out.println("Ingrese radio del círculo");
		radio=sc.nextInt();
		
		area=PI*(Math.pow(radio,2));
		
		System.out.println("El área del círculo es: "+area);
		
		
	}

}
