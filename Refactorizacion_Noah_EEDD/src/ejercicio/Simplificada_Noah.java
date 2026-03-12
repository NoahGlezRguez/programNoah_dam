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

	private JLabel 		lMensajeInformativo = new JLabel(" ----------------------------- ");//revisar esto mas tarde // MUY cuesitonable

	private JButton 	bInsertar = new JButton("Insertar Depart.");
	private JButton		bConsultar = new JButton("Consultar Depart.");
	private JButton 	bBorrar = new JButton("Borrar Depart.");
	private JButton 	bLimpiarDatos = new JButton("Limpiar datos");
	private JButton 	bModificar = new JButton("Modificar Departamento");
	private JButton 	bVerEnConsola = new JButton("Ver por consola");
	private JButton 	bCerrar = new JButton("CERRAR");
	
	private int 		numDep;
	private String		nomDep;
	private String		localiDep;
	
	 //cuestionable
	
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
					nomDep = txtNombre.getText();
					localiDep = txtLocalidad.getText();
					
					if (evento.getSource() == bInsertar) {
					
						operarSobreFichero(2);						
						lMensajeInformativo.setText("NUEVO DEPARTAMENTO GRABADO.");
					}
					else if (evento.getSource() == bConsultar) {				
						operarSobreFichero(3);				
					}
			
					else if (evento.getSource() == bBorrar) {
						operarSobreFichero(0);
						
						confirmacion = JOptionPane.showConfirmDialog(this, "ESTAS SEGURO DE BORRAR...",
								"AVISO BORRADO.", JOptionPane.OK_CANCEL_OPTION);
						
						// si devuelve 0 es OK
						if (confirmacion == 0) {
							operarSobreFichero(0);
							lMensajeInformativo.setText(" REGISTRO BORRADO: " + numDep);						
							limpiarDatos(0);
						}					
					}				
					else if (evento.getSource() == bModificar) {
											
						confirmacion = JOptionPane.showConfirmDialog(this, "ESTAS SEGURO DE MODIFICAR...",
									"AVISO MODIFICACIÓN.", JOptionPane.OK_CANCEL_OPTION);
							
						// si devuelve 0 es OK
						if (confirmacion == 0) {
							operarSobreFichero(1);
							lMensajeInformativo.setText(" REGISTRO MODIFICADO: " + numDep);
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
			numDep = Integer.parseInt(txtNumero.getText());
			
			if (numDep > 0) {
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
			if (consultarDepart()) {
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

	boolean consultarDepart() throws IOException {
		long pos;
		int depa;
		File fichero = new File("AleatorioDep.dat");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		// Calculo del reg a leer
		
			pos = 44 * (numDep - 1);
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
	
	//0 borrar, 1 modificar, 2 crear, 3 leer
	private void operarSobreFichero(int operacion) {
		
		long pos;
		File fichero = new File("AleatorioDep.dat");
		try {
			RandomAccessFile archivo = new RandomAccessFile(fichero, "rw");
			// Calculo del reg a leer
			pos = 44 * (numDep - 1);
			archivo.seek(pos);
			if (operacion == 0) {
				archivo.write(0);
				escribirEnFichero(archivo, null);
			}
			else if (operacion == 1 || operacion == 2){
				archivo.write(numDep);
				escribirEnFichero(archivo, nomDep);
				escribirEnFichero(archivo, localiDep);
			}
			else {
				System.out.println("Depart leido:" + numDep);
				nomDep = "";
				localiDep = "";
				for (int i = 0; i < 10; i++) {
					nomDep += archivo.readChar();
				}
				for (int i = 0; i < 10; i++) {
					localiDep += archivo.readChar();
				}
				mostrarLectura();
			}
			
			if (operacion == 0) {
				System.out.println("----REGISTRO BORRADO--------");
			} else if (operacion == 1) {
				System.out.println("----REGISTRO MODIFICADO--------");
			} else {
				System.out.println(" GRABADO el " + numDep);
			}
			archivo.close();
		} catch (IOException e1) {
			if (operacion == 0) {
				System.out.println("ERRROR AL BORRAR AleatorioDep.dat");
			}
			else if (operacion == 1) {
				System.out.println("ERRROR AL MODIFICAR AleatorioDep.dat");
			} else if (operacion == 2) {
				System.out.println("ERRROR AL grabar AleatorioDep.dat");
			} else if (operacion == 3) {
				System.out.println("ERROR AL LEER AleatorioDep.dat");
			}
			e1.printStackTrace();
		}
	}
	
	private void escribirEnFichero(RandomAccessFile archivo, String texto) throws IOException {

		StringBuffer buffer = null;

		if (texto != null) {
			buffer = new StringBuffer(texto);
			buffer.setLength(10);
			archivo.writeChars(buffer.toString());
		}
		else {
			archivo.writeChars(" ".repeat(20));
		}
		
	}

	private void mostrarLectura() {
		
		System.out.println("DEP: " + numDep + ", Nombre: " + nomDep + ", Localidad: " + localiDep);
		txtNumero.setText(String.valueOf(numDep));
		txtNombre.setText(nomDep);
		txtLocalidad.setText(localiDep);
	}
}

