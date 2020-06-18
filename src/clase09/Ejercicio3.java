package clase09;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo
		*es lo volverá a pedir (do while), después muestra ese número por consola.*/
		
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		do {
			
			System.out.println("Ingrese un número");
			n=sc.nextInt();
			
			if(n>=0) {
				System.out.println("Número "+n+" es mayor o igual a cero");
			} else {
				System.out.println("Número "+n+" esmenor a cero");
			}
			
		}while(n<0);
		
		
	}

}
