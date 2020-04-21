package common;

import java.util.Vector;

public class BingoSimulacion extends Bingo{

	public BingoSimulacion(int cantidad) {
		super(cantidad);
		
	}
	/**
	 * 
	 * @param cantidad
	 * @return
	 */
	public Vector<Bola> sacarNumeroBolas(int cantidad){
		
		Vector<Bola> v = new Vector<Bola>();
		
		for(int i=1;i<=cantidad;i++)
			v.add(sacarBola());
		
		return v;
		
	}

}
