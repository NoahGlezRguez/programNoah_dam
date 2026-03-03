package ejercicio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Simplificada_Noah extends JFrame implements ActionListener {

	private static final long	serialVersionUID = 1L;
	private static final String	TITULO_VENTANA = "GESTIÓN DE DEPARTAMENTOS.";
	
	private JTextField txtNumero = new JTextField(10);
	private JTextField txtNombre = new JTextField(25);
	private JTextField txtLocalidad = new JTextField(25);

	private JLabel lMensajeInformativo = new JLabel(" ----------------------------- ");//revisar esto mas tarde
	private JLabel lTitulo = new JLabel("GESTIÓN DE DEPARTAMENTOS");
	private JLabel lNumero = new JLabel("NÚMERO DEPARTAMENTO:");
	private JLabel lNombre = new JLabel("NOMBRE:");
	private JLabel lLocalidad = new JLabel("LOCALIDAD:");

	private JButton bInsertar = new JButton("Insertar Depart.");
	private JButton bConsultar = new JButton("Consultar Depart.");
	private JButton bBorrar = new JButton("Borrar Depart.");
	private JButton bLimpiarDatos = new JButton("Limpiar datos");
	private JButton bModificar = new JButton("Modificar Departamento");
	private JButton bVerEnConsola = new JButton("Ver por consola");
	private JButton bCerrar = new JButton("CERRAR");
	
	public Simplificada_Noah(JFrame marcoVentana) {
		
		setTitle(TITULO_VENTANA);
		
		iniciarPaneles();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		iniciarBotones();
	}

	public void iniciarPaneles() {
		
		JPanel	pCabecera;
		JPanel	pNumeroDepart;
		JPanel	pNombreDepart;
		JPanel	pLocalidadDepart;
		JPanel	pOperacionesDepart;
		JPanel	pOperacionesVentana;
		JPanel	pMensajeInferior;
		
		pCabecera = new JPanel();
		pNumeroDepart = new JPanel();		
		pNombreDepart = new JPanel();		
		pLocalidadDepart = new JPanel();		
		pOperacionesDepart = new JPanel();
		pOperacionesVentana = new JPanel();		
		pMensajeInferior = new JPanel();		
			
		Panel.crearPanel(pCabecera, lTitulo, Color.CYAN);
		Panel.crearPanel(pNumeroDepart, lNumero, txtNumero, bConsultar);
		Panel.crearPanel(pNombreDepart, lNombre, txtNombre);
		Panel.crearPanel(pLocalidadDepart, lLocalidad, txtLocalidad);
		Panel.crearPanel(pOperacionesDepart, bInsertar, bBorrar, bModificar, Color.YELLOW);
		Panel.crearPanel(pOperacionesVentana, bLimpiarDatos, bVerEnConsola, bCerrar, Color.PINK);
		Panel.crearPanel(pMensajeInferior, lMensajeInformativo);
		
		// para ver la ventana y colocar los controles verticalmente
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		// a�adir los panel al frame
		add(pCabecera);
		add(pNumeroDepart);
		add(pNombreDepart);
		add(pLocalidadDepart);
		add(pOperacionesDepart);
		add(pOperacionesVentana);
		add(pMensajeInferior);
		
		pack(); // hace que se coloquen alineados los elementos de cada JPanel
	}
	
	public void iniciarBotones() {
		
		bInsertar.addActionListener(this);
		bLimpiarDatos.addActionListener(this);
		bCerrar.addActionListener(this);
		bConsultar.addActionListener(this);
		bBorrar.addActionListener(this);
		bModificar.addActionListener(this);
		bVerEnConsola.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		int		numDepart = -1;
		int		confirmacion;
		boolean	esCorrecto = false;
		boolean	existe = true;
		
		//Analizar previamente si el valor introducido es correcto y consultar si existe
		try {
			numDepart = Integer.parseInt(txtNumero.getText());
			
			if (numDepart > 0) {
				esCorrecto = true;
				
				try {
					if (consultarDepart(numDepart)) {
						lMensajeInformativo.setText("DEPARTAMENTO EXISTE");
					}
				} catch (FileNotFoundException excepNoExiste) {
					existe = false;
				} catch (IOException exError) {
					System.out.println("ERROR AL LEER AleatorioDep.dat");
					exError.printStackTrace();				
				}
			}
			else {
				lMensajeInformativo.setText("DEPARTAMENTO DEBE SER MAYOR QUE 0");			
			}
			
		} catch (java.lang.NumberFormatException excepFormatoNumerico){
			lMensajeInformativo.setText("DEPARTAMENTO ERRÓNEO.");
		}
		
		if (esCorrecto) {
					
			// Pulsado botón Insertar
			if (evento.getSource() == bInsertar) {
				lMensajeInformativo.setText(" has pulsado el botón Insertar");
				
				if (!existe) {
					lMensajeInformativo.setText("NUEVO DEPARTAMENTO.");
					
					guardarDepart(numDepart, txtNombre.getText(), txtLocalidad.getText());
					
					lMensajeInformativo.setText("NUEVO DEPARTAMENTO GRABADO.");
				}
			}
	
			// Pulsado botón CONSULTAR
			if (evento.getSource() == bConsultar) {
				lMensajeInformativo.setText(" has pulsado el boton Consultar");
				
				if (existe) {
					visualizarDepart(numDepart);
				} else {
					lMensajeInformativo.setText("DEPARTAMENTO NO EXISTE");
					
					txtNombre.setText(null);
					txtLocalidad.setText(null);
				}
			}
	
			// Pulsado botón BORRAR
			if (evento.getSource() == bBorrar) {
				lMensajeInformativo.setText(" has pulsado el boton Borrar");
				
				if (existe) {
					visualizarDepart(numDepart);
					
					confirmacion = JOptionPane.showConfirmDialog(this, "ESTAS SEGURO DE BORRAR...",
							"AVISO BORRADO.", JOptionPane.OK_CANCEL_OPTION);
					
					// si devuelve 0 es OK
					if (confirmacion == 0) {
						borrarDepart(numDepart);
						
						lMensajeInformativo.setText(" REGISTRO BORRADO: " + numDepart);
						
						txtNombre.setText(null);
						txtLocalidad.setText(null);
					}
				} else {
					lMensajeInformativo.setText("DEPARTAMENTO NO EXISTE.");
					txtNombre.setText(null);
					txtLocalidad.setText(null);
				}
					
	
			}
			
			// Pulsado bot�n MODIFICAR
			if (evento.getSource() == bModificar) {
				lMensajeInformativo.setText(" has pulsado el boton Modificar.");
				
				if (existe) {
					confirmacion = JOptionPane.showConfirmDialog(this, "ESTAS SEGURO DE MODIFICAR...",
							"AVISO MODIFICACIÓN.", JOptionPane.OK_CANCEL_OPTION);
					
					// si devuelve 0 es OK
					if (confirmacion == 0) {
						modificarDepart(numDepart);
						lMensajeInformativo.setText(" REGISTRO MODIFICADO: " + numDepart);
					}
				} else {
					lMensajeInformativo.setText("DEPARTAMENTO NO EXISTE.");
					
					txtNombre.setText(null);
					txtLocalidad.setText(null);
				}
					
			}
			
			// Pulsado bot�n SALIR
			if (evento.getSource() == bCerrar) { 
				System.exit(0);
			}
			
			// Pulsado bot�n VER POR CONSOLA
			if (evento.getSource() == bVerEnConsola) { 
				try {
					lMensajeInformativo.setText("Visualizando el fichero por la consola.....");
					verPorConsola();
				} catch (IOException e1) {
					System.out.println("ERROR AL LEER AleatorioDep.dat");
				}
			}
			
			// Pulsado bot�n LIMPIAR
			if (evento.getSource() == bLimpiarDatos) {
				lMensajeInformativo.setText(" has pulsado el boton limpiar.");
				
				txtNumero.setText(null);
				txtNombre.setText(null);
				txtLocalidad.setText(null);
			}
		}
	}

	
	
	public void verPorConsola() throws IOException, FileNotFoundException {
		String nom = "", loc = "";
		int dep = 0;
		long pos;
		File fichero = new File("AleatorioDep.dat");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		char cad[] = new char[10], aux;
		
		if (file.length() > 0) {
			pos = 0; // para situarnos al principio
			System.out.println(" ------------------------------------------");
			System.out.println(" - - - VISUALIZO POR CONSOLA ");
			for (;;) { // recorro el fichero, visualiza tambi�n las posiciones vac�as
				file.seek(pos);
				dep = file.readInt(); // obtengo el dep
				for (int i = 0; i < cad.length; i++) {
					aux = file.readChar();// recorro uno a uno los caracteres del apellido
					cad[i] = aux; // los voy guardando en el array
				}
				nom = new String(cad);// convierto a String el array
				for (int i = 0; i < cad.length; i++) {
					aux = file.readChar();
					cad[i] = aux;
				}
				loc = new String(cad);// convierto a String el array
				System.out.println("DEP: " + dep + ", Nombre: " + nom + ", Localidad: " + loc);
				pos = pos + 44;
				// Si he recorrido todos los bytes salgo del for
				if (file.getFilePointer() == file.length()) {
					file.close();
					break;
				}
			}
			
			file.close(); // cerrar fichero
			System.out.println(" ------------------------------------------");
		} else // esto s�lo sale la primera vez
			System.out.println(" ---------FICHERO VAC�O --------------------");
	}// fin verporconsola

	boolean consultarDepart(int dep) throws IOException {
		long pos;
		int depa;
		File fichero = new File("AleatorioDep.dat");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		// Calculo del reg a leer
		
			pos = 44 * (dep - 1);
			if (file.length() == 0) {
				file.close();
				return false; // si est� vac�o
				
			}
			file.seek(pos);
			depa = file.readInt();
			file.close();
			System.out.println("Depart leido:" + depa);
			if (depa > 0)
				return true;
			else
				return false;
		
	} // fin consultar

	void visualizarDepart(int dep) {
		String nom = "", loca = "";
		long pos;
		int depa;
		File fichero = new File("AleatorioDep.dat");
		try {
			RandomAccessFile file = new RandomAccessFile(fichero, "r");
			// Calculo del reg a leer
			pos = 44 * (dep - 1);
			file.seek(pos);
			depa = file.readInt();
			System.out.println("Depart leido:" + depa);
			char nom1[] = new char[10], aux, loc1[] = new char[10];
			for (int i = 0; i < 10; i++) {
				aux = file.readChar();
				nom1[i] = aux;
			}
			for (int i = 0; i < 10; i++) {
				aux = file.readChar();
				loc1[i] = aux;
			}
			nom = new String(nom1);
			loca = new String(loc1);
			System.out.println("DEP: " + dep + ", Nombre: " + nom + ", Localidad: " + loca);
			txtNombre.setText(nom);
			txtLocalidad.setText(loca);
			file.close();
		} catch (IOException e1) {
			System.out.println("ERROR AL LEER AleatorioDep.dat");
			e1.printStackTrace();
		}
	} // fin visualiza

	void borrarDepart(int numDepart) { // con borrar ponemos a 0 el dep que se quiere borrar
							// y a blancos el nombre y la localidad
		String nom = "", loca = "";
		StringBuffer buffer = null;
		long pos;
		File fichero = new File("AleatorioDep.dat");
		try {
			RandomAccessFile file = new RandomAccessFile(fichero, "rw");
			// Calculo del reg a leer
			pos = 44 * (numDepart - 1);
			file.seek(pos);
			int depp = 0;
			file.writeInt(depp);
			buffer = new StringBuffer(nom);
			buffer.setLength(10);
			file.writeChars(buffer.toString());

			buffer = new StringBuffer(loca);
			buffer.setLength(10);
			file.writeChars(buffer.toString());
			System.out.println("----REGISTRO BORRADO--------");

			file.close();
		} catch (IOException e1) {
			System.out.println("ERRROR AL BORRAR AleatorioDep.dat");
			e1.printStackTrace();
		}
	} // fin borrar

	void modificarDepart(int dep) { // con modificar asignamos los datos tecleados
		String nom = "", loca = "";
		StringBuffer buffer = null;
		long pos;
		File fichero = new File("AleatorioDep.dat");
		try {
			RandomAccessFile file = new RandomAccessFile(fichero, "rw");
			// Calculo del reg a leer
			pos = 44 * (dep - 1);
			file.seek(pos);
			file.writeInt(dep);
			nom = txtNombre.getText();
			loca = txtLocalidad.getText();
			buffer = new StringBuffer(nom);
			buffer.setLength(10);
			file.writeChars(buffer.toString());
			buffer = new StringBuffer(loca);
			buffer.setLength(10);
			file.writeChars(buffer.toString());
			System.out.println("----REGISTRO MODIFICADO--------");

			file.close();
		} catch (IOException e1) {
			System.out.println("ERRROR AL MODIFICAR AleatorioDep.dat");
			e1.printStackTrace();
		}
	} // fin modificar

	void guardarDepart(int dep, String nom, String loc) {
		long pos;
		StringBuffer buffer = null;
		File fichero = new File("AleatorioDep.dat");
		try {
			RandomAccessFile file = new RandomAccessFile(fichero, "rw");
			// Calculo del reg a leer
			pos = 44 * (dep - 1);
			// if (file.length()==0) return false; // si est� vac�o

			file.seek(pos);
			file.writeInt(dep);
			buffer = new StringBuffer(nom);
			buffer.setLength(10);
			file.writeChars(buffer.toString());// insertar nombre
			buffer = new StringBuffer(loc);
			buffer.setLength(10);
			file.writeChars(buffer.toString());// insertar loc
			file.close();
			System.out.println(" GRABADO el " + dep);
		} catch (IOException e1) {
			System.out.println("ERRROR AL grabar AleatorioDep.dat");
			e1.printStackTrace();
		}
	} 
}

