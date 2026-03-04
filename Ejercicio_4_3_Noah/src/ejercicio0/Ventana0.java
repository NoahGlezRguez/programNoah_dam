package ejercicio0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Ventana0 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel 		contentPane;
	private JTextField 	tMensaje;
	private JButton 	bCambiarTexto;

	
	public static void mostrarVentana0() {
		
		try {
			Ventana0 frame = new Ventana0();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Ventana0() {
		setearMarcoYPanelBase();
		setearCampoTexto();
		setearBotonCambiarTexto();
	}

	public void setearMarcoYPanelBase() {
		
		contentPane = new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);

		setContentPane(contentPane);
		
		contentPane.setLayout(null);
	}
	
	public void setearBotonCambiarTexto() {
		bCambiarTexto = new JButton("Cambiar texto");
		
		bCambiarTexto.setBounds(150, 179, 133, 39);
		
		contentPane.add(bCambiarTexto);
		
		bCambiarTexto.addActionListener(this);
	}
	
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
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if (evento.getSource() == bCambiarTexto) {
			cambiarTexto();
		}	
	}
	
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
