package evaluacion2;

public class Electrodomestico {
	
	//Constantes	
	protected final static String COLOR_DEFECTO = "blanco";
	protected final static char CONSUMO_DEFECTO = 'F';
	protected final static int PRECIO_BASE_DEFECTO = 100000;
	protected final static int PESO_DEFECTO = 5;
	
	//Atributos	
	protected String color;
	protected char consumoEnergetico;
	protected int precioBase;
	protected int peso;
	
	//Constructores	
	public Electrodomestico () {		
		this.color=COLOR_DEFECTO;
		this.consumoEnergetico=CONSUMO_DEFECTO;
		this.precioBase=PRECIO_BASE_DEFECTO;
		this.peso=PESO_DEFECTO;
	}
	
	public Electrodomestico(int precioBase, int peso) {		
		this.precioBase=precioBase;
		this.peso=peso;		
		this.color=COLOR_DEFECTO;
		this.consumoEnergetico=CONSUMO_DEFECTO;
	}
	
	public Electrodomestico(String color, char consumo, int precioBase, int peso) {		
		this.precioBase=precioBase;
		this.peso=peso;
		comprobarConsumoEnergetico(Character.toUpperCase(consumo));
		comprobarColor(color.toLowerCase());
	}
	
	//Métodos
	public void comprobarConsumoEnergetico(char consumoEnergetico) {
		if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_DEFECTO;
        }
	}
	
	public void comprobarColor(String color) {		
		String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){              
            if(colores[i].equals(color)){
                encontrado=true;
            }              
        }          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEFECTO;
        }
        
	}
	
	public int precioFinal() {
		int aumentoPrecio=0;
        switch(consumoEnergetico){
            case 'A':
            	aumentoPrecio+=100000;
                break;
            case 'B':
            	aumentoPrecio+=80000;
                break;
            case 'C':
            	aumentoPrecio+=60000;
                break;
            case 'D':
            	aumentoPrecio+=50000;
                break;
            case 'E':
            	aumentoPrecio+=30000;
                break;
            case 'F':
            	aumentoPrecio+=10000;
                break;
        }
   
        if(peso>=0 && peso<19){
        	aumentoPrecio+=10000;
        }else if(peso>=20 && peso<49){
        	aumentoPrecio+=50000;
        }else if(peso>=50 && peso<=79){
        	aumentoPrecio+=80000;
        }else if(peso>=80){
        	aumentoPrecio+=100000;
        }
   
        return precioBase+aumentoPrecio;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public char getConsumoEnergetico() {
		return this.consumoEnergetico;
	}
	
	public int getPrecioBase(){
		return this.precioBase;
	}
	
	public int getPeso() {
		return this.peso;
	}


	
	
}
