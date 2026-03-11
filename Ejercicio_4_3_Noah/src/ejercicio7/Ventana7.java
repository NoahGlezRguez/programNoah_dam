package ejercicio7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

/**
 * Esta clase permite al usuario introducir los datos del contacto que quiera, se validen los datos y se introduzcan en la
 * agenda siempre que quede espacio disponible.
 */
public class Ventana7 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private JPanel panelTabla;
	
	private JButton bAgregarContacto;
	
	private JTextField tNombre;
	private JTextField tApellidos;
	private JTextField tDNI;
	private JTextField tTelefono;
	
	private JTable tbAgenda;
	
	private JLabel lAgendaActualizada;
	private JLabel lTbNombre;
	private JLabel lTbApellidos;
	private JLabel lTbDNI;
	private JLabel lTbTelefono;

	private JLabel lNuevoContacto;
	private JLabel lNombre;
	private JLabel lApellidos;
	private JLabel lDNI;
	private JLabel lTelefono;
	
	private JSeparator separadorVertical; 
	
	private final int NOMBRE_SIZE = 140;
	private final int APELLIDOS_SIZE = 200;
	private final int DNI_SIZE = 90;
	private final int TFNO_SIZE = 100;

	private final int X_TABLA = 10;
	private final int Y_TABLA = 11;
	private final int ANCHO_TABLA = 712;
	private final int ALTO_TABLA = 250;
	
	public Ventana7() {
		setTitle("Mi agenda de contactos");	
		setearContenidoInicial();
	}
	
	/**
	 * Crea el panela inicial, el de la tabla y el separador vertical
	 */
	private void setearContenidoInicial() {
		
		Object[][] contenidoVacioTabla = new Object[][] {
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
		};
		
		//Compone el panel base
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1445, 730);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		panelTabla = new JPanel();
		panelTabla.setBounds(635, 230, 741, 273);
		panelPrincipal.add(panelTabla);
		panelTabla.setLayout(null);
		
		//Crea y coloca los label, textfields y el boton de la parte rellenable por el usuario
		crearFormulario();
		
		separadorVertical = new JSeparator();
		separadorVertical.setOrientation(SwingConstants.VERTICAL);
		separadorVertical.setBounds(583, 32, 2, 629);
		panelPrincipal.add(separadorVertical);
		
		//Crea y coloca una tabla vacía con unas label externas
		crearLabelsTabla();
		crearJTablaAgenda(contenidoVacioTabla);
		
		panelPrincipal.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tNombre, tApellidos, tDNI, tTelefono, bAgregarContacto}));
	}

	/**
	 * Crea el boton, las etiquetas, los campos de texto, en su estado inicial.
	 *
	 */
	private void crearFormulario() {

		Font fuenteLabels;
		Font fuenteTextFields;
		
		fuenteLabels = new Font("SimSun-ExtB", Font.BOLD, 18);
		fuenteTextFields = new Font("SimSun-ExtB", Font.PLAIN, 18);
		
		lNuevoContacto = new JLabel("Nuevo Contacto");
		lNombre = new JLabel("Nombre");
		lApellidos = new JLabel("Apellidos");
		lDNI = new JLabel("DNI");
		lTelefono = new JLabel("Telefono");
		
		tNombre = new JTextField();
		tApellidos = new JTextField();
		tDNI = new JTextField();
		tTelefono = new JTextField();
		
		bAgregarContacto = new JButton();
		
		lNuevoContacto.setHorizontalAlignment(SwingConstants.CENTER);
		lNuevoContacto.setFont(new Font("SimSun-ExtB", Font.BOLD, 21));
		lNuevoContacto.setBounds(178, 82, 198, 37);
		
		lNombre.setFont(fuenteLabels);
		lApellidos.setFont(fuenteLabels);
		lDNI.setFont(fuenteLabels);
		lTelefono.setFont(fuenteLabels);

		lNombre.setBounds(44, 183, 92, 37);	
		lApellidos.setBounds(44, 285, 92, 37);
		lDNI.setBounds(44, 387, 92, 37);
		lTelefono.setBounds(44, 496, 92, 37);

		lNombre.setLabelFor(tNombre);
		lApellidos.setLabelFor(tApellidos);
		lDNI.setLabelFor(tDNI);
		lTelefono.setLabelFor(tTelefono);
		
		panelPrincipal.add(lNuevoContacto);
		panelPrincipal.add(lNombre);
		panelPrincipal.add(lApellidos);
		panelPrincipal.add(lDNI);
		panelPrincipal.add(lTelefono);
		
		tNombre.setFont(fuenteTextFields);
		tApellidos.setFont(fuenteTextFields);
		tDNI.setFont(fuenteTextFields);
		tTelefono.setFont(fuenteTextFields);

		tNombre.setBounds(191, 187, 332, 29);
		tApellidos.setBounds(191, 289, 332, 29);
		tDNI.setBounds(191, 391, 332, 29);
		tTelefono.setBounds(191, 493, 332, 29);
		
		tNombre.setColumns(10);
		tApellidos.setColumns(10);
		tDNI.setColumns(10);
		tTelefono.setColumns(10);

		panelPrincipal.add(tNombre);
		panelPrincipal.add(tApellidos);		
		panelPrincipal.add(tDNI);
		panelPrincipal.add(tTelefono);

		bAgregarContacto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bAgregarContacto.setBounds(379, 579, 144, 37);
		bAgregarContacto.setText("Agregar contacto");
		bAgregarContacto.addActionListener(this);
		
		panelPrincipal.add(bAgregarContacto);
	}
	
	/**
	 * Crea las etiquetas correspondientes a la tabla de la agenda
	 */
	private void crearLabelsTabla() {
		
		Font fuenteLabelTabla = new Font("Candara Light", Font.BOLD, 18);
		
		lAgendaActualizada = new JLabel("Mi agenda actualizada");
		lTbNombre = new JLabel("Nombre");
		lTbApellidos = new JLabel("Apellidos");
		lTbDNI = new JLabel("DNI");
		lTbTelefono = new JLabel("Telefono");

		lAgendaActualizada.setHorizontalAlignment(SwingConstants.CENTER);
		
		lAgendaActualizada.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));
		lTbNombre.setFont(fuenteLabelTabla);
		lTbApellidos.setFont(fuenteLabelTabla);
		lTbDNI.setFont(fuenteLabelTabla);
		lTbTelefono.setFont(fuenteLabelTabla);
		
		lAgendaActualizada.setBounds(871, 82, 265, 37);
		lTbNombre.setBounds(703, 211, 79, 28);
		lTbApellidos.setBounds(916, 211, 79, 28);
		lTbDNI.setBounds(1128, 211, 38, 28);
		lTbTelefono.setBounds(1247, 211, 79, 28);
		
		panelPrincipal.add(lAgendaActualizada);
		panelPrincipal.add(lTbNombre);
		panelPrincipal.add(lTbApellidos);
		panelPrincipal.add(lTbDNI);
		panelPrincipal.add(lTbTelefono);	
	}
	
	/**
	 * Crea una tabla que rellena su modelo de datos segun el array bidimensional que recibe
	 * aunque su estructura es fija y no valida los datos recibidos
	 * @param contenidoTabla - los datos que se quiere introducir en las casillas de la tabla
	 */
	private void crearJTablaAgenda(Object[][] contenidoTabla) {

		String columnas[] = {"Nombre", "Apellidos", "DNI", "Telefono"};
		
		tbAgenda = new JTable();
		tbAgenda.setRowSelectionAllowed(false);
		
		tbAgenda.setBounds(X_TABLA, Y_TABLA, ANCHO_TABLA, ALTO_TABLA);
		
		tbAgenda.setFont(new Font("SimSun-ExtB", Font.PLAIN, 18));
		tbAgenda.setBackground(new Color(240, 248, 255));
		tbAgenda.setBorder(new LineBorder(new Color(0, 0, 128), 2, true));
		tbAgenda.setModel(new DefaultTableModel(contenidoTabla, columnas) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tbAgenda.getColumnModel().getColumn(0).setPreferredWidth(NOMBRE_SIZE);
		tbAgenda.getColumnModel().getColumn(1).setPreferredWidth(APELLIDOS_SIZE);
		tbAgenda.getColumnModel().getColumn(2).setPreferredWidth(DNI_SIZE);
		tbAgenda.getColumnModel().getColumn(3).setPreferredWidth(TFNO_SIZE);
		
		tbAgenda.setRowHeight(50);

		tbAgenda.setFocusable(false);
		
		panelTabla.add(tbAgenda);
	}
	
	/**
	 * Analiza el contenido de la tabla, y mientras haya algo, lo copia en un array de strings bidimensional.
	 * En caso de no haber nada, o quedar espacio disponible, mandará por terminal un mensaje de que ya no hay nada más por copiar.
	 * @return
	 */
	private String[][] recogerDatos() {
		
		String[][] datosLeidos = new String[5][4];
		

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				try {
					datosLeidos[i][j] = tbAgenda.getValueAt(i, j).toString();
				} catch (NullPointerException errorNulo){
					System.out.print("No hay más datos para copiar...");
					datosLeidos[i][j] = null;
				}
			}
		}
		
		return (datosLeidos);
	}
	
	/**
	 * Revisa el contenido de la tabla para verificar si queda espacio para guardar algún contacto mas.
	 * @param datos - los datos que tiene la tabla
	 * @return true si hay espacio disponible, false en caso contrario
	 */
	private boolean hayEspacio(String[][] datos) {
		
		boolean		hayEspacio = false;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (datos[i][j] == null) {
					hayEspacio = true;
				}
			}
		}
		
		return (hayEspacio);
	}
	 /**
	  * Este metodo copia los datos que habia previamente en la tabla y cuando se encuentra con el primer espacio, rellena una 
	  * fila con los datos introducidos por el usuario
	  * @param datosOriginales - los datos que habia antes en la tabla
	  * @return los datos al completo, los previos sumado a los nuevos
	  */
	private String[][] actualizarDatos(String[][] datosOriginales){
	
		String[][]	datosActualizados = new String[5][4];
		boolean		copiaRealizada = false;
		
		for (int i = 0; i < 5; i++) {
			
			if (datosOriginales[i][0] != null) {
			
				for (int j = 0; j < 4; j++) {
					datosActualizados[i][j] = datosOriginales[i][j];
				}
			}
			else if (!copiaRealizada){
				datosActualizados[i][0] = tNombre.getText();
				datosActualizados[i][1] = tApellidos.getText();
				datosActualizados[i][2] = tDNI.getText();
				datosActualizados[i][3] = tTelefono.getText();
				copiaRealizada = true;
			}
		}
		
		return (datosActualizados);
	}
	
	/**
	 * Este metodo valida todos los campos de texto que el usuario debe rellenar para poder guardar un contacto en su agenda.
	 * Cuando algo no es valido, indica al usuario con un pop up el tipo de error que esta sucediendo.
	 * @return true si todos los datos son aptos, false en caso contrario
	 */
	private boolean datosCorrectos() {
		boolean todoBien = true;
		
		String nombre;
		String apellidos;
		String dni;
		String telefono;
		
		nombre = tNombre.getText();
		apellidos = tApellidos.getText();
		dni = tDNI.getText();
		telefono = tTelefono.getText();
		
		
		if (nombre.isBlank() || apellidos.isBlank() || dni.isBlank() || telefono.isBlank()) {
			JOptionPane.showInternalMessageDialog(panelPrincipal, "Falta algún dato por rellenar...");
			todoBien = false;
		}
		else if (nombre.length() < 1 || nombre.length() > 20) {
			todoBien = false;
			JOptionPane.showInternalMessageDialog(panelPrincipal, "Nombre con formato incorrecto...");
		}
		else if (apellidos.length() < 1 || apellidos.length() > 30) {
			todoBien = false;
			JOptionPane.showInternalMessageDialog(panelPrincipal, "Apellidos con formato incorrecto...");
		}
		else {
			for (int i = 0; i < nombre.length(); i++) {
				if (!Character.isLetter(nombre.charAt(i)) && nombre.charAt(i) != ' ') {
					todoBien = false;
					JOptionPane.showInternalMessageDialog(panelPrincipal, "Nombre con formato incorrecto...");
				}
			}
			
			for (int i = 0; i < nombre.length(); i++) {
				if (!Character.isLetter(apellidos.charAt(i)) && apellidos.charAt(i) != ' ') {
					todoBien = false;
					JOptionPane.showInternalMessageDialog(panelPrincipal, "Apellidos con formato incorrecto...");
				}
			}
			
			if (dni.length() == 9) {
				if (Character.isLetter(dni.charAt(8))){
					dni = dni.substring(0, 8);
					for (int i = 0; i < dni.length(); i++) {
						if (!Character.isDigit(dni.charAt(i))) {
							todoBien = false;
						}
					}
				}
				if (!todoBien) {
					JOptionPane.showInternalMessageDialog(panelPrincipal, "DNI con formato incorrecto...");
				}
			}
			else {
				JOptionPane.showInternalMessageDialog(panelPrincipal, "DNI con formato incorrecto...");
				todoBien = false;
			}
			
			if (telefono.length() == 9) {
				for (int i = 0; i < telefono.length(); i++) {
					if (!Character.isDigit(telefono.charAt(i))) {
						todoBien = false;
					}
				}
			}
			else {
				JOptionPane.showInternalMessageDialog(panelPrincipal, "Teléfono con formato incorrecto...");
				todoBien = false;
			}
		}
		
		return (todoBien);
	}
	
	/**
	 * Este metodo gestiona el evento de clicar el boton de agregar contacto, siempre verificando los
	 * datos y si queda espacio para poder guardar mas contactos en la agenda.
	 * Cada vez que se guarda uno nuevo, refresca el contenido de la tbala y del panel de la tabla.
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		String[][] datosTabla = new String[5][4];
		
		if (evento.getSource() == bAgregarContacto) {
			
			if (datosCorrectos()) {
			
				datosTabla = recogerDatos();
				
				if (hayEspacio(datosTabla)) {
					datosTabla = actualizarDatos(datosTabla);
					panelTabla.remove(tbAgenda);
					crearJTablaAgenda(datosTabla);
					panelTabla.updateUI();
					tNombre.setText(null);
					tApellidos.setText(null);
					tDNI.setText(null);
					tTelefono.setText(null);
				}
				else {
					JOptionPane.showInternalMessageDialog(panelPrincipal, "Agenda llena, cómprese otra...");
				}
			}
		}
	}
}
