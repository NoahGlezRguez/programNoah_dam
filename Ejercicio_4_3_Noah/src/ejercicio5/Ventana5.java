package ejercicio5;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;

public class Ventana5 extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel		panelPrincipal;
	private JScrollPane	pScrollBotones;
	private JPanel 		pBotonesNuevos;
	
	private JTextField 	tNumero;
	
	private JTextArea 	taBotonPulsado;
	
	private JButton		bCrear;
	private JButton[] 	botones;
	
	private JLabel 		lMensajePeticion;
	private	JLabel		lInfoPulsacion;
	
	public Ventana5() {
		setearPanelPrincipal();
	}
	
	private void setearPanelPrincipal() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 196);
		panelPrincipal = new JPanel();
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);

		lMensajePeticion = new JLabel("Escribe el nº de botones que quieres crear:");
		lMensajePeticion.setBounds(10, 11, 264, 26);
		panelPrincipal.add(lMensajePeticion);
		
		tNumero = new JTextField("");
		tNumero.setBounds(284, 15, 81, 20);
		panelPrincipal.add(tNumero);
		
		bCrear = crearBoton("Crear botones");
		bCrear.setBounds(375, 14, 130, 23);
		panelPrincipal.add(bCrear);
		bCrear.addActionListener(this);
		
		pScrollBotones = new JScrollPane();
		pScrollBotones.setViewportBorder(new EmptyBorder(5, 5, 5, 5));
		pScrollBotones.setBounds(10, 46, 783, 102);
		panelPrincipal.add(pScrollBotones);
		
		pBotonesNuevos = new JPanel();
		pScrollBotones.setViewportView(pBotonesNuevos);
		pBotonesNuevos.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lInfoPulsacion = new JLabel("Estás pulsando... :");
		lInfoPulsacion.setBounds(515, 18, 118, 14);
		panelPrincipal.add(lInfoPulsacion);
		
		taBotonPulsado = new JTextArea();
		taBotonPulsado.setRows(80);
		taBotonPulsado.setEditable(false);
		taBotonPulsado.setBounds(632, 13, 149, 22);
		panelPrincipal.add(taBotonPulsado);
		
	}

	
	
	private JButton crearBoton(String numDelBoton) {
		JButton botonNuevo = new JButton(numDelBoton);
		
		botonNuevo.addMouseListener(this);
		return (botonNuevo);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		int		numBotones = -1;
		String	numeroActual = "";
		
		
		if (evento.getSource() == bCrear)
		{
			pBotonesNuevos.removeAll();
			try {
				numBotones = Integer.parseInt(tNumero.getText());
			} catch (NumberFormatException errorNum) {
				JOptionPane.showMessageDialog(this, "Debe ser un número entero positivo pls");
			}
			
			if (numBotones < 0) {
				JOptionPane.showMessageDialog(this, "Debe ser un número entero positivo pls");
			}
			else {
				botones = new JButton[numBotones];
				for (int i = 0; i < numBotones; i++) {
					numeroActual = String.valueOf(i + 1);
					botones[i] = crearBoton(numeroActual);
					pBotonesNuevos.add(botones[i]);
				}
				pBotonesNuevos.revalidate();
				pBotonesNuevos.repaint();
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent evento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent evento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent evento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent evento) {

		if (botones != null) {
			for (int i = 0; i < botones.length; i++) {
				if (evento.getSource() == botones[i]) {
					taBotonPulsado.setText(botones[i].getText());
					i = botones.length + 1;
				}
			}
			
			
		}
		
		
	}

	@Override
	public void mouseReleased(MouseEvent evento) {
		
		taBotonPulsado.setText(null);
	}
}
