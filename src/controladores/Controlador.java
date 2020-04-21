/**
 * 
 */
package controladores;

/**
 * @author Joaquin Vicente
 *
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

import common.BingoSimulacion;
import common.Bola;
import view.JFSimulador;

public class Controlador implements ActionListener {

	private JFSimulador vista;
	private Set<Bola> temasEstudiados;
	private BingoSimulacion bingo;
	private int bolasAExtraer;
	private int simulaciones;
	private int cantidadBolas;

	public Controlador(JFSimulador vista) {
		super();
		this.vista = vista;
		inicializar();
	}

	private void inicializar() {
		vista.getBtnSimular().addActionListener(this);
	}

	public void start() {
		vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Carga de datos
		cargarDatos();

		// Completar el proceso de simulacion
		
		
		
		
		// Mostrar resumen final
		
		

	}

	// Mostrar resumen final a partir de la cantidad de bolas acertadas
	private void mostrarResumen(int exito) {
		
		String texto = "";
		texto += "Iteraciones: " + simulaciones + "   Exito: " + exito + "    Fracaso: " + (100 - exito)
				+ "   Numero de temas: " + cantidadBolas + "   Temas estudiados: " + temasEstudiados.size() + "\n";
		texto += "Exito: " + (exito * 100 / simulaciones) + "%  Fracaso: " + (100 - (exito * 100 / simulaciones)) + "%";

		vista.getTextPane().setText(texto);

	}

	// Inicializa la tabla de la vista
	private void inicializarTabla() {

		DefaultTableModel dtm = new DefaultTableModel();

		dtm.addColumn("Simulacion");

		for (int i = 1; i <= bolasAExtraer; i++) {
			dtm.addColumn("Bola " + i);
		}

		dtm.addColumn("Exito");
		dtm.addColumn("Bolas acertadas");

		vista.getTable().setModel(dtm);
	}

	// Cargar datos desde la vista
	private void cargarDatos() {

		temasEstudiados = new HashSet<Bola>();

		cantidadBolas = (Integer) vista.getComboBoxBolas().getSelectedItem();

		String[] temasAsString = vista.getTextFieldTemas().getText().replaceAll(" ", "").split(",");

		for (String tema : temasAsString)
			temasEstudiados.add(new Bola(Integer.parseInt(tema)));

		bolasAExtraer = (int) vista.getSpinner().getValue();
		simulaciones = vista.getSlider().getValue();

		bingo = new BingoSimulacion(cantidadBolas);

		inicializarTabla();
	}

}