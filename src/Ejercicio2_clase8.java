import java.util.*;
public class Ejercicio2_clase8 {

	public static void main(String[] args) {
		
		/*Desarrolle una aplicación la cual nos debe solicitar por teclado un número 
		 * entero positivo (debemos controlarlo) y muestra el número de cifras que tiene. 
		 * Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que 
		 * controlar si tiene una o más cifras, al mostrar el mensaje. */
		
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		while (n<=0) {
		
			System.out.println("Ingrese un número entero positivo");
			n = sc.nextInt();
		
			if (n<=0) {
				System.out.println("Ingrese número válido");
			}		
		
		}
		
		System.out.println("El número " + n + " tiene " + Integer.toString(n).length() + " dígitos");
		
	}

}
