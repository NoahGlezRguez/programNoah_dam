package ejercicio2;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ventana2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;

	private JLabel lTitulo;;
	private JTextField tSeleccion;
	
	private JRadioButton rbJuego1;
	private JRadioButton rbJuego2;
	private JRadioButton rbJuego3;
	private JRadioButton rbJuego4;
	
	private ButtonGroup grupoRbJuegos;
	
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		lTitulo = new JLabel("¿Cuál es el mejor juego?");
		lTitulo.setForeground(new Color(0, 0, 128));
		lTitulo.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 25));
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lTitulo.setBounds(79, 32, 276, 25);
		panelPrincipal.add(lTitulo);
		
		grupoRbJuegos = new ButtonGroup();
		
		rbJuego1 = new JRadioButton("Nioh ");
		rbJuego1.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		rbJuego1.setBounds(111, 75, 212, 23);
		panelPrincipal.add(rbJuego1);
		
		rbJuego2 = new JRadioButton("Cyberpunk 2077");
		rbJuego2.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		rbJuego2.setBounds(111, 101, 212, 23);
		panelPrincipal.add(rbJuego2);
		
		rbJuego3 = new JRadioButton("Assassin's Creed Valhalla");
		rbJuego3.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		rbJuego3.setBounds(111, 127, 212, 23);
		panelPrincipal.add(rbJuego3);
		
		rbJuego4 = new JRadioButton("Assassin's Creed Shadow");
		rbJuego4.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		rbJuego4.setBounds(111, 153, 212, 23);
		panelPrincipal.add(rbJuego4);
		
		rbJuego1.addActionListener(this);
		rbJuego2.addActionListener(this);
		rbJuego3.addActionListener(this);
		rbJuego4.addActionListener(this);
		
		grupoRbJuegos.add(rbJuego1);
		grupoRbJuegos.add(rbJuego2);
		grupoRbJuegos.add(rbJuego3);
		grupoRbJuegos.add(rbJuego4);
		
		tSeleccion = new JTextField();
		tSeleccion.setEditable(false);
		tSeleccion.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		tSeleccion.setHorizontalAlignment(SwingConstants.CENTER);
		tSeleccion.setBounds(123, 194, 188, 42);
		panelPrincipal.add(tSeleccion);
		tSeleccion.setColumns(10);

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if (rbJuego1.isSelected()) {
			tSeleccion.setText(rbJuego1.getText());
		}
		else if (rbJuego2.isSelected()) {
			tSeleccion.setText(rbJuego2.getText());
		}
		else if (rbJuego3.isSelected()) {
			tSeleccion.setText(rbJuego3.getText());
		}
		else if (rbJuego4.isSelected()) {
			tSeleccion.setText(rbJuego4.getText());
		}
		
	}
	
	
}
