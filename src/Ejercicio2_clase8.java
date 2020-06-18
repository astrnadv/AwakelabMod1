import java.util.*;
public class Ejercicio2_clase8 {

	public static void main(String[] args) {
		
		/*Desarrolle una aplicaci�n la cual nos debe solicitar por teclado un n�mero 
		 * entero positivo (debemos controlarlo) y muestra el n�mero de cifras que tiene. 
		 * Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que 
		 * controlar si tiene una o m�s cifras, al mostrar el mensaje. */
		
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		while (n<=0) {
		
			System.out.println("Ingrese un n�mero entero positivo");
			n = sc.nextInt();
		
			if (n<=0) {
				System.out.println("Ingrese n�mero v�lido");
			}		
		
		}
		
		System.out.println("El n�mero " + n + " tiene " + Integer.toString(n).length() + " d�gitos");
		
	}

}
