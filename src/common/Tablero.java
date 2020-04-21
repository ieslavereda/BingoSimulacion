package common;

import java.util.LinkedHashMap;
import java.util.Map;

public class Tablero {

	private Map<Integer,Bola> tablero;
	private int cantidad;
	
	public Tablero(int cantidad) {
		this.cantidad = cantidad;
		
		tablero = new LinkedHashMap<Integer,Bola>();
		
		for(int i=1;i<=cantidad;i++)
			tablero.put(i, null);
	}
	
	public void colocarBola(Bola bola) {
		tablero.put(bola.getNumero(), bola);
	}
	
	public String toString() {
		
		String salida="";
		
		Bola bola;
		
		for(int i=1;i<=cantidad;i++) {
			bola = tablero.get(i);
			
			salida += (i%10==0)?i+": " + bola +"\n":i+": " + bola +"\t";
		}
		
		return salida;
			
		
	}
	public boolean haSalido(Bola bola) {
		
		return tablero.containsValue(bola);
	}
	
}
