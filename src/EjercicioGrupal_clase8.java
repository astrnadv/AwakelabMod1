import java.util.*;

public class EjercicioGrupal_clase8 {

	public static void main(String[] args) {

		/**Programe una aplicaci�n llamada CalculadoraApp, esta, nos pedir� 2 
		  operando (int) y un signo aritm�tico (Sting), seg�n este �ltimo se 
		  realizara la operaci�n correspondiente. Al final mostrara el resultado
		  en un cuadro de dialogo. Los signos aritmeticos disponibles son los siguientes
		  +  sumas de los operando
		  -  resta los operando.  
		  *  multiplica los operando.
		  /  divide los operando, este debe dar un resultado con decimales (double)
		  ^   1� operando como base y 2� como exponente.
		  %  m�dulo, resto de la divisi�n entre operando1 y operando2. */
		
		int n1,n2, res=0;
		double n3,n4,res2;
		String op;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**CalculadoraApp");
		System.out.println("Ingrese primer operando:");
		n1=sc.nextInt();
		System.out.println("Ingrese segundo operando;");
		n2=sc.nextInt();
		System.out.println("Ingrese operaci�n a realizar(+,-,*,/,^,%):");
		op=sc.next();
		
		if (op.contentEquals("+")) {
			res=n1+n2;
			System.out.println(res);
		} else if(op.contentEquals("-")) {
			res=n1-n2;
			System.out.println(res);
		} else if(op.contentEquals("*")) {
			res=n1*n2;
			System.out.println(res);
		} else if(op.contentEquals("/")) {
			n3=n1;
			n4=n2;
			res2=n3/n4;
			System.out.println(res2);
		} else if(op.contentEquals("^")) {
			res=(int) Math.pow(n1, n2);			
			System.out.println(res);
		} else if(op.contentEquals("%")) {
			res=n1%n2;
			System.out.println(res);
		} else {
			System.out.println("Operaci�n ingresada inv�lida, reinicie programa");
		}
		
		
		
	}
}
