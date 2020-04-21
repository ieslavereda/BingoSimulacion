package principal;

import controladores.Controlador;
import view.JFSimulador;

public class Simulacion {

	public static void main(String[] args) {

		Controlador controlador = new Controlador(new JFSimulador());
		controlador.start();
		

	}

}
