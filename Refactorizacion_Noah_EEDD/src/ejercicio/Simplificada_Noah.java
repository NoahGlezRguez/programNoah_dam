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
	
	private JTextField txtNumero = new JTextField(10);
	private JTextField txtNombre = new JTextField(25);
	private JTextField txtLocalidad = new JTextField(25);
	
	//string numdep = getText de txtNumero
	//string nomdep = getText de txtNombre
	//string localidep = getText de txtLocalidad
	/*
	 * La idea seria leer si los datos son correctos para luego operar mas rapidamente con estos datos
	 * evitando asi declarar las mismas variables en cada metodo xd
	 * */
	

	private JLabel 	lMensajeInformativo = new JLabel(" ----------------------------- ");//revisar esto mas tarde // MUY cuesitonable

	private JButton 	bInsertar = new JButton("Insertar Depart.");
	private JButton	bConsultar = new JButton("Consultar Depart.");
	private JButton 	bBorrar = new JButton("Borrar Depart.");
	private JButton 	bLimpiarDatos = new JButton("Limpiar datos");
	private JButton 	bModificar = new JButton("Modificar Departamento");
	private JButton 	bVerEnConsola = new JButton("Ver por consola");
	private JButton 	bCerrar = new JButton("CERRAR");
	
	private static int numDepart; //cuestionable
	
	public Simplificada_Noah(JFrame marcoVentana) {
		
		setTitle("GESTIÓN DE DEPARTAMENTOS.");	
		iniciarPanelesConEtiquetas();	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		iniciarBotones();
	}

	public void iniciarPanelesConEtiquetas() {
		
		JPanel	pCabecera;
		JPanel	pNumeroDepart;
		JPanel	pNombreDepart;
		JPanel	pLocalidadDepart;
		JPanel	pOperacionesDepart;
		JPanel	pOperacionesVentana;
		JPanel	pMensajeInferior;

		JLabel lTitulo = new JLabel("GESTIÓN DE DEPARTAMENTOS");
		JLabel lNumero = new JLabel("NÚMERO DEPARTAMENTO:");
		JLabel lNombre = new JLabel("NOMBRE:");
		JLabel lLocalidad = new JLabel("LOCALIDAD:");
		
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
		boolean	existe;
		
		informarBotonClickado(((JButton)evento.getSource()).getText());
			
		if (evento.getSource() == bCerrar) { 
			System.exit(0);
		}
		else if (evento.getSource() == bVerEnConsola) { 
			try {
				lMensajeInformativo.setText("Visualizando el fichero por la consola.....");
				verPorConsola();
			} catch (IOException e1) {
				System.out.println("ERROR AL LEER AleatorioDep.dat");
			}
		}		
		else if (evento.getSource() == bLimpiarDatos) {
			limpiarDatos(1);
		}
		else {
			
			if (validarDatosIntroducidos()) {
				
				existe = verificarExistencia();		
		
				if (!existe && evento.getSource() != bInsertar) {
					gestionarErrorNoExiste();
				}
				else {
	
					if (evento.getSource() == bInsertar) {
					
						guardarDepart(numDepart, txtNombre.getText(), txtLocalidad.getText());						
						lMensajeInformativo.setText("NUEVO DEPARTAMENTO GRABADO.");
					}
					else if (evento.getSource() == bConsultar) {				
						visualizarDepart(numDepart);				
					}
			
					else if (evento.getSource() == bBorrar) {
						visualizarDepart(numDepart);
						
						confirmacion = JOptionPane.showConfirmDialog(this, "ESTAS SEGURO DE BORRAR...",
								"AVISO BORRADO.", JOptionPane.OK_CANCEL_OPTION);
						
						// si devuelve 0 es OK
						if (confirmacion == 0) {
							borrarDepart(numDepart);
							lMensajeInformativo.setText(" REGISTRO BORRADO: " + numDepart);						
							limpiarDatos(0);
						}					
					}				
					else if (evento.getSource() == bModificar) {
											
						confirmacion = JOptionPane.showConfirmDialog(this, "ESTAS SEGURO DE MODIFICAR...",
									"AVISO MODIFICACIÓN.", JOptionPane.OK_CANCEL_OPTION);
							
						// si devuelve 0 es OK
						if (confirmacion == 0) {
							modificarDepart(numDepart);
							lMensajeInformativo.setText(" REGISTRO MODIFICADO: " + numDepart);
						}	
					}				
					
				}
			}
		}
	}

	private void limpiarDatos(int caso) {
		
		if (caso == 1) {
			txtNumero.setText(null);
		}
		txtNombre.setText(null);
		txtLocalidad.setText(null);
	}
	
	private void gestionarErrorNoExiste() {
		lMensajeInformativo.setText("DEPARTAMENTO NO EXISTE.");
		limpiarDatos(0);
	}
	
	private void informarBotonClickado(String botonPulsado) {
		lMensajeInformativo.setText("Has pulsado el botón ".concat(botonPulsado));
	}
	
	private boolean validarDatosIntroducidos() {
		
		boolean esCorrecto = false;
		
		try {
			numDepart = Integer.parseInt(txtNumero.getText());
			
			if (numDepart > 0) {
				esCorrecto = true;
			}
			else {
				lMensajeInformativo.setText("DEPARTAMENTO DEBE SER MAYOR QUE 0");			
			}
			
		} catch (java.lang.NumberFormatException excepFormatoNumerico){
			lMensajeInformativo.setText("DEPARTAMENTO ERRÓNEO.");
		}
		
		return (esCorrecto);
	}
	
	private boolean verificarExistencia() {
		
		boolean existe = true;
		
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
		
		return (existe);
	}
	
	//esta fumada esta fatal
	public void verPorConsola() throws IOException, FileNotFoundException {
		String nombreDep = "", localizacionDep = "";
		int numDep = 0;
		long indice;
		File fichero = new File("AleatorioDep.dat");
		RandomAccessFile archivo = new RandomAccessFile(fichero, "r");
		char cad[] = new char[10], aux;
		
		if (archivo.length() > 0) {
			indice = 0; // para situarnos al principio
			System.out.println(" ------------------------------------------");
			System.out.println(" - - - VISUALIZO POR CONSOLA ");
			for (;;) { // recorro el fichero, visualiza tambi�n las posiciones vac�as
				archivo.seek(indice);
				numDep = archivo.readInt(); // obtengo el dep
				for (int i = 0; i < cad.length; i++) {
					aux = archivo.readChar();// recorro uno a uno los caracteres del apellido
					cad[i] = aux; // los voy guardando en el array
				}
				nombreDep = new String(cad);// convierto a String el array
				for (int i = 0; i < cad.length; i++) {
					aux = archivo.readChar();
					cad[i] = aux;
				}
				localizacionDep = new String(cad);// convierto a String el array
				System.out.println("DEP: " + numDep + ", Nombre: " + nombreDep + ", Localidad: " + localizacionDep);
				indice = indice + 44;
				// Si he recorrido todos los bytes salgo del for
				if (archivo.getFilePointer() == archivo.length()) {
					archivo.close();
					break;
				}
			}
			
			archivo.close(); // cerrar fichero
			System.out.println(" ------------------------------------------");
		} else // esto s�lo sale la primera vez //pero que dices machango
			System.out.println(" ---------FICHERO VAC�O --------------------");
	}

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
	} 

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
	} 

	void guardarDepart(int numDep, String nombreDep, String localizacionDep) {
		long pos;
		StringBuffer buffer = null;
		File fichero = new File("AleatorioDep.dat");
		try {
			RandomAccessFile file = new RandomAccessFile(fichero, "rw");
			// Calculo del reg a leer
			pos = 44 * (numDep - 1);
			// if (file.length()==0) return false; // si est� vac�o

			file.seek(pos);
			file.writeInt(numDep);
			buffer = new StringBuffer(nombreDep);
			buffer.setLength(10);
			file.writeChars(buffer.toString());// insertar nombre
			buffer = new StringBuffer(localizacionDep);
			buffer.setLength(10);
			file.writeChars(buffer.toString());// insertar loc
			file.close();
			System.out.println(" GRABADO el " + numDep);
		} catch (IOException e1) {
			System.out.println("ERRROR AL grabar AleatorioDep.dat");
			e1.printStackTrace();
		}
	} 
}

