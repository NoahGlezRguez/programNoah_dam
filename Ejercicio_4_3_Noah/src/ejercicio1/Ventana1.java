package ejercicio1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tUsuario;
	private JTextField tClave;

	public static void mostrarVentana1() {
		
		try {
			Ventana1 frame = new Ventana1();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Ventana1() {
		setearMarcoYPanelBase();
	}
	
	public void setearMarcoYPanelBase() {
		
		contentPane = new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		tUsuario = new JTextField();
		tUsuario.setBounds(216, 72, 86, 20);
		contentPane.add(tUsuario);
		tUsuario.setColumns(10);
		
		tClave = new JTextField();
		tClave.setBounds(216, 128, 86, 20);
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
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tUsuario, tClave}));
	}
}
