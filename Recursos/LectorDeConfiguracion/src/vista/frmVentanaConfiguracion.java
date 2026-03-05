package vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.FicheroConfiguracion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class frmVentanaConfiguracion extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUrl;
	private JTextField txtIp;
	private JTextField txtPort;
	private JTextField txtUsuario;
	private JTextField txtClave;
	private JTextArea txtAreaConfiguracion;
	
	private JButton btnModficarConfiguracion;
	private JButton btnGuardar;
	private JButton btnCancelar;
	
	private FicheroConfiguracion fichConfiguracion;
	
	private int tipoGuardado;   // 1 es por textArea y 0 es por Campos

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVentanaConfiguracion frame = new frmVentanaConfiguracion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmVentanaConfiguracion() {
		setTitle("Lector de Configuración");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnModficarConfiguracion = new JButton("Modificar Configuración");
		btnModficarConfiguracion.setBounds(5, 5, 424, 23);
		// Click para iniciar la carga y la modificación
		btnModficarConfiguracion.addActionListener(this);
		contentPane.setLayout(null);
		btnModficarConfiguracion.setToolTipText("Accede a la modificación de la configuración");
		contentPane.add(btnModficarConfiguracion);
		
		JPanel panCamposConfiguracion = new JPanel();
		panCamposConfiguracion.setBounds(94, 39, 234, 154);
		contentPane.add(panCamposConfiguracion);
		panCamposConfiguracion.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("URL:");
		lblNewLabel.setBounds(0, 0, 134, 20);
		panCamposConfiguracion.add(lblNewLabel);
		
		txtUrl = new JTextField();
		txtUrl.setBounds(79, 0, 134, 20);
		panCamposConfiguracion.add(txtUrl);
		txtUrl.setColumns(10);
		
		JLabel lblIp = new JLabel("IP:");
		lblIp.setBounds(0, 30, 134, 20);
		panCamposConfiguracion.add(lblIp);
		
		txtIp = new JTextField();
		txtIp.setBounds(79, 30, 134, 20);
		panCamposConfiguracion.add(txtIp);
		txtIp.setColumns(10);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setBounds(0, 60, 134, 20);
		panCamposConfiguracion.add(lblPort);
		
		txtPort = new JTextField();
		txtPort.setBounds(79, 60, 134, 20);
		panCamposConfiguracion.add(txtPort);
		txtPort.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(0, 90, 134, 20);
		panCamposConfiguracion.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(79, 90, 134, 20);
		panCamposConfiguracion.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblClave = new JLabel("Clave:");
		lblClave.setBounds(0, 120, 134, 20);
		panCamposConfiguracion.add(lblClave);
		
		txtClave = new JTextField();
		txtClave.setBounds(79, 120, 134, 20);
		panCamposConfiguracion.add(txtClave);
		txtClave.setColumns(10);
		
		JPanel panTextoConfiguracion = new JPanel();
		panTextoConfiguracion.setBounds(28, 39, 372, 200);
		contentPane.add(panTextoConfiguracion);
		panTextoConfiguracion.setLayout(null);
		
		txtAreaConfiguracion = new JTextArea();
		txtAreaConfiguracion.setBounds(0, 40, 350, 150);
		txtAreaConfiguracion.setColumns(25);
		txtAreaConfiguracion.setRows(8);
		panTextoConfiguracion.add(txtAreaConfiguracion);
		
		JLabel lblAreaConfiguracion = new JLabel("Escriba aqui su configuración:");
		lblAreaConfiguracion.setBounds(102, 11, 142, 14);
		panTextoConfiguracion.add(lblAreaConfiguracion);
		lblAreaConfiguracion.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panBotones = new JPanel();
		panBotones.setBounds(5, 238, 424, 33);
		contentPane.add(panBotones);
		
		btnCancelar = new JButton("Cancelar");
		// Boton para cancelar
		btnCancelar.addActionListener(this);
		panBotones.add(btnCancelar);
		
		btnGuardar = new JButton("Guardar");
		// click en el boton de Guardar
		btnGuardar.addActionListener(this);
		panBotones.add(btnGuardar);
		
		// Inicializamos la visibilidad de pantalla
		inicializarVisibilidadPantalla(false, false, false);
		
		// Creamos el objeto fichero de configuracion
		fichConfiguracion = new FicheroConfiguracion();

	}

	/**
	 * 
	 * @param bCampos   -> para mostrar el panel de los campos
	 * @param bTexto	-> para mostrar el panel de los textos
	 * @param bBotenes	-> para mostrar el panel de los botones
	 */
	private void inicializarVisibilidadPantalla(boolean bCampos, boolean bTexto, boolean bBotones) {
		// Ocultamos los botones y los paneles de escritura de datos.
		Component[] lstComponentes = contentPane.getComponents();
		lstComponentes[1].setVisible(bCampos);
		lstComponentes[2].setVisible(bTexto);
		lstComponentes[3].setVisible(bBotones);
	}
	
	/**
	 * Dada una cadena de texto, devuelve su valor encriptado.
	 * @param clave  	-> cadena de texto a encriptar
	 * @return			-> cadena de texto encriptada
	 */
	private String encriptarMD5( String clave) {
		
		String resultadoEncriptado = "";
		MessageDigest md = null;
		 
		try {
			md = MessageDigest.getInstance("MD5");
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			
		} finally {
			 md.update(clave.getBytes());
			 byte[] digest = md.digest();	 
			 resultadoEncriptado = new String(digest).toUpperCase();  
		}
		 
		 
		 
		 return( resultadoEncriptado);
	}
	
	// -----------------------------------------------------
	// ----------  EVENTOS ---------------------------------
	// -----------------------------------------------------	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		// Buscamos que componente ha hecho el click
		if( evento.getSource() == btnGuardar ) {
			
			// Lanzamos el metodo de Guardar en el archivo.
			inicializarVisibilidadPantalla(false, false, false);
			// GuardarCongifuración
			guardarConfiguracion();
			// ControlarErrores
		}
		else if( evento.getSource() == btnCancelar) {
			
			// Lanzamos el metodo que nos deja la interfaz inicial sin guardar.
			inicializarVisibilidadPantalla(false, false, false);
		}
		else if( evento.getSource() == btnModficarConfiguracion) {
			
			// Preguntamos por cómo queremos realizar la modificación
			iniciarModificarConfiguracion();
			
		}
	}
	
	/**
	 * 
	 */
	private void iniciarModificarConfiguracion() {
		
		// Preguntamos por cómo queremos hacerlo.
		// mostramos el panel correcto y los botones
		int aukera = JOptionPane.showConfirmDialog(contentPane, "¿Deseas cargar el fichero en una caja de texto completa?");
		if( aukera  == 0) {
			inicializarVisibilidadPantalla(false, true, true);
			tipoGuardado = aukera;
		}
		else if(aukera == 1) {
			inicializarVisibilidadPantalla(true, false, true);
			tipoGuardado = aukera;
		}
		else {
			inicializarVisibilidadPantalla(false, false, false);
			tipoGuardado = -1;
		}
		
		// Lanzamos la carga del fichero
		try {
			
			fichConfiguracion.leerFichero();
			
			// Cargo en el textArea
			txtAreaConfiguracion.setText( fichConfiguracion.toStringArea());
			
			// cargo en los campos
			txtUrl.setText(fichConfiguracion.getStrUrl());
			txtPort.setText(fichConfiguracion.getStrPort());
			txtIp.setText(fichConfiguracion.getStrIp());
			txtUsuario.setText(fichConfiguracion.getStrUser());
			txtClave.setText(fichConfiguracion.getStrClave());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	private void guardarConfiguracion() {
	
		// En función del tipo de Guardado, o bien recupero los campos o bien el Text Area
		if( tipoGuardado == 1) {
			// Campos
			fichConfiguracion.setStrUrl( txtUrl.getText());
			fichConfiguracion.setStrIp(txtIp.getText());
			fichConfiguracion.setStrPort( txtPort.getText());
			fichConfiguracion.setStrUser( txtUsuario.getText());
			fichConfiguracion.setStrClave( txtClave.getText());
			
			try {
				// Guardamos campo a campo
				fichConfiguracion.escribirFichero("");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		else {
			// TextArea
			try {
				// Guardamos todo el texto sin comprobar
				fichConfiguracion.escribirFichero(txtAreaConfiguracion.getText());
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
