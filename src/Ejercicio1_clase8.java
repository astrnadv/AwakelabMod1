import java.util.*;	
public class Ejercicio1_clase8 {	

	public static void main(String[] args) {
		
		/*Realiza una aplicaci�n que nos pida un n�mero de ventas a 
		 * introducir, despu�s nos pedir� tantas ventas por teclado 
		 * como n�mero de ventas se hayan indicado. Al final mostrara 
		 * la suma de todas las ventas. Piensa que es lo que se repite 
		 * y lo que no es necesario que se repita. */
		
		Scanner sc = new Scanner(System.in);		
		
		int numeroVentas, venta, totalVentas;
		totalVentas=0;
		
		System.out.println("Ingrese n�mero de ventas:");
		numeroVentas = sc.nextInt();
		
		for (int i=0 ; i <= numeroVentas-1 ; i++ ) {
			System.out.println("Ingrese valor de la venta "+(i+1)+":");
			venta = sc.nextInt();
			totalVentas=totalVentas+venta;			
		}
		
		System.out.println("El total de ventas es de: $"+totalVentas);

	}

}
