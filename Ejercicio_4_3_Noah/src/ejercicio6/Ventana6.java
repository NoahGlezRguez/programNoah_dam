package ejercicio6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JButton;

/**
 * Clase que crea una ventana con varios paneles que cambian su visibilidad conforme se selecciona desde un menu tipo barra
 */
public class Ventana6 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private JPanel pRojo;
	private JPanel pAzul;
	private JPanel pVerde;
	
	private JMenuBar barmenuVentanas;
	
	private JButton bPanel1;
	private JButton bPanel2;
	private JButton bPanel3;
	
	public Ventana6() {
		setearPaneles();
		setearBotones();
	}


	/**
	 * crea todos los paneles y selecciona la visibilidad incial de cada uno de ellos
	 */
	private void setearPaneles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 600);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(new CardLayout(0, 0));
		
		pRojo = new JPanel();
		pRojo.setBackground(Color.RED);
		panelPrincipal.add(pRojo, "name_6823652452100");
		pRojo.setVisible(true);
		
		pAzul = new JPanel();
		pAzul.setBackground(Color.BLUE);
		panelPrincipal.add(pAzul, "name_6847103589500");
		pAzul.setVisible(false);
		
		pVerde = new JPanel();
		pVerde.setBackground(Color.GREEN);
		panelPrincipal.add(pVerde, "name_6849785009400");
		pVerde.setVisible(false);
	}

	/**
	 * Crea el menu tipo barra con sus botones correspondientes
	 */
	private void setearBotones() {
		
		barmenuVentanas = new JMenuBar();
		setJMenuBar(barmenuVentanas);
		
		bPanel1 = new JButton("Panel 1");
		bPanel2 = new JButton("Panel 2");	
		bPanel3 = new JButton("Panel 3");
		barmenuVentanas.add(bPanel1);
		barmenuVentanas.add(bPanel2);
		barmenuVentanas.add(bPanel3);
		
		bPanel1.addActionListener(this);
		bPanel2.addActionListener(this);
		bPanel3.addActionListener(this);
	}
	
	/**
	 * Gestiona el evento de que cada boton configure la visibilidad de los paneles como corresponda
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if (evento.getSource() == bPanel1) {
			pRojo.setVisible(true);
			pAzul.setVisible(false);
			pVerde.setVisible(false);
		}
		if (evento.getSource() == bPanel2) {
			pRojo.setVisible(false);
			pAzul.setVisible(true);
			pVerde.setVisible(false);
		}
		if (evento.getSource() == bPanel3) {
			pRojo.setVisible(false);
			pAzul.setVisible(false);
			pVerde.setVisible(true);
		}
		
	}

}
