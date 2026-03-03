package main;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaFormularioFichero extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel panelModificacion;
	private JPanel panelInfo;
	
	private JLabel lUrl = new JLabel("url: ");
	private JLabel lIp = new JLabel("IP: ");
	private JLabel lPuerto = new JLabel("Puerto: ");
	private JLabel lUsuario = new JLabel("Usuario: ");
	private JLabel lClave = new JLabel("Clave: ");
	
	private JTextField tUrl = new JTextField(" ");
	private JTextField tIp = new JTextField(" ");
	private JTextField tPuerto = new JTextField(" ");
	private JTextField tUsuario = new JTextField(" ");
	private JTextField tClave = new JTextField(" ");

	
	private JButton bCancelar;
	private JButton bGuardar;
	
	public VentanaFormularioFichero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		inicializarPaneles();

	}

	public void inicializarPaneles() {
		panelModificacion = new JPanel();
		panelInfo = new JPanel();
		
		crearPanel(panelModificacion);
		crearPanel(panelInfo);
	}
	
	public void crearPanel(JPanel panel) {
		
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
	}
}
