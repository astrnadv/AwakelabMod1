import java.util.*;	
public class Ejercicio1_clase8 {	

	public static void main(String[] args) {
		
		/*Realiza una aplicación que nos pida un número de ventas a 
		 * introducir, después nos pedirá tantas ventas por teclado 
		 * como número de ventas se hayan indicado. Al final mostrara 
		 * la suma de todas las ventas. Piensa que es lo que se repite 
		 * y lo que no es necesario que se repita. */
		
		Scanner sc = new Scanner(System.in);		
		
		int numeroVentas, venta, totalVentas;
		totalVentas=0;
		
		System.out.println("Ingrese número de ventas:");
		numeroVentas = sc.nextInt();
		
		for (int i=0 ; i <= numeroVentas-1 ; i++ ) {
			System.out.println("Ingrese valor de la venta "+(i+1)+":");
			venta = sc.nextInt();
			totalVentas=totalVentas+venta;			
		}
		
		System.out.println("El total de ventas es de: $"+totalVentas);

	}

}
