package clase09;

import java.util.*;

public class Ejercicio2 {

	private static final double PI = 3.14;

	public static void main(String[] args) {
		/*Haz una aplicaci�n que calcule el �rea de un c�rculo (pi*R2). El radio se pedir� por teclado
		*(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el m�todo
		*pow de Math.*/
		
		Scanner sc = new Scanner(System.in);
		int radio=0;
		double area=0;
		
		System.out.println("Ingrese radio del c�rculo");
		radio=sc.nextInt();
		
		area=PI*(Math.pow(radio,2));
		
		System.out.println("El �rea del c�rculo es: "+area);
		
		
	}

}
