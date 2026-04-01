package loginConBD;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import org.eclipse.wb.swing.FocusTraversalOnArray;


public class LoginBD extends JFrame implements ActionListener, MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txt_errorInicio;
		
	public static void iniciarSesion() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginBD frame = new LoginBD();
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
	public LoginBD() {
		crearVentanaLogin();	
	}

	private void crearVentanaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 390);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tituloVentana("Inicia Sesión");
		camposLogin();
		botonesLogin();
	}
	private void tituloVentana(String titulo) {
		
		JLabel lbl_cabecera = new JLabel(titulo);
		lbl_cabecera.setFont(new Font("Verdana", Font.BOLD, 18));
		lbl_cabecera.setBounds(187, 46, 150, 26);
		contentPane.add(lbl_cabecera);
	}
	
	public void camposLogin() {
		JLabel lbl_user = new JLabel("Usuario:");
		lbl_user.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_user.setBounds(95, 117, 60, 14);
		contentPane.add(lbl_user);
		
		JLabel lbl_pw = new JLabel("Contraseña:");
		lbl_pw.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_pw.setBounds(81, 148, 89, 14);
		contentPane.add(lbl_pw);
		
		textField = new JTextField();
		lbl_user.setLabelFor(textField);
		textField.setBounds(254, 114, 185, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('♥');
		lbl_pw.setLabelFor(passwordField);
		passwordField.setBounds(254, 145, 185, 20);
		contentPane.add(passwordField);
	}

	private void botonesLogin() {
		
		JButton btn_olvidoPW = new JButton("Olvidé mi contraseña");
		btn_olvidoPW.setForeground(Color.BLUE);
		btn_olvidoPW.setBounds(184, 240, 155, 20);
		contentPane.add(btn_olvidoPW);
		
		JButton btn_aceptar = new JButton("Aceptar");
		btn_aceptar.addMouseListener(this);
		btn_aceptar.setBounds(319, 271, 89, 23);
		contentPane.add(btn_aceptar);
		
		JButton btn_cerrar = new JButton("Cerrar");
		btn_cerrar.setBounds(115, 271, 89, 23);
		contentPane.add(btn_cerrar);
		
		txt_errorInicio = new JTextField();
		txt_errorInicio.setForeground(new Color(255, 0, 0));
		txt_errorInicio.setEditable(false);
		txt_errorInicio.setBounds(144, 186, 262, 26);
		contentPane.add(txt_errorInicio);
		txt_errorInicio.setColumns(10);
		txt_errorInicio.setBorder(null);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btn_olvidoPW, textField, passwordField, txt_errorInicio}));
	
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void mouseClicked(MouseEvent e) {
	
		if (ConsultarDatosBD.validarExistencia(textField.getText(), "DNI") &&
				ConsultarDatosBD.validarExistencia(passwordField.getText(), "userpassword")) {
			Bienvenido.pantallaBienvenida();
			
		}
		else {
			txt_errorInicio.setText("Error, algún dato es incorrecto. Pruebe otra vez.");
		}
			
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
