package clase13;

public class Password {
	
	int longitud=8;
	String contrasena;
	
	public static String NUMEROS = "0123456789";	 
	public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz"; 
	public static String ESPECIALES = "Ò—";

	
	public Password(int longitud) {
		this.longitud=longitud;
	} 

	public static String getPass(String key, int longitud) {
		String pswd = "";
 
		for (int i = 0; i < longitud; i++) {
			pswd+=(key.charAt((int)(Math.random() * key.length())));
		}
 
		return pswd;
	}
	
	
}
