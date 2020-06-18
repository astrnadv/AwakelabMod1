package evaluacion2;

public class Main {

	public static void main(String[] args) {

		Electrodomestico[] arrayElectrodomesticos = new Electrodomestico[10];

		arrayElectrodomesticos[0] = new Electrodomestico();
		arrayElectrodomesticos[1] = new Television(45, true, "negro", 'A', 100000, 10);
		arrayElectrodomesticos[2] = new Lavadora();
		arrayElectrodomesticos[3] = new Lavadora(40, 100000, 40, "gris", 'e');
		arrayElectrodomesticos[4] = new Electrodomestico("morado", 'z', 50000, 15);
		arrayElectrodomesticos[5] = new Television();
		arrayElectrodomesticos[6] = new Television(20, false, "azul", 'C', 80000, 10);
		arrayElectrodomesticos[7] = new Electrodomestico("rojo", 'B', 100000, 12);
		arrayElectrodomesticos[8] = new Lavadora(50000, 40);
		arrayElectrodomesticos[9] = new Electrodomestico(25000, 5);

		int sumaElectrodomesticos = 0;
		int sumaTelevisiones = 0;
		int sumaLavadoras = 0;

		for (int i = 0; i < arrayElectrodomesticos.length; i++) {

			if (arrayElectrodomesticos[i] instanceof Electrodomestico) {
				sumaElectrodomesticos += arrayElectrodomesticos[i].precioFinal();
			}
			if (arrayElectrodomesticos[i] instanceof Lavadora) {
				sumaLavadoras += arrayElectrodomesticos[i].precioFinal();
			}
			if (arrayElectrodomesticos[i] instanceof Television) {
				sumaTelevisiones += arrayElectrodomesticos[i].precioFinal();
			}
		}

		System.out.println("El precio final de lavadoras es de: $" + sumaLavadoras);
		System.out.println("El precio final de televisiones es de: $" + sumaTelevisiones);
		System.out.println("El precio final de todos los electrodomesticos es de: $" + sumaElectrodomesticos);
		
		
		
		//Para comprobación de info de electrodomesticos
		
		for (int i = 0; i < arrayElectrodomesticos.length; i++) {

			if (arrayElectrodomesticos[i] instanceof Electrodomestico) {
				System.out.println("\nElectrodomestico "+i+"("+arrayElectrodomesticos[i].getClass()+"):");
				System.out.print("Precio final: $"+arrayElectrodomesticos[i].precioFinal());
				System.out.print("\nColor: "+arrayElectrodomesticos[i].getColor()+". Peso: "+arrayElectrodomesticos[i].getPeso()
						+". Precio Base: $"+arrayElectrodomesticos[i].getPrecioBase()+". Consumo Energetico: "+arrayElectrodomesticos[i].getConsumoEnergetico());
			}
			if (arrayElectrodomesticos[i] instanceof Lavadora) {
				System.out.print(". Carga: "+((Lavadora)arrayElectrodomesticos[i]).getCarga());
			}
			if (arrayElectrodomesticos[i] instanceof Television) {
				System.out.print(". Resolucion: "+((Television)arrayElectrodomesticos[i]).getResolucion()
						+". SintonizadorTDT: "+((Television)arrayElectrodomesticos[i]).getSintonizadorTDT());
			}
			System.out.println();
		}
		

	}
}
		

