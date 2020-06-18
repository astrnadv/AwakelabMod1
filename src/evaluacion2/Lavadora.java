package evaluacion2;

public class Lavadora extends Electrodomestico{
	
	//Constante
	private final static int CARGA_DEFECTO = 5;
	
	//Atributo
	private int carga;
	
	//Constructores	
	public Lavadora(){		
		this.color=COLOR_DEFECTO;
		this.consumoEnergetico=CONSUMO_DEFECTO;
		this.precioBase=PRECIO_BASE_DEFECTO;
		this.peso=PESO_DEFECTO;
		this.carga=CARGA_DEFECTO;
	}
	
	public Lavadora(int precioBase, int peso) {		
		this.precioBase=precioBase;
		this.peso=peso;		
		this.carga=CARGA_DEFECTO;
		this.color=COLOR_DEFECTO;
		this.consumoEnergetico=CONSUMO_DEFECTO;
	}
	
	public Lavadora(int carga, int precioBase, int peso, String color, char consumo){		
		super(color, consumo, precioBase, peso);
		this.carga=carga;	
	}
	
	//Métodos
	
	public int getCarga(){
		return this.carga;
	}
	
	public int precioFinal() {
		int aumentoPrecio = super.precioFinal();
		
		if(carga>30) {
			aumentoPrecio+=50000;
		}
		return aumentoPrecio;
	}


}
