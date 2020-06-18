package clase10;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/* Estructure un Array de n�meros donde le indicamos por teclado el tama�o del Array,
		rellenaremos el Array con n�meros aleatorios entre 0 y 9, al final muestra por pantalla el
		valor de cada posici�n y la suma de todos los valores. Haz un m�todo para rellenar el Array
		(que tenga como par�metros los n�meros entre los que tenga que generar), para mostrar el
		contenido y la suma del Array y un m�todo privado para generar n�mero aleatorio (lo puedes
		usar para otros ejercicios).*/
		
		Scanner sc = new Scanner(System.in);
		int largo=0, arrayNum[];
		
		System.out.println("Ingrese tama�o del Array:");
		largo=sc.nextInt();
		
		arrayNum = new int[largo];
		
		rellenarNumAleatorioArray(arrayNum,0,9);
		mostrarArray(arrayNum);
				
	}
	
	public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
	
	public static void mostrarArray(int lista[]){
		int sum=0;
        for(int i=0;i<lista.length;i++){
        	sum=lista[i]+sum;
            System.out.println("En el indice "+i+" esta el n�mero: "+lista[i]);
            
        }
        System.out.println("La suma de los n�meros del Array es: "+sum);
    }

}
