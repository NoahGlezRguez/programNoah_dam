package ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Ventana4 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private ImageIcon foto;
	private String[] rutaFotos = {"src/ejercicio4/images/bizkaia.jpg",
									"src/ejercicio4/images/gipuzkoa.jpg",
									"src/ejercicio4/images/araba.jpg",
									"src/ejercicio4/images/nafarroa.jpg",
									"src/ejercicio4/images/lapurdi.jpg",
									"src/ejercicio4/images/zuberoa.jpg"};
	private JLabel lFoto;
	
	private JButton bPrimera;
	private JButton bAnterior;
	private JButton bSiguiente;
	private JButton bUltima;
	
	public Ventana4() {
		setearPanelPrincipal();
	}

	private void setearPanelPrincipal() {
		
		JLabel lTitulo1;
		JLabel lTitulo2;
		JLabel lTitulo3;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 1040, 733);
		panelPrincipal = new JPanel();
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		this.setTitle("Euskal Herria");
		
		lTitulo1 = new JLabel("Eusk");
		lTitulo1.setForeground(new Color(204, 0, 0));
		lTitulo1.setVerticalAlignment(SwingConstants.TOP);
		lTitulo1.setHorizontalAlignment(SwingConstants.CENTER);
		lTitulo1.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 50));
		lTitulo1.setBounds(337, 11, 124, 40);
		panelPrincipal.add(lTitulo1);
		
		lTitulo2 = new JLabel("al He");
		lTitulo2.setForeground(new Color(51, 153, 0));
		lTitulo2.setVerticalAlignment(SwingConstants.TOP);
		lTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
		lTitulo2.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 50));
		lTitulo2.setBounds(443, 11, 138, 40);
		panelPrincipal.add(lTitulo2);
		
		lTitulo3 = new JLabel("rria");
		lTitulo3.setForeground(new Color(204, 0, 0));
		lTitulo3.setVerticalAlignment(SwingConstants.TOP);
		lTitulo3.setHorizontalAlignment(SwingConstants.CENTER);
		lTitulo3.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 50));
		lTitulo3.setBounds(561, 11, 108, 40);
		panelPrincipal.add(lTitulo3);
		
		foto = new ImageIcon(rutaFotos[0]);
		
		lFoto = new JLabel(foto);
		lFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lFoto.setBounds(32, 71, 960, 536);
		panelPrincipal.add(lFoto);
		
		
		setBotones();
	}
	
	private void setBotones() {
		
		bPrimera = new JButton("Primera");
		bPrimera.setVerticalAlignment(SwingConstants.BOTTOM);
		bPrimera.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 30));
		bPrimera.setBounds(32, 618, 220, 52);
		panelPrincipal.add(bPrimera);
		
		bAnterior = new JButton("Anterior");
		bAnterior.setVerticalAlignment(SwingConstants.BOTTOM);
		bAnterior.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 30));
		bAnterior.setBounds(273, 618, 220, 52);
		panelPrincipal.add(bAnterior);
		
		bSiguiente = new JButton("Siguiente");
		bSiguiente.setVerticalAlignment(SwingConstants.BOTTOM);
		bSiguiente.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 30));
		bSiguiente.setBounds(531, 618, 220, 52);
		panelPrincipal.add(bSiguiente);
		
		bUltima = new JButton("Última");
		bUltima.setVerticalAlignment(SwingConstants.BOTTOM);
		bUltima.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 30));
		bUltima.setBounds(772, 618, 220, 52);
		panelPrincipal.add(bUltima);
		
		bPrimera.addActionListener(this);
		bAnterior.addActionListener(this);
		bSiguiente.addActionListener(this);
		bUltima.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if (evento.getSource() == bPrimera) {
			cambiarFoto(0);
			bPrimera.setEnabled(false);
			bAnterior.setEnabled(false);
			bSiguiente.setEnabled(true);
			bUltima.setEnabled(true);
		}
		else if (evento.getSource() == bAnterior) {
			
			if (foto.getDescription().equals(rutaFotos[1])) {
				cambiarFoto(0);
				bPrimera.setEnabled(false);
				bAnterior.setEnabled(false);
			}
			else if (foto.getDescription().equals(rutaFotos[rutaFotos.length - 1])) {
				cambiarFoto(-1);
				bSiguiente.setEnabled(true);
				bUltima.setEnabled(true);
			}
			else {
				cambiarFoto(-1);
			}
		}
		else if (evento.getSource() == bSiguiente) {
			
			if (foto.getDescription().equals(rutaFotos[rutaFotos.length - 2])) {
				cambiarFoto(1);
				bSiguiente.setEnabled(false);
				bUltima.setEnabled(false);
			}
			else if (foto.getDescription().equals(rutaFotos[0])) {
				cambiarFoto(1);
				bAnterior.setEnabled(true);
				bPrimera.setEnabled(true);
			}
			else {
				cambiarFoto(1);
			}
		}
		else if (evento.getSource() == bUltima) {
			cambiarFoto(2);
			bSiguiente.setEnabled(false);
			bUltima.setEnabled(false);
			bAnterior.setEnabled(true);
			bPrimera.setEnabled(true);
		}
	}
	
	private void cambiarFoto(int operacion) {
		
		int			indice = obtenerIndiceRuta();
		
		switch (operacion) {
			case 0:
				foto = new ImageIcon(rutaFotos[0]);
				break;
			case -1:
				indice--;
				foto = new ImageIcon(rutaFotos[indice]);
				break;
			case 1:
				indice++;
				foto = new ImageIcon(rutaFotos[indice]);
				break;
			case 2:
				foto = new ImageIcon(rutaFotos[rutaFotos.length - 1]);
				break;		
		}

		lFoto.setIcon(foto);
		panelPrincipal.add(lFoto);
	}
	
	private int obtenerIndiceRuta() {
		
		String 	rutaActual = foto.getDescription();
		int		indice = -1;
		
		for (int i = 0; i < rutaFotos.length; i++) {
			
			if(rutaActual.equals(rutaFotos[i])) {
				indice = i;
			}
		}
		
		return (indice);
	}
	
}
