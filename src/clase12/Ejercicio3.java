package clase12;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Dada una palabra (cad=cadena) y un vocal (carácter= car), verificar cuántas veces se repite el
		carácter car en la cadena cad. Ejemplo: Entrada: cad = "casa blanca", car = 'a' Salida: El carácter 'a'
		se repite 4 veces*/
		
		Scanner sc=new Scanner(System.in);		
		String cad, cad2, car;
		
		System.out.println("Ingrese cadena de texto:");		
		cad=sc.nextLine();
		
		System.out.println("Ingrese caracter a verificar:");		
		car=sc.nextLine();		
		
		cad2 =cad.replaceAll(car,"");
		
		System.out.println("El caracter "+car+" se repite "+(cad.length()-cad2.length())+" veces");
		
	}

}
