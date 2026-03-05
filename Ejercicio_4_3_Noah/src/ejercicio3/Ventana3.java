package ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Ventana3 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;

	private JPanel pFormulario;
	private JPanel pDatos;
	
	private JLabel lNombre;
	private JLabel lApellido1;
	private JLabel lApellido2;
	private JComboBox<String> comboBoxDNIE;
	private JLabel lEdad;

	private JTextField tNombre;
	private JTextField tApellido1;
	private JTextField tApellido2;
	private JTextField tDNIE;
	private JTextField tEdad;
	private JTextField tCabecera;
	
	private JButton bAceptar;
	private JButton bLimpiar;
	
	private JTextField tTituloDatos;
	private JTextArea datosIntroducidos;
	
	public Ventana3() {
		setearPaneles();
	}

	private void ponerCabecera() {
		
		tCabecera = new JTextField();
		tCabecera.setText("Introduce tus datos de usuario:");
		tCabecera.setFont(new Font("SimSun-ExtG", Font.BOLD, 18));
		tCabecera.setHorizontalAlignment(SwingConstants.CENTER);
		tCabecera.setBounds(29, 0, 354, 31);
		tCabecera.setColumns(10);
	}
	
	private void setearTextosFormulario() {
		
		String[] opcionesCombo =  {"DNI", "NIE"};
		
		lNombre = new JLabel("Nombre:");
		lNombre.setFont(new Font("SimSun-ExtG", Font.PLAIN, 13));
		lNombre.setBounds(29, 47, 86, 14);
		
		lApellido1 = new JLabel("Primer apellido:");
		lApellido1.setFont(new Font("SimSun-ExtG", Font.PLAIN, 13));
		lApellido1.setBounds(29, 72, 116, 14);
		
		lApellido2 = new JLabel("Segundo apellido:");
		lApellido2.setFont(new Font("SimSun-ExtG", Font.PLAIN, 13));
		lApellido2.setBounds(29, 97, 134, 14);		
		
		lEdad = new JLabel("Edad:");
		lEdad.setFont(new Font("SimSun-ExtG", Font.PLAIN, 13));
		lEdad.setBounds(29, 147, 96, 14);		
		
		tNombre = new JTextField();
		tNombre.setBounds(173, 44, 195, 20);		
		tNombre.setColumns(10);
		
		tApellido1 = new JTextField();
		tApellido1.setColumns(10);
		tApellido1.setBounds(173, 69, 195, 20);
				
		tApellido2 = new JTextField();
		tApellido2.setColumns(10);
		tApellido2.setBounds(173, 94, 195, 20);
				
		tDNIE = new JTextField();
		tDNIE.setColumns(10);
		tDNIE.setBounds(173, 119, 195, 20);
				
		tEdad = new JTextField();
		tEdad.setColumns(10);
		tEdad.setBounds(173, 144, 195, 20);
		
		comboBoxDNIE = new JComboBox<>(opcionesCombo);
		comboBoxDNIE.setFont(new Font("SimSun-ExtG", Font.PLAIN, 13));
		comboBoxDNIE.setSelectedIndex(-1);
		comboBoxDNIE.setBounds(29, 118, 51, 22);
	}
	
	private void setearBotonesFormulario() {
		bAceptar = new JButton("Aceptar");
		bAceptar.setForeground(new Color(34, 139, 34));
		bAceptar.setFont(new Font("SimSun-ExtG", Font.BOLD, 14));
		bAceptar.setBounds(94, 175, 89, 23);
		
		bLimpiar = new JButton("Limpiar");
		bLimpiar.setForeground(new Color(255, 0, 0));
		bLimpiar.setFont(new Font("SimSun-ExtG", Font.BOLD, 14));
		bLimpiar.setBounds(230, 175, 89, 23);
	}
	
	private void setearTextosDatos() {
		tTituloDatos = new JTextField();
		tTituloDatos.setVisible(false);
		tTituloDatos.setEnabled(false);
		tTituloDatos.setEditable(false);
		tTituloDatos.setBounds(0, 0, 414, 20);
		tTituloDatos.setColumns(10);
		
		datosIntroducidos = new JTextArea();
		datosIntroducidos.setVisible(false);
		datosIntroducidos.setEnabled(false);
		datosIntroducidos.setEditable(false);
		datosIntroducidos.setBounds(0, 25, 414, 43);
	}
	
	private void setearPaneles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 349);
		
		ponerCabecera();
		setearTextosFormulario();
		setearBotonesFormulario();
		setearTextosDatos();
		
		panelPrincipal = new JPanel();
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		pFormulario = new JPanel();
		pFormulario.setBounds(10, 11, 414, 209);
		pFormulario.setLayout(null);
		
		pDatos = new JPanel();
		pDatos.setBounds(10, 231, 414, 68);
		pDatos.setLayout(null);
		
		pFormulario.add(tCabecera);
		
		pFormulario.add(lNombre);
		pFormulario.add(lApellido1);
		pFormulario.add(lApellido2);
		pFormulario.add(comboBoxDNIE);
		pFormulario.add(lEdad);
		
		pFormulario.add(tNombre);
		pFormulario.add(tApellido1);
		pFormulario.add(tApellido2);
		pFormulario.add(tDNIE);
		pFormulario.add(tEdad);
		
		pFormulario.add(bAceptar);
		pFormulario.add(bLimpiar);	

		pDatos.add(tTituloDatos);
		pDatos.add(datosIntroducidos);
		
		panelPrincipal.add(pDatos);
		panelPrincipal.add(pFormulario);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
