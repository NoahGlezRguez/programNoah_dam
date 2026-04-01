package ejercicio0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

/**
 * Esta ventana crea una ventana con JFrame usando WindowBuilder.
 * Usa Absolute Layout, y genera en un panel un campo de texto y un botón.
 * Cuando se clica el botón cambia el mensaje que aparece en el campo de texto. 
 */
public class Ventana0 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel 		contentPane;
	private JTextField 	tMensaje;
	private JButton 	bCambiarTexto;

	
	/**
	 * Constructor que llama a los métodos implicados para crear la ventana
	 */
	public Ventana0() {
		setearMarcoYPanelBase();
		setearCampoTexto();
		setearBotonCambiarTexto();
	}

	/**
	 * Genera el panel principal
	 */
	public void setearMarcoYPanelBase() {
		
		contentPane = new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);

		setContentPane(contentPane);
		
		contentPane.setLayout(null);
	}
	
	/**
	 * Crea el botón que de esta ventana y lo añade al panel principal
	 */
	public void setearBotonCambiarTexto() {
		bCambiarTexto = new JButton("Cambiar texto");
		
		bCambiarTexto.setBounds(150, 179, 133, 39);
		
		contentPane.add(bCambiarTexto);
		
		bCambiarTexto.addActionListener(this);
	}
	
	/**
	 * Crea y añade al panel principal el campo de texto.
	 */
	public void setearCampoTexto() {
		tMensaje = new JTextField();
		
		tMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		tMensaje.setEditable(false);
		tMensaje.setFont(new Font("Sylfaen", Font.BOLD, 22));
		tMensaje.setText("Hey!");
		
		tMensaje.setBounds(83, 41, 267, 97);
		tMensaje.setColumns(10);
		
		contentPane.add(tMensaje);
	}
	
	/**
	 * Método sobrescrito de la clase ActionListener para gestionar el evento
	 * que ocurre al clicar el único botón.
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if (evento.getSource() == bCambiarTexto) {
			cambiarTexto();
		}	
	}
	
	/**
	 * Este método sustituye el contenido del campo de texto por el otro mensaje y viceversa.
	 */
	private void cambiarTexto() {

		String heyMsg = "Hey!";
		String holaMundoMsg = "¡Hola mundo!";
		
		if (tMensaje.getText().equals(heyMsg)) {
			tMensaje.setText(holaMundoMsg);
		}
		else {
			tMensaje.setText(heyMsg);
		}	
	}
}
