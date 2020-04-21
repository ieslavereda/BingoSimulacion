/**
 * 
 */
package common;

/**
 * @author Joaquin Vicente
 *
 */
public class Bola {

	private int numero;

	public Bola(int numero) {
		super();
		this.numero = numero;
	}

	/**
	 * 
	 * @return Numero de la bola
	 */
	public int getNumero() {
		return numero;
	}
	
	public int hashCode() {
		return numero;
	}
	
	
	public boolean equals (Object o) {
		if(o instanceof Bola) {
			Bola b = (Bola) o;
			return b.getNumero()==this.numero;
		}
		return false;
	}
	

	@Override
	public String toString() {
		return "(" + numero + ")";
	}

}
