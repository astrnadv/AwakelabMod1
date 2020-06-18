package clase09;

import java.util.*;	

public class Ejercicio1 {
	public static void main(String[] args) {
	
		/*Lee un número por teclado que pida el precio de un producto (este puede incluir decimales) y
		 *calcule el precio final con IVA. El IVA será una constante que será del 19%.*/
		
		Scanner sc = new Scanner(System.in);
		double precio=0, res=0;
		final double iva=0.19;
		
		
		System.out.println("**Calculo precio con IVA");
		System.out.println("Ingrese el precio de un producto");
		precio=sc.nextDouble();
		
		res=precio+precio*iva;
		
		System.out.println("El precio con IVA es de: $"+res);
	
	}
}
