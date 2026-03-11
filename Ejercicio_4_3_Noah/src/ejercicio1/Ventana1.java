package ejercicio1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Esta clase gestiona una ventana básica de login. Si se introduce 'admin' en los dos campos
 * mandará un mensaje por pantalla de bienvenida y si no, de error.
 */
public class Ventana1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tUsuario;
	private JTextField tClave;
	private JButton bValidar;


	public Ventana1() {
		setearMarcoYPanelBase();
	}
	
	/**
	 * Crea el panel principal, los campos de texto, las etiquetas de los campos de texto,
	 * y el botón para iniciar sesión.
	 */
	public void setearMarcoYPanelBase() {
		
		contentPane = new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		tUsuario = new JTextField();
		tUsuario.setBounds(216, 72, 135, 20);
		contentPane.add(tUsuario);
		tUsuario.setColumns(10);
		
		tClave = new JTextField();
		tClave.setBounds(216, 128, 135, 20);
		contentPane.add(tClave);
		tClave.setColumns(10);
		
		JLabel lUsuario = new JLabel("Usuario:");
		lUsuario.setLabelFor(tUsuario);
		lUsuario.setBounds(97, 72, 76, 20);
		contentPane.add(lUsuario);
		
		JLabel lClave = new JLabel("Contraseña:");
		lClave.setLabelFor(tClave);
		lClave.setBounds(97, 128, 76, 20);
		contentPane.add(lClave);
		
		bValidar = new JButton("Validar Admin");
		bValidar.setBounds(151, 173, 132, 41);
		contentPane.add(bValidar);
		
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tUsuario, tClave, bValidar}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tUsuario, tClave, bValidar}));
		
		bValidar.addActionListener(this);
		
		contentPane.add(bValidar);
	}

	/**
	 * Método sobrescrito de ActionListener para gestionar el evento de clicar el botón de login
	 * con la validacion del contenido (admin, admin) y un mensaje de respuesta en cada caso.
	 * Si coincide, muestra un pop up con un mensaje de bienvenida.
	 * Si no, de error.
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {

		if (evento.getSource() == bValidar) {
			if (tUsuario.getText().equals("admin") && tClave.getText().equals("admin")) {
				
				JOptionPane.showMessageDialog(this, "Bienvenido");
				
				tUsuario.setText(null);
				tClave.setText(null);
			}
			else {
				JOptionPane.showMessageDialog(this, "User o password desconocido");
				
				tUsuario.setText(null);
				tClave.setText(null);
			}
		}
		
	}
}
