package ejercicio;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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

public class VentanaDepartamento extends JFrame implements ActionListener {

	private static final long	serialVersionUID = 1L;
	private static final int ANCHO_LINEA = 44;
	private static final int BORRAR = 0;
	private static final int MODIFICAR = 1;
	private static final int INSERTAR = 2;
	private static final int CONSULTAR = 3;
	
	
	private JTextField txtNumero = new JTextField(10);
	private JTextField txtNombre = new JTextField(25);
	private JTextField txtLocalidad = new JTextField(25);	

	private JLabel 	lMensajeInformativo = new JLabel(" ----------------------------- ");

	private JButton 	bInsertar = new JButton("Insertar Depart.");
	private JButton	bConsultar = new JButton("Consultar Depart.");
	private JButton 	bBorrar = new JButton("Borrar Depart.");
	private JButton 	bLimpiarDatos = new JButton("Limpiar datos");
	private JButton 	bModificar = new JButton("Modificar Departamento");
	private JButton 	bVerEnConsola = new JButton("Ver por consola");
	private JButton 	bCerrar = new JButton("CERRAR");
	
	private int 		numDep;
	private String	nomDep;
	private String	localiDep;
	
	private Archivo archivoDatos = new Archivo();
	
	public VentanaDepartamento() {
		
		setTitle("GESTIÓN DE DEPARTAMENTOS.");	
		iniciarPanelesConEtiquetas();	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		iniciarBotones();
	}

	private void iniciarPanelesConEtiquetas() {
		
		JPanel[] paneles = new JPanel[7];
		JLabel[] etiquetas = new JLabel[4];
 		String[] info = {"GESTIÓN DE DEPARTAMENTOS", "NÚMERO DEPARTAMENTO:", "NOMBRE:", "LOCALIDAD:"};

		for (int i = 0; i < paneles.length; i++) {
			paneles[i] = new JPanel();
			if(i > 1) {
				paneles[i].setLayout(new FlowLayout());
			}
			if (i < 4) {
				etiquetas[i] = new JLabel(info[i]);
				paneles[i].add(etiquetas[i]);
			}
		}
	
		paneles[0].setBackground(Color.CYAN);
		paneles[1].add(txtNumero);
		paneles[1].add(bConsultar);
		paneles[2].add(txtNombre);
		paneles[3].add(txtLocalidad);
		agregarBotonesColor(paneles[4], bInsertar, bBorrar, bModificar, Color.YELLOW);
		agregarBotonesColor(paneles[5], bLimpiarDatos, bVerEnConsola, bCerrar, Color.PINK);
		paneles[6].add(lMensajeInformativo);
		
		for (int i = 0; i < paneles.length; i++) {
			add(paneles[i]);
		}
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		pack(); 
	}
	
	private void agregarBotonesColor(JPanel panel, JButton boton1, JButton boton2, JButton boton3, Color color) {
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.setBackground(color);
	}
	
	private void iniciarBotones() {
		
		bInsertar.addActionListener(this);
		bLimpiarDatos.addActionListener(this);
		bCerrar.addActionListener(this);
		bConsultar.addActionListener(this);
		bBorrar.addActionListener(this);
		bModificar.addActionListener(this);
		bVerEnConsola.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		String	botonPulsado = ((JButton)evento.getSource()).getText();
		
		lMensajeInformativo.setText("Has pulsado el botón ".concat(botonPulsado));
		
		if (evento.getSource() == bCerrar) { 
			System.exit(0);
		}
		
		else if (evento.getSource() == bVerEnConsola) { 
			verPorConsola();
		}
		
		else if (evento.getSource() == bLimpiarDatos) {
			limpiarDatos(BORRAR);
		}
		
		else {
			
			if (depMayorQueCero()) {	
		
				if (!buscarDepEnFichero() && evento.getSource() != bInsertar) {
					lMensajeInformativo.setText("DEPARTAMENTO NO EXISTE.");
					limpiarDatos(-1);
				}
				else {
					nomDep = txtNombre.getText();
					localiDep = txtLocalidad.getText();
					
					if (evento.getSource() == bBorrar && pedirConfirmacion("ESTÁS SEGURO DE BORRAR...", "AVISO BORRADO.") == 0) {
						operarSobreFichero(BORRAR);
					}	
					
					else if (evento.getSource() == bModificar && pedirConfirmacion("ESTÁS SEGURO DE MODIFICAR...", "AVISO MODIFICACIÓN.") == 0) {										
						operarSobreFichero(MODIFICAR);	
					}
					
					else if (evento.getSource() == bInsertar) {					
						operarSobreFichero(INSERTAR);												
					}
					
					else if (evento.getSource() == bConsultar) {				
						operarSobreFichero(CONSULTAR);				
					}
					
				}
			}
		}
	}

	private int pedirConfirmacion(String mensaje, String titulo) {
		
		return (JOptionPane.showConfirmDialog(this, mensaje, titulo, JOptionPane.OK_CANCEL_OPTION));
		
	}
	
	private void limpiarDatos(int operacion) {
		
		if (operacion == BORRAR) {
			txtNumero.setText(null);
		}
		txtNombre.setText(null);
		txtLocalidad.setText(null);
	}
	
	private boolean depMayorQueCero() {
		
		boolean esCorrecto = true;
		
		try {
			numDep = Integer.parseInt(txtNumero.getText());
			
			if (numDep <= 0) {
				esCorrecto = false;
				lMensajeInformativo.setText("DEPARTAMENTO DEBE SER MAYOR QUE 0");			
			}		
		} catch (java.lang.NumberFormatException excepFormatoNumerico){
			lMensajeInformativo.setText("DEPARTAMENTO ERRÓNEO.");
			esCorrecto = false;
		}	
		return (esCorrecto);
	}
	
	private boolean buscarDepEnFichero() {
		
		boolean existe = false;
		File fichero = new File("AleatorioDep.dat");
		RandomAccessFile archivo;
		
		try {
			archivo = new RandomAccessFile(fichero, "r");

			if ((archivo.length() > 0) && (ANCHO_LINEA * (numDep - 1)) < archivo.length()) {
				archivo.seek(ANCHO_LINEA * (numDep - 1));
				numDep = archivo.readInt();
				archivo.close();
				System.out.println("Depart leido:" + numDep);
				if (numDep > 0) {
					existe = true;
					lMensajeInformativo.setText("DEPARTAMENTO EXISTE");
				}
			}
			else {
				mostrarError(4);
			}
		} catch (IOException exError) {		
			mostrarError(3);
			exError.printStackTrace();				
		}
		return (existe);
	}
	
	private void verPorConsola() {
		
		File fichero = new File("AleatorioDep.dat");
		RandomAccessFile archivo;
		
		try {
			archivo= new RandomAccessFile(fichero, "r");
			
			lMensajeInformativo.setText("Visualizando el fichero por la consola.....");
			
			if (archivo.length() > 0) {
				
				System.out.println(" ------------------------------------------\n - - - VISUALIZO POR CONSOLA ");
				for (long i = 0; i < archivo.length(); i += ANCHO_LINEA) {
					archivo.seek(i);
					numDep = archivo.readInt();
					mostrarTupla();			
				}
				archivo.close();
				System.out.println(" ------------------------------------------");
			} else {
				System.out.println(" ---------FICHERO VACÍO --------------------");
			}
		} catch (IOException e1) {
			mostrarError(3);
		}
	}

	private void operarSobreFichero(int operacion) {
		
		try {
			archivoDatos.abrir();

			if (operacion == BORRAR) {
				archivoDatos.borrarRegistro(numDep);
				System.out.println("----REGISTRO BORRADO--------");
				lMensajeInformativo.setText(" REGISTRO BORRADO: " + numDep);						
				limpiarDatos(0);
			}
			
			else if (operacion == MODIFICAR) {
				archivoDatos.modificarRegistro(numDep, nomDep, localiDep, false);
				System.out.println("----REGISTRO MODIFICADO--------");
				lMensajeInformativo.setText(" REGISTRO MODIFICADO: " + numDep);
			}
			
			else if (operacion == INSERTAR){
				archivoDatos.modificarRegistro(numDep, nomDep, localiDep, true);
				System.out.println(" GRABADO el " + numDep);
				lMensajeInformativo.setText("NUEVO DEPARTAMENTO GRABADO.");
			}
			
			else if (operacion == CONSULTAR){
				
				mostrarTupla();
				txtNumero.setText(String.valueOf(numDep));
				txtNombre.setText(nomDep);
				txtLocalidad.setText(localiDep);
			}
			 
			archivoDatos.cerrar();
			
		} catch (IOException e1) {
			mostrarError(operacion);
			e1.printStackTrace();
		}
	}
	
	private void mostrarError(int indice) {
		
		String[] errores = {"ERRROR AL BORRAR AleatorioDep.dat", "ERRROR AL MODIFICAR AleatorioDep.dat",
				"ERRROR AL grabar AleatorioDep.dat", "ERROR AL LEER AleatorioDep.dat", " ERROR al leer.."};
		
		System.out.println(errores[indice]);
	}

	private void mostrarTupla() throws IOException {
		
		archivoDatos.getArchivo().seek(ANCHO_LINEA * (numDep - 1));
		archivoDatos.getArchivo().readInt();
		
		System.out.println("Depart leido:" + numDep);
		nomDep = archivoDatos.recogerCampo();
		localiDep = archivoDatos.recogerCampo();
		System.out.println("DEP: " + numDep + ", Nombre: " + nomDep + ", Localidad: " + localiDep);
		
	}
	
}