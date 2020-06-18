package clase10;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/* Estructure un Array de números donde le indicamos por teclado el tamaño del Array,
		rellenaremos el Array con números aleatorios entre 0 y 9, al final muestra por pantalla el
		valor de cada posición y la suma de todos los valores. Haz un método para rellenar el Array
		(que tenga como parámetros los números entre los que tenga que generar), para mostrar el
		contenido y la suma del Array y un método privado para generar número aleatorio (lo puedes
		usar para otros ejercicios).*/
		
		Scanner sc = new Scanner(System.in);
		int largo=0, arrayNum[];
		
		System.out.println("Ingrese tamaño del Array:");
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
            System.out.println("En el indice "+i+" esta el número: "+lista[i]);
            
        }
        System.out.println("La suma de los números del Array es: "+sum);
    }

}
