package common;

public class Bingo {

	private Bombo bombo;
	private Tablero tablero;
	private int cantidad;
	
	public Bingo(int cantidad) {
		
		this.cantidad = cantidad;
		
		inicializar();
	}
	
	public void moverBolas() {
		bombo.mover();
	}
	
	public Bola sacarBola() {
		moverBolas();
		Bola bola = bombo.sacarBola();
		tablero.colocarBola(bola);
		return bola;
	}
	
	public void inicializar() {
		this.bombo = new Bombo(cantidad);
		this.tablero = new Tablero(cantidad);
	}
	
	
}
