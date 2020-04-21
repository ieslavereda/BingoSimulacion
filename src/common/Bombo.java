/**
 * 
 */
package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Joaquin Vicente
 *
 */
public class Bombo {

	private ArrayList<Bola> bolas;
	private int cantidad;

	public Bombo(int cantidad) {
		super();
		this.cantidad = cantidad;
		
		Set<Bola> bolasSet = new LinkedHashSet<Bola>();
		for(int i=1;i<=cantidad;i++)
			bolasSet.add(new Bola(i));
		
		bolas = new ArrayList<Bola>(bolasSet);
		
	}
	
	public void mover() {	
		
		Collections.shuffle(bolas);	
		
	}
	
	public Bola sacarBola() {	
		
		return bolas.remove(0);		
	}

	@Override
	public String toString() {
		return bolas.toString();
	}
	
	
	
}
