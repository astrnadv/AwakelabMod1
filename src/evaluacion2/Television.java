package evaluacion2;

public class Television extends Electrodomestico {
	
	//Constantes
	private final static int RESOLUCION_DEFECTO=20;
	private final static boolean SINTONIZADOR_DEFECTO=false;
	
	//Atributos
	private int resolucion;
	private boolean sintonizadorTDT;
	
	//Constructores
	public Television() {
		this.resolucion=RESOLUCION_DEFECTO;
		this.sintonizadorTDT=SINTONIZADOR_DEFECTO;
		this.color=COLOR_DEFECTO;
		this.consumoEnergetico=CONSUMO_DEFECTO;
		this.precioBase=PRECIO_BASE_DEFECTO;
		this.peso=PESO_DEFECTO;
	}
	
	public Television(int precioBase, int peso) {
		this.precioBase=precioBase;
		this.peso=peso;		
		this.resolucion=RESOLUCION_DEFECTO;
		this.sintonizadorTDT=SINTONIZADOR_DEFECTO;
		this.color=COLOR_DEFECTO;
		this.consumoEnergetico=CONSUMO_DEFECTO;
	}

	public Television(int resolucion, boolean sintonizadorTDT, String color, char consumo, int precioBase, int peso) {
		super(color, consumo, precioBase, peso);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}
	
	//Metodos
	public int precioFinal() {
		int aumentoPrecio = super.precioFinal();
		if(resolucion>40) {
			aumentoPrecio+=precioBase*0.3;
		}
		if(sintonizadorTDT) {
			aumentoPrecio+=50000;
		}
		return aumentoPrecio;
	}
	
	public int getResolucion() {
		return resolucion;
	}
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	
	
	
		
}
