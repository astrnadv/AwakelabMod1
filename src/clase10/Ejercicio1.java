package clase10;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		/*Programe un Array de 14 posiciones de n�meros con valores pedidos por teclado. Muestra
		*por consola el �ndice y el valor al que corresponde.
		*Haz dos m�todos, uno para rellenar valores y otro para mostrar.*/
		
		int num[];
		num= new int[14];
 
        ingresar(num); 
        mostrarArray(num);
    }
 
    public static void ingresar(int lista[]){
        
    	Scanner sc= new Scanner(System.in);
    	
    	for(int i=0;i<14;i++){
    		System.out.println("Ingrese n�mero para posici�n "+(i+1)+":");    		
            lista[i]=sc.nextInt();
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<14;i++){
            System.out.println("En el indice "+i+" esta el n�mero: "+lista[i]);
        }
    }

}
