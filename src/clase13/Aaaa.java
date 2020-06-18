package clase13;

public class Aaaa {

	public static void main(String[] args) {
		/*MUJERES     TMB= (10 x peso en kg) + (6,25 x altura en cm) – (5 x edad en años) – 161
		 * Ejercicio Moderado (3-5 días por semana) = Calorías diarias necesarias = TMB x 1,55
		 * Ejercicio Fuerte (6 días por semana) =  Calorías diarias necesarias = TMB x 1,725  */
		
		double TMB;
		
		TMB=(10*70)+(6.25*165)-(5*29)-161;

		System.out.println((TMB)+"  "+(TMB*1.725));
	}

}
