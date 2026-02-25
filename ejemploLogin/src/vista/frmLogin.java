package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class frmLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_usuario;
	private JPasswordField pwField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
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
	public frmLogin() {
		setTitle("Mi programa");
		setForeground(new Color(25, 25, 112));
		setBackground(new Color(100, 149, 237));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_OngiEtorri = new JLabel("Ongi etorri");
		lbl_OngiEtorri.setFont(new Font("Segoe UI Symbol", Font.BOLD, 22));
		lbl_OngiEtorri.setBounds(159, 41, 134, 30);
		contentPane.add(lbl_OngiEtorri);
		
		JLabel lbl_usuario = new JLabel("Usuario:");
		lbl_usuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_usuario.setBounds(87, 93, 59, 30);
		contentPane.add(lbl_usuario);
		
		JLabel lbl_pw = new JLabel("Contraseña:");
		lbl_pw.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_pw.setBounds(87, 134, 86, 22);
		contentPane.add(lbl_pw);
		
		textField_usuario = new JTextField();
		lbl_usuario.setLabelFor(textField_usuario);
		textField_usuario.setBounds(183, 100, 152, 20);
		contentPane.add(textField_usuario);
		textField_usuario.setColumns(10);
		
		pwField = new JPasswordField();
		pwField.setEchoChar('♥');
		lbl_pw.setLabelFor(pwField);
		pwField.setBounds(183, 137, 152, 20);
		contentPane.add(pwField);
		
		JButton btn_iniciar = new JButton("Iniciar sesión");
		btn_iniciar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_iniciar.setBounds(159, 182, 108, 23);
		contentPane.add(btn_iniciar);
		
		JButton lbl_RestaurarPw = new JButton("Olvidé mi constraseña...");
		//Crea un evento y lo gestiona en un Listener:
		lbl_RestaurarPw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has olvidado algo muy importante... muy maaaal!");
			}
		});
		lbl_RestaurarPw.setForeground(new Color(0, 0, 0));
		lbl_RestaurarPw.setBackground(new Color(240, 248, 255));
		lbl_RestaurarPw.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lbl_RestaurarPw.setBounds(140, 216, 146, 18);
		contentPane.add(lbl_RestaurarPw);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lbl_OngiEtorri, textField_usuario, pwField, btn_iniciar, lbl_RestaurarPw}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lbl_OngiEtorri, lbl_usuario, lbl_pw, textField_usuario, pwField, btn_iniciar, lbl_RestaurarPw}));

	}
}
