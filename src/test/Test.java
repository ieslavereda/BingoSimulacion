/**
 * 
 */
package test;

import common.Bola;
import common.Bombo;
import common.Tablero;

/**
 * @author Joaquin Vicente
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Bombo b = new Bombo(74);
		Tablero t = new Tablero(74);
		Bola bola;
		b.mover();
		System.out.println(b);
		
		bola = b.sacarBola();
		
		
		t.colocarBola(bola);
		
		
		
		
		System.out.println(t);
		System.out.println(t.haSalido(bola));
		System.out.println(t.haSalido(new Bola(bola.getNumero()+1)));

	}

}
