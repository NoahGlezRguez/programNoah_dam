package ejercicio;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel {	
	
	public static void crearPanel(JPanel panel, JLabel etiqueta) {
		
		panel.setLayout(new FlowLayout());
		panel.add(etiqueta);
	}
	
	public static void crearPanel(JPanel panel, JLabel etiqueta, JTextField texto) {
		
		panel.setLayout(new FlowLayout());
		panel.add(etiqueta);
		panel.add(texto);
	}
	
	public static void crearPanel(JPanel panel, JLabel etiqueta, Color colorDeFondo) {
		
		panel.add(etiqueta);
		panel.setBackground(colorDeFondo);
		
	}
	
	public static void crearPanel(JPanel panel, JLabel etiqueta, JTextField texto, JButton boton) {
		
		panel.setLayout(new FlowLayout());
		panel.add(etiqueta);
		panel.add(texto);
		panel.add(boton);
	}
	
	public static void crearPanel(JPanel panel, JButton boton1, JButton boton2, JButton boton3, Color color) {
		
		panel.setLayout(new FlowLayout());
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.setBackground(color);
	}
	
}
