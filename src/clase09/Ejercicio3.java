package clase09;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*Lee un n�mero por teclado y comprueba que este n�mero es mayor o igual que cero, si no lo
		*es lo volver� a pedir (do while), despu�s muestra ese n�mero por consola.*/
		
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		do {
			
			System.out.println("Ingrese un n�mero");
			n=sc.nextInt();
			
			if(n>=0) {
				System.out.println("N�mero "+n+" es mayor o igual a cero");
			} else {
				System.out.println("N�mero "+n+" esmenor a cero");
			}
			
		}while(n<0);
		
		
	}

}
