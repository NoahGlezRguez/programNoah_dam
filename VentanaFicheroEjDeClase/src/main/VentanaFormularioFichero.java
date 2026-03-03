package main;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class VentanaFormularioFichero extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel panelModificacion;
	private JPanel panelInfo;
	
	private JLabel lUrl = new JLabel("Url: ");
	private JLabel lIp = new JLabel("IP: ");
	private JLabel lPuerto = new JLabel("Puerto: ");
	private JLabel lUsuario = new JLabel("Usuario: ");
	private JLabel lClave = new JLabel("Clave: ");
	
	private JTextField tUrl = new JTextField(50);
	private JTextField tIp = new JTextField(16);
	private JTextField tPuerto = new JTextField(6);
	private JTextField tUsuario = new JTextField(20);
	private JTextField tClave = new JTextField(20);

	
	private JButton bCancelar = new JButton("Cancelar");
	private JButton bGuardar = new JButton("Guardar");
	private JButton bModificar = new JButton("Modificar");
	private JButton bLeer = new JButton("Leer");
	
	public VentanaFormularioFichero() {
		
		setTitle("Configuración de la conexión");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 372);
		
		inicializarPaneles();

	}

	public void inicializarPaneles() {
		panelModificacion = new JPanel();
		panelInfo = new JPanel();
		
		getContentPane().setLayout(null);//revisar
		
		panelModificacion.setBounds(0, 0, 450, 372);
		panelInfo.setBounds(0, 0, 450, 372);
		
		crearPanel(panelModificacion);
		ponerBotonesModif();
		getContentPane().add(panelModificacion);
		panelModificacion.setVisible(true);
		
		crearPanel(panelInfo);
		ponerBotonesInfo();		
		panelInfo.setVisible(false);
		habilitarEdicionTexto(false);
		
		getContentPane().add(panelInfo);
		}
	
	public void crearPanel(JPanel panel) {
				
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		
		lUrl.setFont(new Font("Tahoma", Font.BOLD, 14));
		lUrl.setBounds(72, 31, 93, 14);
		panel.add(lUrl);
		
		tUrl.setBounds(211, 23, 160, 30);
		
		tUrl.setText(null);
		panel.add(tUrl);
		
		lIp.setFont(new Font("Tahoma", Font.BOLD, 14));
		lIp.setBounds(72, 76, 93, 14);
		panel.add(lIp);
		
		tIp.setBounds(211, 68, 160, 30);
		tIp.setText(null);
		panel.add(tIp);
		
		lPuerto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lPuerto.setBounds(72, 121, 93, 14);
		panel.add(lPuerto);
		
		tPuerto.setBounds(211, 113, 160, 30);
		tPuerto.setText(null);
		panel.add(tPuerto);
		
		
		lUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lUsuario.setBounds(72, 166, 93, 14);
		panel.add(lUsuario);
		
		tUsuario.setBounds(211, 158, 160,  30);
		tUsuario.setText(null);
		panel.add(tUsuario);
		
		lClave.setFont(new Font("Tahoma", Font.BOLD, 14));
		lClave.setBounds(72, 211, 93, 14);
		panel.add(lClave);
		
		tClave.setBounds(211, 203, 160, 30);
		tClave.setText(null);
		panel.add(tClave);

		panel.setBackground(Color.lightGray);
		
		bCancelar.setBounds(30, 277, 104, 30);
		bCancelar.setForeground(Color.RED);
		panel.add(bCancelar);
		bCancelar.addActionListener(this);
	}
	
	public void ponerBotonesInfo() {
			
		bModificar.setBounds(296, 277, 104, 30);
		bModificar.setForeground(Color.black);
		panelInfo.add(bModificar);
		bModificar.addActionListener(this);
		
		bLeer.setBounds(164, 277, 104, 30);
		bLeer.setForeground(Color.blue);
		panelInfo.add(bLeer);
		bLeer.addActionListener(this);
		
	}
	
	public void ponerBotonesModif() {
		
		bGuardar.setBounds(298, 277, 104, 30);
		bGuardar.setForeground(new Color(34, 139, 34));
		panelModificacion.add(bGuardar);
		
		bGuardar.addActionListener(this);
	}

	private void limpiar() {
		tUrl.setText(null);
		tIp.setText(null);
		tPuerto.setText(null);
		tUsuario.setText(null);
		tClave.setText(null);
	}
	
	private void habilitarEdicionTexto(boolean estado) {
		tUrl.setEditable(estado);
		tIp.setEditable(estado);
		tPuerto.setEditable(estado);
		tUsuario.setEditable(estado);
		tClave.setEditable(estado);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if (evento.getSource() == bCancelar) {
			limpiar();
		}
		else if (evento.getSource() == bGuardar) {
			//Fichero.modificarDatos();
			
			limpiar();
			habilitarEdicionTexto(false);
			panelModificacion.setVisible(false);
			panelInfo.setVisible(true);
			
		}
		else if (evento.getSource() == bLeer) {
			//Fichero.leerDatos();
			habilitarEdicionTexto(false);
		}
		else if (evento.getSource() == bModificar) {
			panelInfo.setVisible(false);
			panelModificacion.setVisible(true);
			habilitarEdicionTexto(true);
		}
	}
}
